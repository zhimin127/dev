<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <!-- Title and other stuffs -->
  <title>资源管理</title> 
  <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
  <meta name="author" content="">
  <%@include file="common/inc_css.html" %>
</head>
<body>
<c:import url="common/header.jsp">
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
                  <div class="pull-left"><button class="btn btn-xs btn-primary"><i class="icon-plus"></i>添加资源</button></div>
                  <div class="widget-icons pull-right">
                    <a href="#" class="wminimize"><i class="icon-chevron-up"></i></a> 
                    <a href="#" class="wclose"><i class="icon-remove"></i></a>
                  </div>  
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
</div>
<!-- Content ends -->
  <%@include file="common/footer.jsp" %>
<!-- Scroll to top -->
<span class="totop"><a href="#"><i class="icon-chevron-up"></i></a></span> 
  <%@include file="common/inc_js.html" %>
<script>
var menuPos = 2;
var baseURL = "/admin"
</script>
</body>
</html>