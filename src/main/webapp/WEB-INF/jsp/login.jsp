<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>

</head>
<body>
    <div class="container">
        <h2>Login Form</h2>
        <form method="post" action="${pageContext.request.contextPath }/login">
            <div>
                <label for="username">Username:</label>
                <input type="text" id="uname" name="username" placeholder="Enter username">
            </div>
            <div>
                <label for="password">Password:</label>
                <input type="password" id="pw" name="password" placeholder="Enter password">
            </div>
            
        </form>
    </div>
</body>
</html>