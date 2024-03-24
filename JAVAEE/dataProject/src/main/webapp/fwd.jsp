<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="color:blue">
<h1>this is forward jsp page</h1>
<%
String name=request.getParameter("name");
String password=request.getParameter("pwd");
%>
user name is <%=name %><br>
user password is <%=password %><br>
<%
int c=70;
int d=30;%>
addition is <%=(c+d) %>


</body>
</html>