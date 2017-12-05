<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
  
 <title>WelCome | tag your pictures</title>

  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  
  
<!-- JavaScript -->
  <script src="script/profile.js"></script>
  <script src="script/index.js"></script>
 <link rel="stylesheet" href="css/profile.css" type="text/css"	media="screen">

  <script type="text/javascript">
		$(document).ready(function() {
			$('.formContainer').hide();
			$('#btn-uploadHide').click(function() {
				$('.formContainer').hide();
			});
			$('#btn-uploadshow').click(function() {
				$('.formContainer').hide();
				$('#form_container').show();
			});
		});
  </script>
  
<script type="text/javascript">

$(document).ready(function(){
	/* loding(); */
	function loding(){
		
	}
	/* contentnewslisting(); */
	/* contentmenulisting(); */
	  
	});

</script>
</head>
<body>

<nav class=" navbar navbar-fixed-top transparent " role="navigation">
  <div class="container-fluid">
    <div class="navbar-header">
   <!-- <a href="allimages.spring?pageNo=1"><img src="images/logo.png" alt="pcc"></a> -->
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a href="allimages.spring?pageNo=1"><img src="images/logo.png" alt="pcc"></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
    <div id="menutopTable" class="clear nav navbar-nav">
    
    </div>
    
    </div>
  </div>
</nav>
 <hr>
 
	
	<!-- adds tab -->
	<div class="row">
	<br><br>
    	<div class="col-sm-3" style="background-color:none;">
        	<div id="menuTable" class="btn-group-vertical" class="clear btn-group btn-group-lg">
        	</div>
        </div>
    
    <!-- photos tab -->
	<div class="col-sm-6" style="background-color:lavenderblush;">
	
    	<div align="center" >
    	    	<!-- <div class="btn-group" align="center" data-toggle="buttons-radio"> -->
	    	<button type="button"  id="btn-uploadshow" class="btn btn-primary  active">Upload</button>
	    	<button type="button" id="btn-uploadHide" class="btn  btn-primary active">Clear</button> 
    	</div>
	

		<div class="formContainer" align="center" id="form_container">
		    <!-- form  class='form-inline' role='form'  style='align:center;' action='addComment.spring' method='post' -->
     			<form  class="form-inline" role="form"  style="align:center;" action="register" method="post">
						<div class="form-group">
						<!-- <label class="sr-only" for="text">Add Tags To Your Photo :</label>
      					<input type="text" 	id=Tbody onkeyup="showData(this.value);"  name="tagName" class="form-control" aria-controls="example" id="tagName" placeholder="Add Tags To Your Photo  "> -->
      				
      					
    				</div>
				<div>
    				<p>	<label>First Name :</label>
							<input type="text"  name="firstName" size="28" value="" style="btn_corner">
						</p>
						</div>
						<div>
						<p>
							<label>LST_NM:</label>
							<input type="text" name="lastName" size="28" value="" style="btn_corner">
						</p>
						</div>
					<div>
						<p>
							<label>Gender:</label> 
							<input type="radio" name="gender"
								value="male"> Male &nbsp;
								<input type="radio"
								name="gender" value="female"> Female<br>
						</p>
					</div>
						<p>
							<label>EMAIL_ADR :</label>
							<input type="text" name="email_adr" size="28" value="" style="btn_corner">
						</p>
						</div>
						<div>
						<p>
							<label>MOBL_NM:</label>
							<input type="text" name="mobl_nm" size="28" value="" style="btn_corner">
						</p>
						</div>
						<p>
							<label>COLG_NM:</label>
							<input type="text" name="colg_nm" size="28" value="" style="btn_corner">
						</p>
						<!-- <p>
							<label>COLG_DIST:</label>
							<input type="text" name="COLG_DIST" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>COLG_UNIVRSTY:</label>
							<input type="text" name="COLG_UNIVRSTY" size="28" value="" style="btn_corner">
						</p> -->
						<p>
							<label>JOIN_YEAR:</label>
							<input type="text" name="colg_join_year" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>ADR_L1:</label>
							<input type="text" name="adr_ln1" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>ADR_L2:</label>
							<input type="text" name="adr_ln2" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>District:</label>
							<input type="text" name="district" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>STATE:</label>
							<input type="text" name="state" size="28" value="" style="btn_corner">
						</p>
					<button type="submit" class="btn btn btn-primary active">Submit</button>
				</form>
	  </div>
	  <br>
	  <c:url var="addAction" value="/register" ></c:url>

	  <br>
	  
<!-- pagination -->

<table style="align: center;">
		<tr><td>
				Showing 1 to ${i} of <b> ${param.pageNo} </b>entries
						</td></tr>
						<tr><td>
	<!-- displaying Previous link except for the 1st page  -->
							<c:choose> 
								<c:when test="${param.pageNo gt 1}">
									<a href="allimages.spring?pageNo=${param.pageNo-1}">Previous &nbsp;</a>
								</c:when> 
									<c:otherwise>Previous</c:otherwise>   
							</c:choose>
							
	<!-- Displaying page Numbers -->
							<c:forEach begin="1" end="${i}" var="j">
								<c:choose>
									<c:when test="${param.pageNo eq j}">
										${j}
									</c:when>
									<c:otherwise>
										<a href="allimages.spring?pageNo=${j}">${j} </a> 
								</c:otherwise>
								</c:choose>
							</c:forEach>
	<%--For displaying Next link --%>
								<c:choose> 
								<c:when test="${param.pageNo lt i}">
									<a href="allimages.spring?pageNo=${param.pageNo+1}">Next &nbsp; </a>
								</c:when> 
									<c:otherwise>Next</c:otherwise>   
							</c:choose>
						
					</td></tr> 
					
		<!-- comments -->

	

					<tr><td><br><br>		
    
<!-- pagination end-->

<div id="newsTable" class="clear">  <div id="myForm" class="clear">  </div></div>

<div class="" align="center" id="">
     			<%-- <form  class="form-inline" role="form"  style="align:center;" action="upload1.spring" method="post">
					
					<p>	<label>First Name :</label>
							<input type="text" name="email" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>LST_NM:</label>
							<input type="text" name="newPassword" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>EMAIL_ADR :</label>
							<input type="text" name="newPassword" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>MOBL_NM:</label>
							<input type="text" name="newPassword" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>COLG_NM:</label>
							<input type="text" name="newPassword" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>COLG_DIST:</label>
							<input type="text" name="newPassword" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>COLG_UNIVRSTY:</label>
							<input type="text" name="newPassword" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>JOIN_YEAR:</label>
							<input type="text" name="newPassword" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>ADR_L1:</label>
							<input type="text" name="newPassword" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>ADR_L2:</label>
							<input type="text" name="newPassword" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>CITY:</label>
							<input type="text" name="newPassword" size="28" value="" style="btn_corner">
						</p>
						<p>
							<label>STATE:</label>
							<input type="text" name="newPassword" size="28" value="" style="btn_corner">
						</p>
					
					
					<button type="submit" class="btn btn btn-primary active">Submit</button>
				</form>
	  </div>
	   --%>
<div class="container" id="imagetable" align="justify"></div>
					<c:forEach var="e" items="${imagePojoList}">
								<tr><td>${e.getImageDesc()}<br> ${e.getImageName()} </td></tr>
										<tr><td>
		    <img  alt="${e.getImageName()}" style="align:center;" width= 500px; height= 500px;
										 src="${e.getImg_Url()}" />
			
			
									</td></tr>
										<tr><td>
				
		<div id="hidden" style="display:none">
		
		</div>
			<%-- <form  class="form-inline" role="form"  style="align:center;" action="addComment.spring" method="post">
					<input type="hidden"  name="commentid"  value="${e.getCommentid()}" class="form-control" id="commentid" >
    				<label class="sr-only" for="text">Comment :</label> <br> <textarea cols="90%" rows="2"
						name="comment" ></textarea>
    				<button type="submit" class="btn btn-default">Submit</button>
			</form> --%>
		</div></td></tr><tr><td>
		
		<a href="#" onclick="getComments(\''${e.getCommentid()}'\'); ">Comments Show</a> &nbsp;
		
		<a href="viewComments.spring?commentidf=${e.getCommentid()}">Show Comments</a>
		<div id="newsCommentsTable"> </div>
		<c:forEach var="ce" items="${viewcommentsList}">
			<textarea cols="90%" rows="2" name="comment">${ce.getComments}</textarea>
    	</c:forEach>
    		</td></tr>
    		</c:forEach>
    		</td>
    		</tr>
    		</table>
    	
		</div>
						
    <div class="col-sm-3" style="background-color:none;">
    ADDs
    <div class="nav-copyright">
    <nav class="left">
      <a href="#terms" class="terms">Terms &amp; Conditions</a>
      <a href="#privacy">Privacy</a>
    </nav>
    <div class="right">
      <small class="copyright">Copyright &copy; 2015. All rights reserved.</small>
    </div>
  </div>
    </div>
    
    </div>
   

</body>
</html>