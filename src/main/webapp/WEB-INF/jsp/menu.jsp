<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to BlogPost</title>
<style type="text/css">
body {
            font-family: 'Calibri Light';
            background-color: #fff;
        }
        
.container {
    max-width: 600px;
    
    padding: 20px;
    background-color: #ffffff;
    border-radius: 5px;
    display: flex;
}

.profile-img {
    width: 200px;
    height: 200px;
    border-radius: 50%;
    object-fit: cover;
    margin: 50px
}

.profile-info {
    margin: 20px;
}

.header {
  font-size: 24px;
  text-align: center;
  color: #333;
  margin-top: 20px;
}
.button-container {
  display: flex;
  justify-content: center;
  align-items: center;
  margin-top: 20px;
}

.profile-div{
margin: 50px 0 0 0;
}

.logout{
background-color: #FF0000; 
  border: none;
  color: white;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 10px;
  cursor: pointer;
  border-radius: 20px;
  float: right;
}

.button {
  background-color: #0000FF; 
  border: none;
  color: white;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 10px;
  cursor: pointer;
  border-radius: 20px
}

</style>
</head>
<body>
<div>
<h1 class="header">Blog Post</h1>
<a href="/logout"><button class="logout">Logout</button></a>
</div>


<div class="container">
<div>
<img class="profile-img" src="<%= session.getAttribute("url") %>" alt="Profile Picture">
</div>
<div class="profile-div">
	<div class="profile-info">
		<h2>Name:</h2>
		<span id="Name"><%= session.getAttribute("Name") %></span>
	</div>
	<div class="profile-info">
		<h2>Email:</h2>
		<span id="Email"><%= session.getAttribute("Email") %></span>
	</div>
	<div class="profile-info">
		<h2>Phone Number:</h2>
		<span id="Phno"><%= session.getAttribute("Phno") %></span>
	</div>
</div>
        
       
    </div>
    <div class="button-container">
	    <a href="/write"><button class="button">Write Post</button></a>
		<a href="/view"><button class="button">View Post</button></a>
  	</div>
	
</body>
</html>