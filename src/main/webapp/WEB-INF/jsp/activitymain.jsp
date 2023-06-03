<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register </title>

<style>
        body {
            background-color: #f2f2f2;
            font-family: Arial, sans-serif;
        }
        .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .forms {
            margin-bottom: 20px;
        }
        .forms label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }
        .forms input {
            width: 95%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
            margin: 0px 0px;
        }
        .forms input[type="submit"] {
            background-color: #4CAF50;
            color: #fff;
            cursor: pointer;
        }
        .forms input[type="submit"]:hover {
            background-color: #45a049;
        }
        .signin{
        	float: right;
        }
        .signin:hover{
        	cursor: pointer;
        }
    </style>

</head>
<body>
 
    
    <div class="container">
        <h2>SignUp</h2>
        <form action="${pageContext.request.contextPath }/login">
        	<div class="forms">
                <label>Name:</label>
                <input type="text" id="uname" name="username" placeholder="Enter username">
            </div>
            <div class="forms">
                <label>Password:</label>
                <input type="password" id="pw" name="password" placeholder="Enter password">
            </div>
            <div class="forms">
                <label>ImageURL:</label>
                <input type="text" id="name" name="name" placeholder="Enter Name">
            </div>
            <div class="forms">
                <label>Email:</label>
                <input type="text" id="email" name="email" placeholder="Enter Email Id">
            </div>
            <div class="forms">
                <label>Date of Birth:</label>
                <input type="text" id="dob" name="dob" placeholder="Enter Date of Birth">
            </div>
            <div class="forms">
                <label>Phone Number:</label>
                <input type="number" id="phno" name="phno" placeholder="Enter Phone Number">
            </div>
        
         	<div class="forms">
                <input type="submit" value="Sign Up">
            </div>
            
            <div class="forms">
            	<a href="${pageContext.request.contextPath }/login"> <label class = "signin">Already have a account?</label></a>
            </div>
            
        </form>
    </div>
</body>
</html>