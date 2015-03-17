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
  padding: 150px 0 0 0px;
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
                          <th>序号</th>
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
                              <button class="btn btn-xs btn-success"><i class="icon-ok"></i> </button>
                              <button class="btn btn-xs btn-warning"><i class="icon-pencil"></i> </button>
                              <button class="btn btn-xs btn-danger"><i class="icon-remove"></i> </button>
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
            <button type="button" class="close" 
               data-dismiss="modal" aria-hidden="true">
                  &times;
            </button>
            <h4 class="modal-title" id="myModalLabel">
               添加资源
            </h4>
         </div>
         <div class="modal-body">
            
                    <!-- Form starts.  -->
                     <form class="form-horizontal" role="form" action="resource/create" method="post">
                                <div class="form-group">
                                  <label class="col-lg-4 control-label">名称</label>
                                  <div class="col-lg-8">
                                    <input type="text" class="form-control" placeholder="名称">
                                  </div>
                                </div>
                                <div class="form-group">
                                  <label class="col-lg-4 control-label">类型</label>
                                  <div class="col-lg-8">
                                    <select class="form-control">
                                      <option value="0">菜单</option>
                                      <option value="1">按钮</option>
                                    </select>
                                  </div>
                                </div>     
                                <div class="form-group">
                                  <label class="col-lg-4 control-label">链接</label>
                                  <div class="col-lg-8">
                                    <input type="text" class="form-control" placeholder="链接">
                                  </div>
                                </div>
                                <div class="form-group">
                                  <label class="col-lg-4 control-label">描述</label>
                                  <div class="col-lg-8">
                                    <textarea class="form-control" rows="3" placeholder="描述"></textarea>
                                  </div>
                                </div>    
                                <div class="form-group">
                                  <label class="col-lg-4 control-label">Checkbox</label>
                                  <div class="col-lg-8">
                                    <label class="checkbox-inline">
                                      <input type="checkbox" id="inlineCheckbox1" value="option1"> 1
                                    </label>
                                    <label class="checkbox-inline">
                                      <input type="checkbox" id="inlineCheckbox2" value="option2"> 2
                                    </label>
                                    <label class="checkbox-inline">
                                      <input type="checkbox" id="inlineCheckbox3" value="option3"> 3
                                    </label>
                                  </div>
                                </div>
                                <div class="form-group">
                                  <label class="col-lg-4 control-label">Radio Box</label>
                                  <div class="col-lg-8">
                                    <div class="radio">
                                      <label>
                                        <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
                                        Option one is this and that&mdash;be sure to include why it's great
                                      </label>
                                    </div>
                                    <div class="radio">
                                      <label>
                                        <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
                                        Option two can be something else and selecting it will deselect option one
                                      </label>
                                    </div>
                                  </div>
                                </div>
                              </form>
         </div>
         <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">关闭
            </button>
            <button type="button" class="btn btn-primary">
               提交更改
            </button>
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
	initWinPosition("#myModal");
	$("#myModal").on("hidden.bs.modal", function() { $(this).removeData("bs.modal"); });
	$('.pull-left .btn').click(function(){
		
	});
});
function initWinPosition(winId){
	var _scrollHeight = $(document).scrollTop(), // 获取当前窗口距离页面顶部高度
	_windowHeight = $(window).height(), // 获取当前窗口高度
	_windowWidth = $(window).width(), // 获取当前窗口宽度
	_popupHeight = $(winId).height(), // 获取弹出层高度
	_popupWeight = $(winId).width();// 获取弹出层宽度
	_posiTop = (_windowHeight - _popupHeight) / 2 + _scrollHeight;
	_posiLeft = (_windowWidth - _popupWeight) / 2;
	$(winId).css({'padding-top':_posiTop});
}
</script>
</body>
</html>