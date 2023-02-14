<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> Login </h1>


<form action="/login-submit" method="POST">
	    
	  <label for="name"> Name :</label>
 	  <input type="text" id="name" name="name">
	  <br> <br>
	  
	  <label for="password"> Password :</label>
 	  <input type="text" id="password" name="password">
 	  
 	  <br> <br>
	  <input type="submit" value="Login">
	
	  
       
</form>

</body>
</html>