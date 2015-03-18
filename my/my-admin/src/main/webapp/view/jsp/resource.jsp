<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <!-- Title and other stuffs -->
  <title>资源管理</title> 
  <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
  <meta name="author" content="">
  <%@include file="inc/css.html" %>
  <style>
  .fade{
 
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
        <h2 class="pull-left"><i class="icon-table"></i> 资源管理</h2>
        <!-- Breadcrumb -->
        <div class="bread-crumb pull-right">
          <a href="index.html"><i class="icon-home"></i>首页</a> 
          <!-- Divider -->
          <span class="divider">/</span> 
          <a href="#" class="bread-current">资源管理</a>
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
                <div class="widget-head">
                  <div class="pull-left">
                  <button class="btn btn-xs btn-primary" data-target="#myModal"  data-toggle="modal" data-backdrop="static" ><!-- data-remote="resource/create" -->
                  	<i class="icon-plus"></i>添加资源
                  	</button>
                  </div>
                 <!--  <div class="widget-icons pull-right">
                    <a href="#" class="wminimize"><i class="icon-chevron-up"></i></a> 
                    <a href="#" class="wclose"><i class="icon-remove"></i></a>
                  </div>  --> 
                  <div class="clearfix"></div>
                </div>
                  <div class="widget-content">
                    <table class="table table-striped table-bordered table-hover">
                      <thead>
                        <tr>
                          <th>#</th>
                          <th>名称</th>
                          <th>链接</th>
                          <th>所属资源</th>
                          <th>类型</th>
                          <th>状态</th>
                          <th>操作</th>
                        </tr>
                      </thead>
                      <tbody>
						<c:forEach items="${resources}" var="item" varStatus="status">
                        <tr>
                          <td align="center">${status.index+1}</td>
                          <td>${item.resourceName}</td>
                          <td>${item.resourcePath}</td>
                          <td>${item.parentId}</td>
                          <td>
                          	<c:if test="${item.resourceType == '0'}">菜单</c:if>
                          	<c:if test="${item.resourceType == '1'}">按钮</c:if>
                          </td>
                          <td><span class="label ${item.enabled=='1'?'label-success':'label-default' }">Active</span></td>
                          <td>
                              <button class="btn btn-xs btn-success" data-id='${item.resourceId}'><i class="icon-ok"></i> </button>
                              <button class="btn btn-xs btn-warning"  data-id='${item.resourceId}' data-target="#myModal"  data-opt="modify"><i class="icon-pencil"></i> </button>
                              <button class="btn btn-xs btn-danger"  data-id='${item.resourceId}'><i class="icon-remove"></i> </button>
                          </td>
                        </tr>
						</c:forEach>
                      </tbody>
                    </table>
                    <div class="widget-foot">
                        <ul class="pagination pull-right">
                          <li><a href="#">Prev</a></li>
                          <li><a href="#">1</a></li>
                          <li><a href="#">2</a></li>
                          <li><a href="#">3</a></li>
                          <li><a href="#">4</a></li>
                          <li><a href="#">Next</a></li>
                        </ul>
                      <div class="clearfix"></div> 
                    </div>
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
   <!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" 
   aria-labelledby="myModalLabel" aria-hidden="true">
   <div class="modal-dialog">
      <div class="modal-content">
         <div class="modal-header">
            <button type="button" class="close"  data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">
               添加资源
            </h4>
         </div>
         <div class="modal-body">
                    <!-- Form starts.  -->
                     <form class="form-horizontal" role="form" action="resource/create" method="post" id="resouceForm">
                                <input type="hidden"  name="resourceId" value="">
                                <div class="form-group">
                                  <label class="col-lg-4 control-label">名称</label>
                                  <div class="col-lg-8">
                                    <input type="text" class="form-control" placeholder="名称" name="resourceName">
                                  </div>
                                </div>
                                <div class="form-group">
                                  <label class="col-lg-4 control-label">父资源</label>
                                  <div class="col-lg-8">
                                    <select class="form-control" name="parentId" id="parentId">
                                    </select>
                                  </div>
                                </div>    
                                <div class="form-group">
                                  <label class="col-lg-4 control-label">类型</label>
                                  <div class="col-lg-8">
                                    <select class="form-control" name="resourceType" id="resourceType">
                                      <option value="0">菜单</option>
                                      <option value="1">按钮</option>
                                    </select>
                                  </div>
                                </div>     
                                <div class="form-group">
                                  <label class="col-lg-4 control-label">链接</label>
                                  <div class="col-lg-8">
                                    <input type="text" class="form-control" placeholder="链接" name="resourcePath">
                                  </div>
                                </div>
                                <div class="form-group">
                                  <label class="col-lg-4 control-label">描述</label>
                                  <div class="col-lg-8">
                                    <textarea class="form-control" rows="3" placeholder="描述" name="resourceDesc"></textarea>
                                  </div>
                                </div>    
                              </form>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            <button type="button" class="btn btn-primary submit" data-target="#myModal">提交更改</button>
         </div>
      </div><!-- /.modal-content -->
</div><!-- /.modal --></div>
</div>
<!-- Content ends -->
  <%@include file="inc/footer.jsp" %>
<!-- Scroll to top -->
<span class="totop"><a href="#"><i class="icon-chevron-up"></i></a></span> 
  <%@include file="inc/js.html" %>
<script>
var menuPos = 2;
$(function(){
	loadResources();
	$("#myModal").on("hidden.bs.modal", function() { 
		//$(this).removeData("bs.modal");
		$(this).find("form")[0].reset();
	});
	$('#myModal').on('show.bs.modal', function () {
		var _self = $(this);
		/* $(this).find('.modal-dialog').css({  
	        'margin-top': function () { 
	        	var _scrollHeight = $(document).scrollTop(), // 获取当前窗口距离页面顶部高度
	        	_windowHeight = $(window).height(); // 获取当前窗口高度
	            var _modalHeight = _self.height();  
	        	//alert(_windowHeight +":"+ _modalHeight+";" + _scrollHeight);
	        	_posTop =_scrollHeight;
	            return _posTop;  
	        }  
	    }); */
	})
	$('.widget .btn').click(modify);
	$('.modal .submit').click(submit);
});
function modify(){
	var id = $(this).attr("data-id");
	var target = $(this).attr("data-target");
	var opt  = $(this).attr("data-opt");
	if(opt == "modify"){
		$.ajax({
			url: "resource/info?id="+id,
			dataType:"json",
			success:function(data){
				if(data.ok){
					var res = data.resource;
					$("input[name='resourceId']").val(res.resourceId);
					$("input[name='resourceName']").val(res.resourceName);
					$("input[name='resourcePath']").val(res.resourcePath);
				}
			}
		});
		//$("#resouceForm").form("load","resouce/info?id="+id);
		$(target).modal('show');
	}
}
function loadResources(){
	$("#parentId").load("nav",function(data){
		data = eval('(' + data + ')');
		var option = "";
		$(this).html("");
		//$(this).append("<option value=''>请选择</option>");
		for(i=0;i<data.menus.length;i++){
			var menu = data.menus[i];
			$(this).append("<option value='"+menu.resourceId+"'> -- "+menu.resourceName+" -- </option>");
			var subMenu = initSubMenu(menu.subResources);
			$(this).append(subMenu);
		}
	});
}
function  initSubMenu(menus){
	var result = "";
	if(menus.length>0){
		for(i=0;i<menus.length;i++){
			var menu = menus[i];
			result += ("<option value='"+menu.resourceId+"'> &nbsp;&nbsp;&nbsp;&nbsp;"+menu.resourceName+" </option>");
			var subMenu = initSubMenu(menu.subResources);
			result +=subMenu;
		}
	}
	return result;
}
function submit(){
	var id = $(this).attr("data-target")
	var modal = $(id);
	var form = modal.find("form");
	$.ajax({
		type: 'POST',
		url: "resource/create",
		dataType:"json",
		data: form.serializeArray(),
		success:function(data){
			if(data.ok){
				modal.modal("hide");
				loadResources();
			}
		}
	});
}
</script>
</body>
</html>