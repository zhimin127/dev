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
  <%@include file="common/inc.html" %>
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
          <a href="index.html"><i class="icon-home"></i> Home</a> 
          <!-- Divider -->
          <span class="divider">/</span> 
          <a href="#" class="bread-current">Dashboard</a>
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
                  <div class="pull-left">Tables</div>
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
                          <th>#</th>
                          <th>Name</th>
                          <th>Location</th>
                          <th>Date</th>
                          <th>Type</th>
                          <th>Status</th>
                          <th>Control</th>
                        </tr>
                      </thead>
                      <tbody>
						<c:forEach items="${resources}" var="item" varStatus="status">
                        <tr>
                          <td align="center">${status.index+1}</td>
                          <td>${item.resourceName}</td>
                          <td>${item.resourcePath}</td>
                          <td>23/12/2012</td>
                          <td>${item.resourceType}</td>
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

<!-- Footer starts -->
<footer>
  <div class="container">
    <div class="row">
      <div class="col-md-12">
            <!-- Copyright info -->
            <p class="copy">Copyright &copy; 2012 | <a href="#">Your Site</a> </p>
      </div>
    </div>
  </div>
</footer> 	

<!-- Footer ends -->

<!-- Scroll to top -->
<span class="totop"><a href="#"><i class="icon-chevron-up"></i></a></span> 

<!-- JS -->
<script src="static/js/jquery.js"></script> <!-- jQuery -->
<script src="static/js/jquery-migrate-1.1.1.min.js"></script> <!-- jQuery -->
<script src="static/scripts/my.nav.js"></script><!-- Navigation -->
<script src="static/js/bootstrap.js"></script> <!-- Bootstrap -->
<script src="static/js/jquery-ui-1.9.2.custom.min.js"></script> <!-- jQuery UI -->
<script src="static/js/fullcalendar.min.js"></script> <!-- Full Google Calendar - Calendar -->
<script src="static/js/jquery.rateit.min.js"></script> <!-- RateIt - Star rating -->
<script src="static/js/jquery.prettyPhoto.js"></script> <!-- prettyPhoto -->

<!-- jQuery Flot -->
<script src="static/js/excanvas.min.js"></script>
<script src="static/js/jquery.flot.js"></script>
<script src="static/js/jquery.flot.resize.js"></script>
<script src="static/js/jquery.flot.pie.js"></script>
<script src="static/js/jquery.flot.stack.js"></script>

<!-- jQuery Notification - Noty -->
<script src="static/js/jquery.noty.js"></script> <!-- jQuery Notify -->
<script src="static/js/themes/default.js"></script> <!-- jQuery Notify -->
<script src="static/js/layouts/bottom.js"></script> <!-- jQuery Notify -->
<script src="static/js/layouts/topRight.js"></script> <!-- jQuery Notify -->
<script src="static/js/layouts/top.js"></script> <!-- jQuery Notify -->
<!-- jQuery Notification ends -->

<script src="static/js/sparklines.js"></script> <!-- Sparklines -->
<script src="static/js/jquery.cleditor.min.js"></script> <!-- CLEditor -->
<script src="static/js/bootstrap-datetimepicker.min.js"></script> <!-- Date picker -->
<script src="static/js/jquery.uniform.min.js"></script> <!-- jQuery Uniform -->
<script src="static/js/bootstrap-switch.min.js"></script> <!-- Bootstrap Toggle -->
<script src="static/js/filter.js"></script> <!-- Filter for support page -->
<script src="static/js/custom.js"></script> <!-- Custom codes -->
<script src="static/js/charts.js"></script> <!-- Charts & Graphs -->

<script>
var menuPos = 2;
var baseURL = "/admin"
</script>
</body>
</html>