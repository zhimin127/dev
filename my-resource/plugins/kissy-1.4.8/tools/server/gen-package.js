/**
 * gen package definition for develop mode
 * @author yiminghe@gmail.com
 */
var cwd = normalizeSlash(process.cwd());
var path = require('path');
var startDir = normalizeSlash(path.resolve(cwd, 'src') + '/');
var saveTo = startDir + 'package.js';
var base = '/kissy/src/';
var fs = require('fs');
var suffixLen = '/src'.length;
//noinspection JSUnresolvedVariable
var currentDir = __dirname;
var S = global.KISSY = global.S = require(cwd + '/build/kissy-nodejs');

function normalizeSlash(str) {
    return str.replace(/\\/g, '/');
}

function collectSrcDir(dir, allSrc) {
    var files = fs.readdirSync(dir);
    files.forEach(function (f) {
        var c = dir + f;
        var state = fs.statSync(c);
        if (state.isDirectory()) {
            if (f == 'src') {
                allSrc.push(c);
            } else if (f != 'coverage') {
                collectSrcDir(c + '/', allSrc);
            }
        }
    });
}

var js_beautify = require('js-beautify').js_beautify;

function my_js_beautify(str) {
    var opts = {"indent_size": "4", "indent_char": " ",
        "preserve_newlines": true, "brace_style": "collapse",
        "keep_array_indentation": false, "space_after_anon_function": true};
    return js_beautify(str, opts);
}

var allSrc = [];

collectSrcDir(startDir, allSrc);

var mod = {};

allSrc.forEach(function (v) {
    v = '/kissy/' + v.replace(cwd + '/', '');
    var name = v.substring(base.length, v.length - suffixLen);
    name = name.replace(/sub-modules\//g, '');
    mod[name] = {
        base: v + '/' + path.basename(name),
        ignorePackageNameInUri: 1
    };
});

// write server config

var serverConfig = fs.readFileSync(currentDir + '/server.json', {
    encoding: 'utf-8'
});

var code = "/**\n" +
    "    Generated By gen-package.\n" +
    "    For dev mode only!\n" +
    "*/\n" +
    "var SERVER_CONFIG=" + serverConfig + ";\n" +
    "KISSY.config('tag',KISSY.now());" +
    "var loc = new KISSY.Uri(location.href);\n" +
    "if (!loc.getQuery().has('build')&&!loc.getQuery().has('min')) {\n" +
    "KISSY.config('packages', \n" +
    JSON.stringify(mod) +
    ');}\n';

fs.writeFileSync(saveTo, my_js_beautify(code));

console.log('saved to: ' + saveTo);







