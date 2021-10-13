<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome to Application</title>
</head>
<body>
<form action="addUser">
Enter id<input type="text" name="id"><br>
Enter Name<input type="text" name="name"><br>
<input type="submit"><br>
</form>
<h2>display user information</h2>
<form action="getUser">
Enter id:<input type="text" name="id"><br>
<input type="submit"><br>
</form>
<h2>enter details to delete</h2>
<form action="deleteUser">
Enter id:<input type="text" name="id"><br>
<input type="submit"><br>
</form>
<h2>enter details to update</h2>
<form action="updateUser">
Enter id:<input type="text" name="id"><br>
<input type="submit"><br>
</form>
</body>
</html>