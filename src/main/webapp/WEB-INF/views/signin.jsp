<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ include file="../includes/includes.jsp" %>  
<html>
<head>
<%@ include file="../shared/head.jsp" %>  
<title>Shoppy an Admin Panel Category Flat Bootstrap Responsive Website Template | Login :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</head>
<body>	
<div class="login-page">
    <div class="login-main">  	
    	 <div class="login-head">
				<h1>Login</h1>
			</div>
			<div class="login-block">
				<f:form action="${pageContext.request.contextPath}/user/login" method="post" modelAttribute="user">
					<f:input path="id" name="id" class="hidden"/>
					<f:input path="email" name="email" class="form-control" placeholder="Email"/>
					<f:input path="password" name="password" class="lock" placeholder="Password"/>
					<div class="forgot-top-grids">
						<div class="forgot-grid">
							<ul>
								<li>
									<input type="checkbox" id="brand1" value="">
									<label for="brand1"><span></span>Remember me</label>
								</li>
							</ul>
						</div>
						<div class="forgot">
							<a href="#">Forgot password?</a>
						</div>
						<div class="clearfix"> </div>
					</div>
					<input type="submit" name="submit" value="Login">	
					
					<h3>Not a member?<a href="${pageContext.request.contextPath}/user/signupPage"> Sign up now</a></h3>		
					<!-- 		
					<h2>or login with</h2>
					<div class="login-icons">
						<ul>
							<li><a href="#" class="facebook"><i class="fa fa-facebook"></i></a></li>
							<li><a href="#" class="twitter"><i class="fa fa-twitter"></i></a></li>
							<li><a href="#" class="google"><i class="fa fa-google-plus"></i></a></li>						
						</ul>
					</div> -->
				</f:form>
<!-- 				<h5><a href="index.html">Go Back to Home</a></h5> -->
			</div>
      </div>
</div>
<!--inner block end here-->
<!--copy rights start here-->
<div class="copyrights">
	 <p>© 2016 Shoppy. All Rights Reserved | Design by  <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>
</div>	

<%@ include file="../shared/footer.jsp" %>  

</body>
</html>


                      
						
