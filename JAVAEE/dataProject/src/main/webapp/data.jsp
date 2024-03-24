<%@page import="java.util.Scanner,java.util.Date"/ %>

<
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="color:red;background-color:yellow">
<h1>hello welcome to jsp </h1>
<%
Scanner sc=new Scanner(System.in);%>
<%Date d=new Date(); %>
<%
String name=request.getParameter("name");
String password=request.getParameter("pwd");
%>
user name is <%=name %><br>
user password is <%=password %><br>
<%
int p=30;
int q=30;%>
addition is <%=(p+q) %>


</body>
</html>