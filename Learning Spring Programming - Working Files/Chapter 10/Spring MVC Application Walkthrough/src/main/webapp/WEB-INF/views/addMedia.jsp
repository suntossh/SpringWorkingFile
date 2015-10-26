<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="add" method="post">
		<h1>Add Media:</h1>
		<fieldset>
			<label>Title:</label>
			<input name="title"/>
		</fieldset>
		<fieldset>
			<label>Rating:</label>
			<input name="rating"/>
		</fieldset>
		<fieldset>
			<label>Length:</label>
			<input name="length"/>
		</fieldset>
		<fieldset>
			<label>Format:</label>
			<input name="format"/>
		</fieldset>
		<button type="submit">Save</button>		
	</form>
</body>
</html>