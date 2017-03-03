<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	String path=request.getContextPath();
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<meta charset="UTF-8" />
<%-- 
<script type="text/javascript" src="<%=path %>/easyui/jquery.min.js"></script>
<script type="text/javascript" src="<%=path %>/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=path %>/easyui/locale/easyui-lang-zh_CN.js" ></script>
<script type="text/javascript" src="<%=path %>/js/index.js"></script>
<link rel="stylesheet" type="text/css" href="<%=path %>/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="<%=path %>/easyui/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="<%=path %>/css/login.css" />
 --%>
<link rel="stylesheet" href="<%=path %>/css/bootstrap.min.css" />
<script type="text/javascript" src="<%=path %>/js/jquery-1.7.2.js" ></script>
<script type="text/javascript" src="<%=path %>/js/bootstrap.min.js" ></script>
</head>
<body>

<div class="row">
	<div></div>
	<div></div>
	<div></div>
	<div></div>
	<div></div>
	<div></div>
	<div></div>
	<div></div>
	<div></div>
	<div></div>
	<div></div>
	<div></div>
	<div></div>
	<div></div>
	<div></div>
	<div></div>
  <div class="col-md-6">
  		<form action="login.action"  method="post">
			  <div class="form-group">
			    <label for="exampleInputEmail1">用户名</label>
			    <input type="email" class="form-control" id="exampleInputEmail1">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Password</label>
			    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
			  </div>
			  <button type="submit" class="btn btn-default">登录</button>
		</form>
  </div>
  <div class="col-md-6"></div>
</div>
</body>
</html>