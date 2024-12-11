<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book</title>
</head>
<body>
	<h2>Book Details</h2>
	<form action="bookData">
		Book ID : <input type="text" name="id">
		<input type="submit" value="search">
	</form> 
	<hr>
	Book Id :${book.bookId} <br>
	Book Name :${book.bookName} <br>
	Book Price :${book.bookPrice} <br>
</body>
</html>