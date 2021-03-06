﻿$(function () {
	getMenus();
	initMacSidebar();
	//initLeftMenu();
})
var _menus = null;
// 获得菜单
function getMenus(){
	$.ajax({
		url : "nav",
		type : "post",
		async : false,
		success : function(data) {
			//alert(data)
			data = eval('(' + data + ')');
			_menus = data.menus[0];
		}
	});
}
// 初始化左侧
function initMacSidebar(){
	sidebar = jQuery(".sidebar");
	if (typeof _menus != 'undefined') {
		var title = "<div class='sidebar-dropdown'><a href='#'>" + _menus.name + "</a></div>";
		var nav = '<ul id="nav">';
		
		jQuery.each(_menus.children, function(i, n) {
			var style_class = n.style.css;
			if(n.children.length > 0){
				style_class += " has_sub";
			}
			var menu = '<li class="' + style_class + '">';
			/*if (!isNotBlank(n.Path)) {
				menu += n.Name;
			} else */{
				var url =  n.url;
				if(!isNotBlank(n.url) || n.url == "#") {
					url = 'javascript:void(0);'
				}else{
					url = url.substring(1);
				}
				var _class = '';
				if(typeof menuPos != 'undefined' && i == menuPos){
					_class = ' class="open subdrop"'
				}
				menu += '<a href="' + url + '"'+_class+'>';
				var icon = n.style.iconCss;
				if (isNotBlank(icon)) {
					menu += '<i class="' + icon + '"></i>';
				}
				menu +=  n.name + '';
			}
			var subMenu = '</a>';
			if (n.children.length > 0) {
				subMenu = '<span class="pull-right"><i class="icon-chevron-right"></i></span></a>';
				if(typeof subMenuPos != 'undefined' && i == menuPos){
					subMenu += '<ul style="display: block;">';
				}else{
					subMenu += '<ul>'
				}
				jQuery.each(n.children, function(j, o) {
					if(typeof subMenuPos != 'undefined' && j == subMenuPos){
						subMenu += '<li class="active">';
					}else{
						subMenu += '<li>';
					}
					subMenu += '<a ref="' + o.id + '" href="' + o.url.substring(1) + '" rel="" ><span class="">' + o.name + '</span></a></li>';
				})
				subMenu += '</ul>';
			}
			//
			nav += menu + subMenu + '</li>';
		});
		nav += '</ul>'
		sidebar.html(title+nav);
		
	}
	// 选中第一个
}

function getStyle(styles,name){
	if(styles.length > 0){
		var style = styles[0][name];
		if(isNotBlank(style)){
			return styles[0][name];
		}
	}
	return '';
}
//
function isNotBlank(str){
	if (typeof str != 'undefined' && str != null && trim(str) != '') {
		return true;
	}
	return false;
}
//删除左右两端的空格
function trim(str){ 
    return str.replace(/(^\s*)|(\s*$)/g, "");
}

function initLeftMenu() {
	// jQuery(".leftmenu").html("");
	// init menu

	if (typeof _menus != 'undefined') {
		var nav = '<ul class="nav nav-tabs nav-stacked">';
		nav += '<li class="' + _menus.style + '">' + _menus.name + '</li>';
		jQuery.each(_menus.subMenu, function(i, n) {
			var menu = '<li class="' + n.style + '">';
			if (n.url == null || n.url == '') {
				menu += n.name;
			} else {
				menu += '<a href="' + n.url + '">';
				if (n.icon != null && n.icon != '') {
					menu += '<span class="' + n.icon + '"></span>';
				}
				menu+=  n.name + '</a>'
			}

			var subMenu = '';
			if (n.subMenu.length > 0) {
				subMenu += '<ul>';
				jQuery.each(n.subMenu, function(j, o) {
					subMenu += '<li><div><a ref="' + o.id + '" href="#" rel="' + o.url + '" ><span class="">' + o.name + '</span></a></div></li>';
				})
				subMenu += '</ul>';
			}
			//
			nav += menu + subMenu + '</li>';
		});
		nav += '</ul>'
		jQuery('.leftmenu').html(nav);
	}

	jQuery('.leftmenu li a').click(function() {
		// var tabTitle = jQuery(this).children('.nav').text();
		var subMenu = jQuery(this).parent().children('ul');
		if (typeof subMenu == 'undefined') {

			var url = jQuery(this).attr("rel");
			var menuid = jQuery(this).attr("ref");
			var icon = getIcon(menuid, icon);

			// addTab(tabTitle, url, icon);
			jQuery('.leftmenu li div').removeClass("selected");
			jQuery(this).parent().addClass("selected");
		} else {
			jQuery(this).next("ul").slideToggle().siblings("ul").slideUp();
			// subMenu.show();
		}
	}).hover(function() {
		// jQuery(this).parent().addClass("hover");
	}, function() {
		// jQuery(this).parent().removeClass("hover");
	});
	// 选中第一个
}

// 弹出信息窗口 title:标题 msgString:提示信息 msgType:信息类型 [error,info,question,warning]
function msgShow(title, msgString, msgType) {
	$.messager.alert(title, msgString, msgType);
}
