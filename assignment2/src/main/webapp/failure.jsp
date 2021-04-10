<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Failed - Assignment 2</title>
</head>
<body>
<h1>Welcome, please log in!</h1>
<h3>You have entered a wrong username or password. Please try again!</h3>
<s:form action="verify">
    <s:textfield name="username" label="Username" required="true"/>
    <s:password name="password" label="Password" required="true"/>
    <s:submit value="Login" required="true"/>
</s:form>

</body>
</html>