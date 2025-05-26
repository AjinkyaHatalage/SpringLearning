<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This Is Help page</title>
</head>
<body>

<%
  String name= (String)request.getAttribute("name");
Integer rollno= (Integer)request.getAttribute("rollnumber");
%>
 <h1>Hello my name is <%= name %></h1>
 <h1>My roll number is  <%= rollno %></h1>
</body>
</html>