<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import=" java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
<h1>THIS IS INDEX JSP</h1> 
<% 
for(int i=0;i<5;i++){ 
 System.out.println(i); 
 out.write("<br/>"+i); 
} 
 
%> 
<br/> 
Current Time 
<% 
Date dt=new Date(); 
out.write("<br/>"+dt); 
String str="JTC"; 
%> 
<br/> 
<font color="red" size="5"><%=dt %></font> 
<br/> 
<font color="red" size="5"><%=str %></font> 
</body> 
</html>