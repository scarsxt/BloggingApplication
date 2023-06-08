<%@page import="com.example.bloggingApp.controller.BlogE"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View BlogPost</title>
<style>
 body {
      font-family: 'Calibri Light';
      background-color: #fff;
      display: flex;
      flex-direction: column;
      align-items: center;
    }
    
    #content {
	  width: 600px;
      background-color: #ffffff;
      border: 1px solid #dddddd;
      padding: 20px;
      margin-bottom: 20px;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
      border-radius: 10px;
    }
    
    #category {
      font-weight: bold;
      margin-bottom: 10px;
      color: #333333;
    }
    
    #msg {
      margin-bottom: 0;
      color: #666666;
    }
    #names{
    font-size: 13px;
    float: right;
    color: #444444;
    }
</style>
</head>
<body>
<div id="header">
    <h1>Posts</h1>
    <% List<BlogE> blogs = (List<BlogE>) request.getAttribute("blogList"); %>
    <p>Total Posts: <%= blogs.size() %></p>
  </div>


<%for(BlogE blog: blogs){
	%>

<div id="content">
<p id="category"> <%=blog.getCategory() %> </p>
<p id="msg"><%=blog.getMsg() %></p>
<p id="names"> Post By: <%=blog.getName() %></p>
</div>

<%} %>

</body>
</html>