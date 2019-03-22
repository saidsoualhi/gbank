<%@ include file="../includes/includes.jsp" %>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ include file="../shared/head.jsp" %>  
</head>
<body>
<div class="signup-page-main">
     <div class="signup-main">  	
    	 <div class="signup-head">
				<h1>Sign Up</h1>
			</div>
			<div class="signup-block">
				<f:form action="${pageContext.request.contextPath}/user/signup" method="post" modelAttribute="user">
					<f:input type="text" path="username" placeholder="Name"/>
					<f:input type="text" path="email" placeholder="Email"/>
					<f:errors path="email" cssClass="error" />
					<f:input type="password" path="password" class="lock" placeholder="Password"/>
					<!-- <div class="forgot-top-grids">
						<div class="forgot-grid">
							<ul>
								<li>
									<input type="checkbox" id="brand1" value="">
									<label for="brand1"><span></span>I agree to the terms</label>
								</li>
							</ul>
						</div>
						
						<div class="clearfix"> </div>
					</div> -->
					<input type="submit" name="submit" value="Sign up">														
				</f:form>
				<div class="sign-down">
				<h4>Already have an account? <a href="${pageContext.request.contextPath}/user/signin"> Login here.</a></h4>
				  <h5><a href="index.html">Go Back to Home</a></h5>
				</div>
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