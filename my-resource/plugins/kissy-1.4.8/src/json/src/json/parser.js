/*
 Generated by kissy-kison.*/
/*jshint quotmark:false, loopfunc:true, eqeqeq:false, boss:true*/
KISSY.add(function () {
    /* Generated by kison from KISSY */
    var parser = {}, S = KISSY,
        GrammarConst = {
            'SHIFT_TYPE': 1,
            'REDUCE_TYPE': 2,
            'ACCEPT_TYPE': 0,
            'TYPE_INDEX': 0,
            'PRODUCTION_INDEX': 1,
            'TO_INDEX': 2
        };
    var Lexer = function (cfg) {

        var self = this;

        /*
         lex rules.
         @type {Object[]}
         @example
         [
         {
         regexp:'\\w+',
         state:['xx'],
         token:'c',
         // this => lex
         action:function(){}
         }
         ]
         */
        self.rules = [];

        S.mix(self, cfg);

        /*
         Input languages
         @type {String}
         */

        self.resetInput(self.input);

    };
    Lexer.prototype = {
        'constructor': function (cfg) {

            var self = this;

            /*
             lex rules.
             @type {Object[]}
             @example
             [
             {
             regexp:'\\w+',
             state:['xx'],
             token:'c',
             // this => lex
             action:function(){}
             }
             ]
             */
            self.rules = [];

            S.mix(self, cfg);

            /*
             Input languages
             @type {String}
             */

            self.resetInput(self.input);

        },
        'resetInput': function (input) {
            S.mix(this, {
                input: input,
                matched: "",
                stateStack: [Lexer.STATIC.INITIAL],
                match: "",
                text: "",
                firstLine: 1,
                lineNumber: 1,
                lastLine: 1,
                firstColumn: 1,
                lastColumn: 1
            });
        },
        'getCurrentRules': function () {
            var self = this,
                currentState = self.stateStack[self.stateStack.length - 1],
                rules = [];
            currentState = self.mapState(currentState);
            S.each(self.rules, function (r) {
                var state = r.state || r[3];
                if (!state) {
                    if (currentState == Lexer.STATIC.INITIAL) {
                        rules.push(r);
                    }
                } else if (S.inArray(currentState, state)) {
                    rules.push(r);
                }
            });
            return rules;
        },
        'pushState': function (state) {
            this.stateStack.push(state);
        },
        'popState': function () {
            return this.stateStack.pop();
        },
        'getStateStack': function () {
            return this.stateStack;
        },
        'showDebugInfo': function () {
            var self = this,
                DEBUG_CONTEXT_LIMIT = Lexer.STATIC.DEBUG_CONTEXT_LIMIT,
                matched = self.matched,
                match = self.match,
                input = self.input;
            matched = matched.slice(0, matched.length - match.length);
            var past = (matched.length > DEBUG_CONTEXT_LIMIT ? "..." : "") + matched.slice(-DEBUG_CONTEXT_LIMIT).replace(/\n/, " "),
                next = match + input;
            next = next.slice(0, DEBUG_CONTEXT_LIMIT) + (next.length > DEBUG_CONTEXT_LIMIT ? "..." : "");
            return past + next + '\n' + new Array(past.length + 1).join("-") + "^";
        },
        'mapSymbol': function (t) {
            var self = this,
                symbolMap = self.symbolMap;
            if (!symbolMap) {
                return t;
            }
            return symbolMap[t] || (symbolMap[t] = (++self.symbolId));
        },
        'mapReverseSymbol': function (rs) {
            var self = this,
                symbolMap = self.symbolMap,
                i,
                reverseSymbolMap = self.reverseSymbolMap;
            if (!reverseSymbolMap && symbolMap) {
                reverseSymbolMap = self.reverseSymbolMap = {};
                for (i in symbolMap) {
                    reverseSymbolMap[symbolMap[i]] = i;
                }
            }
            if (reverseSymbolMap) {
                return reverseSymbolMap[rs];
            } else {
                return rs;
            }
        },
        'mapState': function (s) {
            var self = this,
                stateMap = self.stateMap;
            if (!stateMap) {
                return s;
            }
            return stateMap[s] || (stateMap[s] = (++self.stateId));
        },
        'lex': function () {
            var self = this,
                input = self.input,
                i,
                rule,
                m,
                ret,
                lines,
                rules = self.getCurrentRules();

            self.match = self.text = "";

            if (!input) {
                return self.mapSymbol(Lexer.STATIC.END_TAG);
            }

            for (i = 0; i < rules.length; i++) {
                rule = rules[i];
                var regexp = rule.regexp || rule[1],
                    token = rule.token || rule[0],
                    action = rule.action || rule[2] || undefined;
                if (m = input.match(regexp)) {
                    lines = m[0].match(/\n.*/g);
                    if (lines) {
                        self.lineNumber += lines.length;
                    }
                    S.mix(self, {
                        firstLine: self.lastLine,
                        lastLine: self.lineNumber + 1,
                        firstColumn: self.lastColumn,
                        lastColumn: lines ? lines[lines.length - 1].length - 1 : self.lastColumn + m[0].length
                    });
                    var match;
                    // for error report
                    match = self.match = m[0];

                    // all matches
                    self.matches = m;
                    // may change by user
                    self.text = match;
                    // matched content utils now
                    self.matched += match;
                    ret = action && action.call(self);
                    if (ret === undefined) {
                        ret = token;
                    } else {
                        ret = self.mapSymbol(ret);
                    }
                    input = input.slice(match.length);
                    self.input = input;

                    if (ret) {
                        return ret;
                    } else {
                        // ignore
                        return self.lex();
                    }
                }
            }

            S.error("lex error at line " + self.lineNumber + ":\n" + self.showDebugInfo());
            return undefined;
        }
    };
    Lexer.STATIC = {
        'INITIAL': 'I',
        'DEBUG_CONTEXT_LIMIT': 20,
        'END_TAG': '$EOF'
    };
    var lexer = new Lexer({
        'rules': [
            [2, /^"(\\"|\\\\|\\\/|\\b|\\f|\\n|\\r|\\t|\\u[0-9a-zA-Z]{4}|[^\\"\x00-\x1f])*"/, 0],
            [0, /^[\t\r\n\x20]/, 0],
            [3, /^,/, 0],
            [4, /^:/, 0],
            [5, /^\[/, 0],
            [6, /^\]/, 0],
            [7, /^\{/, 0],
            [8, /^\}/, 0],
            [9, /^-?\d+(?:\.\d+)?(?:e-?\d+)?/i, 0],
            [10, /^true|false/, 0],
            [11, /^null/, 0],
            [12, /^./, 0]
        ]
    });
    parser.lexer = lexer;
    lexer.symbolMap = {
        '$EOF': 1,
        'STRING': 2,
        'COMMA': 3,
        'COLON': 4,
        'LEFT_BRACKET': 5,
        'RIGHT_BRACKET': 6,
        'LEFT_BRACE': 7,
        'RIGHT_BRACE': 8,
        'NUMBER': 9,
        'BOOLEAN': 10,
        'NULL': 11,
        'INVALID': 12,
        '$START': 13,
        'json': 14,
        'value': 15,
        'object': 16,
        'array': 17,
        'elementList': 18,
        'member': 19,
        'memberList': 20
    };
    parser.productions = [
        [13, [14]],
        [14, [15], function () {
            return this.$1;
        }],
        [15, [2], function () {
            return this.yy.unQuote(this.$1);
        }],
        [15, [9], function () {
            return parseFloat(this.$1);
        }],
        [15, [16], function () {
            return this.$1;
        }],
        [15, [17], function () {
            return this.$1;
        }],
        [15, [10], function () {
            return this.$1 === 'true';
        }],
        [15, [11], function () {
            return null;
        }],
        [18, [15], function () {
            return [this.$1];
        }],
        [18, [18, 3, 15], function () {
            this.$1[this.$1.length] = this.$3;
            return this.$1;
        }],
        [17, [5, 6], function () {
            return [];
        }],
        [17, [5, 18, 6], function () {
            return this.$2;
        }],
        [19, [2, 4, 15], function () {
            return {
                key: this.yy.unQuote(this.$1),
                value: this.$3
            };
        }],
        [20, [19], function () {
            var ret = {};
            ret[this.$1.key] = this.$1.value;
            return ret;
        }],
        [20, [20, 3, 19], function () {
            this.$1[this.$3.key] = this.$3.value;
            return this.$1;
        }],
        [16, [7, 8], function () {
            return {};
        }],
        [16, [7, 20, 8], function () {
            return this.$2;
        }]
    ];
    parser.table = {
        'gotos': {
            '0': {
                '14': 7,
                '15': 8,
                '16': 9,
                '17': 10
            },
            '2': {
                '15': 12,
                '16': 9,
                '17': 10,
                '18': 13
            },
            '3': {
                '19': 16,
                '20': 17
            },
            '18': {
                '15': 23,
                '16': 9,
                '17': 10
            },
            '20': {
                '15': 24,
                '16': 9,
                '17': 10
            },
            '21': {
                '19': 25
            }
        },
        'action': {
            '0': {
                '2': [1, 0, 1],
                '5': [1, 0, 2],
                '7': [1, 0, 3],
                '9': [1, 0, 4],
                '10': [1, 0, 5],
                '11': [1, 0, 6]
            },
            '1': {
                '1': [2, 2, 0],
                '3': [2, 2, 0],
                '6': [2, 2, 0],
                '8': [2, 2, 0]
            },
            '2': {
                '2': [1, 0, 1],
                '5': [1, 0, 2],
                '6': [1, 0, 11],
                '7': [1, 0, 3],
                '9': [1, 0, 4],
                '10': [1, 0, 5],
                '11': [1, 0, 6]
            },
            '3': {
                '2': [1, 0, 14],
                '8': [1, 0, 15]
            },
            '4': {
                '1': [2, 3, 0],
                '3': [2, 3, 0],
                '6': [2, 3, 0],
                '8': [2, 3, 0]
            },
            '5': {
                '1': [2, 6, 0],
                '3': [2, 6, 0],
                '6': [2, 6, 0],
                '8': [2, 6, 0]
            },
            '6': {
                '1': [2, 7, 0],
                '3': [2, 7, 0],
                '6': [2, 7, 0],
                '8': [2, 7, 0]
            },
            '7': {
                '1': [0, 0, 0]
            },
            '8': {
                '1': [2, 1, 0]
            },
            '9': {
                '1': [2, 4, 0],
                '3': [2, 4, 0],
                '6': [2, 4, 0],
                '8': [2, 4, 0]
            },
            '10': {
                '1': [2, 5, 0],
                '3': [2, 5, 0],
                '6': [2, 5, 0],
                '8': [2, 5, 0]
            },
            '11': {
                '1': [2, 10, 0],
                '3': [2, 10, 0],
                '6': [2, 10, 0],
                '8': [2, 10, 0]
            },
            '12': {
                '3': [2, 8, 0],
                '6': [2, 8, 0]
            },
            '13': {
                '3': [1, 0, 18],
                '6': [1, 0, 19]
            },
            '14': {
                '4': [1, 0, 20]
            },
            '15': {
                '1': [2, 15, 0],
                '3': [2, 15, 0],
                '6': [2, 15, 0],
                '8': [2, 15, 0]
            },
            '16': {
                '3': [2, 13, 0],
                '8': [2, 13, 0]
            },
            '17': {
                '3': [1, 0, 21],
                '8': [1, 0, 22]
            },
            '18': {
                '2': [1, 0, 1],
                '5': [1, 0, 2],
                '7': [1, 0, 3],
                '9': [1, 0, 4],
                '10': [1, 0, 5],
                '11': [1, 0, 6]
            },
            '19': {
                '1': [2, 11, 0],
                '3': [2, 11, 0],
                '6': [2, 11, 0],
                '8': [2, 11, 0]
            },
            '20': {
                '2': [1, 0, 1],
                '5': [1, 0, 2],
                '7': [1, 0, 3],
                '9': [1, 0, 4],
                '10': [1, 0, 5],
                '11': [1, 0, 6]
            },
            '21': {
                '2': [1, 0, 14]
            },
            '22': {
                '1': [2, 16, 0],
                '3': [2, 16, 0],
                '6': [2, 16, 0],
                '8': [2, 16, 0]
            },
            '23': {
                '3': [2, 9, 0],
                '6': [2, 9, 0]
            },
            '24': {
                '3': [2, 12, 0],
                '8': [2, 12, 0]
            },
            '25': {
                '3': [2, 14, 0],
                '8': [2, 14, 0]
            }
        }
    };
    parser.parse = function parse(input) {

        var self = this,
            lexer = self.lexer,
            state,
            symbol,
            action,
            table = self.table,
            gotos = table.gotos,
            tableAction = table.action,
            productions = self.productions,
            valueStack = [null],
            stack = [0];

        lexer.resetInput(input);

        while (1) {
            // retrieve state number from top of stack
            state = stack[stack.length - 1];

            if (!symbol) {
                symbol = lexer.lex();
            }

            if (!symbol) {
                S.log("it is not a valid input: " + input, "error");
                return false;
            }

            // read action for current state and first input
            action = tableAction[state] && tableAction[state][symbol];

            if (!action) {
                var expected = [],
                    error;
                if (tableAction[state]) {
                    S.each(tableAction[state], function (_, symbol) {
                        expected.push(self.lexer.mapReverseSymbol(symbol));
                    });
                }
                error = "Syntax error at line " + lexer.lineNumber + ":\n" + lexer.showDebugInfo() + '\n' + "expect " + expected.join(", ");
                S.error(error);
                return false;
            }

            switch (action[GrammarConst.TYPE_INDEX]) {

                case GrammarConst.SHIFT_TYPE:

                    stack.push(symbol);

                    valueStack.push(lexer.text);

                    // push state
                    stack.push(action[GrammarConst.TO_INDEX]);

                    // allow to read more
                    symbol = null;

                    break;

                case GrammarConst.REDUCE_TYPE:

                    var production = productions[action[GrammarConst.PRODUCTION_INDEX]],
                        reducedSymbol = production.symbol || production[0],
                        reducedAction = production.action || production[2],
                        reducedRhs = production.rhs || production[1],
                        len = reducedRhs.length,
                        i = 0,
                        ret,
                        $$ = valueStack[valueStack.length - len]; // default to $$ = $1

                    self.$$ = $$;

                    ret = undefined;

                    for (; i < len; i++) {
                        self["$" + (len - i)] = valueStack[valueStack.length - 1 - i];
                    }

                    if (reducedAction) {
                        ret = reducedAction.call(self);
                    }

                    if (ret !== undefined) {
                        $$ = ret;
                    } else {
                        $$ = self.$$;
                    }

                    if (len) {
                        stack = stack.slice(0, -1 * len * 2);
                        valueStack = valueStack.slice(0, -1 * len);
                    }

                    stack.push(reducedSymbol);

                    valueStack.push($$);

                    var newState = gotos[stack[stack.length - 2]][stack[stack.length - 1]];

                    stack.push(newState);

                    break;

                case GrammarConst.ACCEPT_TYPE:

                    return $$;
            }

        }

        return undefined;

    };
    return parser;
});