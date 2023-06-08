<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Write a Blog</title>
<style>

body {
      font-family: 'Calibri Light';
      background-color: #fff;
      margin: 0;
      padding: 20px;
    }

    .container {
      max-width: 500px;
      margin: 0 auto;
      background-color: #fff;
      padding: 20px;
      border-radius: 5px;
    }

    .form-group {
      margin-bottom: 20px;
    }

    label {
      display: block;
      font-weight: bold;
      margin-bottom: 5px;
    }

    input[type="text"],
    textarea {
      width: 95%;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 4px;
      resize: vertical;
    }

    button {
      background-color: #00FF00;
      color: #fff;
      padding: 10px 20px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      float: right;
    }
</style>
</head>
<body>

<div class="container">
	<h1>Write a Post</h1>
    <form method="Post" action="${pageContext.request.contextPath }/write">
      <div class="form-group">
        <label for="category">Heading:</label>
        <input type="text" id="category" name="category" placeholder="Enter heading">
      </div>
      <div class="form-group">
        <label for="message">Post:</label>
        <textarea id="message" name="message" placeholder="Write here"></textarea>
      </div>
      <button type="submit">Post</button>
    </form>
  </div>
	
</body>
</html>