<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>PARSd - Patient Search Engine</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
	<script>
	$(document).ready(function(){
		$("#visitForm").hide();
		$("#doctorForm").hide();
		$("#bedForm").hide();
		$("#patient").click(function(){
			$("#patientForm").show();
			$("#visitForm").hide();
			$("#doctorForm").hide();
			$("#bedForm").hide();
		});
		$("#visit").click(function(){
			$("#patientForm").hide();
			$("#visitForm").show();
			$("#doctorForm").hide();
			$("#bedForm").hide();
		});
		$("#bed").click(function(){
			$("#patientForm").hide();
			$("#visitForm").hide();
			$("#doctorForm").hide();
			$("#bedForm").show();
		});
		$("#doctor").click(function(){
			$("#patientForm").hide();
			$("#visitForm").hide();
			$("#doctorForm").show();
			$("#bedForm").hide();
		});
	});
	</script>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/SocialProject">MyPatientSearch</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/SocialProject">Home</a></li>
      <li><a href="addpatient">Patient</a></li>
    </ul>
  </div>
</nav>
<div class="container">
<div class="row">
    <div class="col-md-4">
      <p>The .navbar-fixed-bottom class makes the navigation bar stay at the bottom.</p>
    </div>
    <div class="col-md-4"> 
      <p>The .navbar-fixed-bottom class makes the navigation bar stay at the bottom.</p>
    </div>
    <div class="col-md-4"> 
      <p>The .navbar-fixed-bottom class makes the navigation bar stay at the bottom.</p>
    </div>
    <div class="clearfix visible-lg"></div>
 </div>
<h2>MY Doctor Search</h2>
<form class="form-inline" role="form">
  <div class="panel-group">
    <div class="panel panel-info">
      <div class="panel-heading"> Search Result</div>
      <!-- Patient Search Result -->
      <div class="panel-body">
      <c:set var="bedList" value="${requestScope.bedList}" />
    <c:choose>
							<c:when test="${not empty bedList}">
						
		<table class="table table-hover">
    <thead>
    <tr>
    	<th>Bed Number</th>
    	<th>Bed Type</th>
    	<th>Patient Name</th>
        <th>From</th>
        <th>Till</th>
    </tr>
    
      
    </thead>
    <tbody>
    <c:forEach var="bed" items="${bedList}">
      <tr>
        <td>${bed.bedAssignmentId}</td>
         <td>${bed.wardType}</td>
        <td>${bed.patientEvent.patient.patientFname} ${bed.patientEvent.patient.patientLname}</td>
        <td>${bed.dateFrom}</td>
        <td>${bed.dateTill}</td>
      </tr>
      </c:forEach>
     
    </tbody>
  </table>
  </c:when>
  <c:otherwise>
  	<div class="alert alert-warning">
									<strong>Sorry:</strong> No BED assignment found in the database.
								</div>
  </c:otherwise>
  </c:choose>
		
	  </div>
      <!-- End Search Result -->
	  
    </div>
    
  </div>
</form>
</div>

</body>
</html>
