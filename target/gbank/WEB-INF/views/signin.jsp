<%@ include file="../includes/includes.jsp" %>  
<html>
  <head>
    <%@ include file="../shared/head.jsp" %>  
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Sign In</title>
  </head>
<body class="cm-login">

    <div class="text-center" style="padding:90px 0 30px 0;background:#fff;border-bottom:1px solid #ddd">
      <img src="${pageContext.request.contextPath}/resources/assets/img/logo-big.svg" width="300" height="45">
    </div>
    
    <div class="col-sm-6 col-md-4 col-lg-3" style="margin:40px auto; float:none;">
      <f:form action="${pageContext.request.contextPath}/user/login" method="post" modelAttribute="user">
	<div class="col-xs-12">
          <div class="form-group">
	    <div class="input-group">
	      <div class="input-group-addon"><i class="fa fa-fw fa-user"></i></div>
	      <f:input path="email" name="email" class="form-control" placeholder="Username"/>
	    </div>
          </div>
          <div class="form-group">
	    <div class="input-group">
	      <div class="input-group-addon"><i class="fa fa-fw fa-lock"></i></div>
	      <f:input path="password" name="password" class="form-control" placeholder="Password"/>
	    </div>
          </div>
        </div>
		<!-- <div class="col-xs-6">
          <div class="checkbox"><label><input type="checkbox"> Remember me</label></div>
		</div> -->
		<div class="col-xs-6">
          <button type="submit" name="submit" class="btn btn-block btn-primary">Sign in</button>
        </div>
      </f:form>
    </div>
  </body>
    <%@ include file="../shared/footer.jsp" %> 
</html>
