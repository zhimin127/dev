<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <!-- Title and other stuffs -->
  <title>角色管理</title> 
  <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
  <meta name="author" content="">
  <%@include file="inc/css.html" %>
  <style>
.modal-wrapper{
/* PLAY THE WITH THE VALUES TO SEE GET THE DESIRED EFFECT */
}
#authModal .widget{
	margin: 0 0 0 0;
}
  </style>
</head>
<body>
<c:import url="inc/header.jsp">
	<c:param name="pos" value="0"></c:param>
</c:import>
<!-- Main content starts -->
<div class="content">
  	<!-- Sidebar -->
    <div class="sidebar"></div>
    <!-- Sidebar ends -->
  	<!-- Main bar -->
  	<div class="mainbar">
      <!-- Page heading -->
      <div class="page-head">
        <h2 class="pull-left"><i class="icon-table"></i> 角色管理</h2>
        <!-- Breadcrumb -->
        <div class="bread-crumb pull-right">
          <a href="index.html"><i class="icon-home"></i>首页</a> 
          <!-- Divider -->
          <span class="divider">/</span> 
          <a href="#" class="bread-current">角色管理</a>
        </div>
        <div class="clearfix"></div>
      </div>
      <!-- Page heading ends -->
	    <!-- Matter -->
	    <div class="matter">
        <div class="container">
          <!-- Table -->
            <div class="row">
              <div class="col-md-12">
                <div class="widget">
                  <div class="widget-content">
                <table id="grid-resources" class="table table-hover table-striped table-bordered">
                    <thead>
                        <tr>
                            <th data-column-id="id" data-type="id">ID</th><!-- numeric -->
                            <th data-column-id="name">名称</th>
                            <th data-column-id="mark"  data-order="desc">唯一标识</th>
                            <th data-column-id="description">描述</th>
                            <th data-column-id="enabled" data-formatter="enabled" >状态</th>
                            <th data-column-id="commands" data-formatter="commands" data-sortable="false">操作</th>
                        </tr>
                    </thead>
                </table>
                  </div>
                </div>
              </div>
            </div>
        </div>
		  </div>
		<!-- Matter ends -->
    </div>
   <!-- Mainbar ends -->	    	
   <div class="clearfix"></div>
   <!-- 角色toolBar  -->
 <div class="pull-left" id="toolBar">
       <button class="btn btn-default" data-target="#roleModal"  data-toggle="modal" data-backdrop="static" >
          <i class="icon-plus"></i> 添加角色
      </button>
       <button class="btn btn-default" data-target="#authModal"  data-toggle="modal" data-backdrop="static" data-remote="role/auth.html">
          <i class="icon-list-alt"></i> 分配权限
      </button>
      <!-- <a href="role/auth.html" class="btn btn-lg btn-primary" data-toggle="modal" data-target="#authModal">Launch Demo Modal</a> -->
</div>
   <!-- 角色 模态框（Modal） -->
<div class="modal fade modal-wrapper" id="roleModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close"  data-dismiss="modal" aria-hidden="true">&times;</button>
            <h4 class="modal-title" id="myModalLabel">添加角色</h4>
         </div>
         <div class="modal-body">
                    <!-- Form starts.  -->
                     <form class="form-horizontal" role="form" action="resource/create" method="post" id="resouceForm">
                     			<input type="hidden" name="id">
                                <div class="form-group">
                                  <label class="col-lg-4 control-label">角色名称</label>
                                  <div class="col-lg-8">
                                    <input type="text" class="form-control" placeholder="角色名称" name="name">
                                  </div>
                                </div>
                                <div class="form-group">
                                  <label class="col-lg-4 control-label">唯一标识</label>
                                  <div class="col-lg-8">
                                    <input type="text" class="form-control" placeholder="唯一标识" name="mark">
                                  </div>
                                </div>
                                <div class="form-group">
                                  <label class="col-lg-4 control-label">角色状态</label>
                                  <div class="col-lg-8">
                                    <select class="form-control" name="enabled">
                                      <option value="1">启用</option>
                                      <option value="0">停用</option>
                                    </select>
                                  </div>
                                </div>
                                <div class="form-group">
                                  <label class="col-lg-4 control-label">描述</label>
                                  <div class="col-lg-8">
                                    <textarea class="form-control" rows="3" placeholder="描述" name="description"></textarea>
                                  </div>
                                </div>    
                              </form>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            <button type="button" class="btn btn-primary submit" data-target="#roleModal">提交更改</button>
         </div>
      </div><!-- /.modal-content -->
</div><!-- /.modal -->
</div>
</div>
   <!-- 角色 模态框（Modal） -->
    <!-- Modal HTML -->
    <div id="authModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <!-- Content will be loaded here from "remote.php" file -->
            </div>
        </div>
    </div>
    
<!-- Content ends -->
  <%@include file="inc/footer.jsp" %>
<!-- Scroll to top -->
<span class="totop"><a href="#"><i class="icon-chevron-up"></i></a></span> 
  <%@include file="inc/js.html" %>
<script>
var menuPos = 1;
var subMenuPos = 1;
var resourcesGrid = null;
$(function(){
	resourcesGrid = initGrid();
	loadResourcesSelect();
	$(".modal").on("hidden.bs.modal", function() { 
		$(this).removeData("bs.modal");
		$(this).find("form")[0].reset();
	});
	$('.modal .submit').click(submit);
});
function info(id){
		var form = $("#roleModal").find("form");
		form.form('load', "role/info?id="+id);
		$("#roleModal").modal('show');
}
var level = 0; 
function loadResourcesSelect(){
	$("#parentId").load("nav/all",function(data){
		data = eval('(' + data + ')');
		var option = "";
		$(this).html("<option value='0'> ---- 请选择 ---- </option>");
		//$(this).append("<option value=''>请选择</option>");
		for(i=0;i<data.menus.length;i++){
			var menu = data.menus[i];
			$(this).append("<option value='"+menu.id+"'> ---- 导航菜单 ---- </option>");
			level = 1;
			var subMenu = initSubMenu(menu.children);
			$(this).append(subMenu);
		}
	});
}
function  initSubMenu(menus){
	var result = "";
	if(menus.length>0){
		for( i = 0; i < menus.length; i++){
			var menu = menus[i];
			var pre = ""
			/* for(j = 0;j<level;j++){
				pre += "&nbsp;&nbsp;&nbsp;&nbsp;";
			} */
			result += ("<option value='"+menu.id+"'> &nbsp;&nbsp;&nbsp;&nbsp;" + pre +menu.name+" </option>");
			/* if(menu.subResources != [] && menu.subResources != "" && menu.subResources != null && menu.subResources.length>0){
				level ++;
				var subMenu =  "";//initSubMenu(menu.subResources);
				result +=subMenu;
			} */
		}
	}
	level --;
	return result;
}
function submit(){
	var modal = $(this).attr("data-target")
	var win = $(modal);
	var form = win.find("form");
	$.ajax({
		type: 'POST',
		url: "role/create",
		dataType:"json",
		data: form.serializeArray(),
		success:function(data){
			if(data.ok){
				win.modal("hide");
				loadResourcesSelect();
				resourcesGrid.bootgrid('reload');
				form.form("clear");
			}
		}
	});
}
function initGrid(){
	var grid = $("#grid-resources").bootgrid({
        //navigation: 1,
	    ajax: true,
		dataType:"json",
	    post: function (){
	        return {
	            id: "1"
	        };
	    },
	    url: "role/list",
	    formatters: {
	    	"enabled":function(column,row){
	    		return ['<span class="label label-danger">Banned</span>','<span class="label label-success">Active</span>'][row.enabled];
	    	},
	        "commands": function(column, row) {
	            return "<button type=\"button\" class=\"btn btn-xs btn-warning command-edit\" data-row-id=\"" + row.id + "\"><i class=\"icon-pencil\"></i></button> " + 
	                "<button type=\"button\" class=\"btn btn-xs btn-danger command-delete\" data-row-id=\"" + row.id + "\"><i class=\"icon-remove\"></i> </button>";
	        }
	    },
	    toolbar:"#toolBar"
	}).on("loaded.rs.jquery.bootgrid", function(){
	    /* Executes after data is loaded and rendered */
	    grid.find(".command-edit").on("click", function(e){
	        //alert("You pressed edit on row: " + $(this).data("row-id"));
	        info($(this).data("row-id"));
	    }).end().find(".command-delete").on("click", function(e){
	        alert("You pressed delete on row: " + $(this).data("row-id"));
	    });
	});
	return grid;
}
</script>
</body>
</html>