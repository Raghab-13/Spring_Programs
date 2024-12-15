<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<h3>Student Enquiry Form</h3>
	
	<p><font color="grrn">${msg}</font></p>
	
	<form:form action="save" modelAttribute="student" method="post">
		<table>
		
			<tr>
				<td>Name :</td>
				<td><form:input path="name"/></td>
			</tr>
			
			<tr>
				<td>Email :</td>
				<td><form:input path="email"/></td>
			</tr>
			
			<tr>
				<td>Gender :</td>
				<td><form:radiobutton path="gender" value="M" />Male
					<form:radiobutton path="gender" value="F" />Female 
				</td>
			</tr>
			
			<tr>
				<td>Course :</td>
				<td>
					<form:select path="course">
						<form:option value="">SELECT</form:option>
				   <!-- <form:option value="java">Java</form:option>
						<form:option value="python">Python</form:option>
						<form:option value=".net">.NET</form:option>
						<form:option value="c++">C++</form:option> -->
						<form:options items="${courses}"/>
					</form:select>
				</td>
			</tr>
			
			<tr>
				<td>Timings :</td>
				<td>
			   <!-- <form:checkbox path="timings" value="morning"/> Morning
					<form:checkbox path="timings" value="noon"/> After-Noon
					<form:checkbox path="timings" value="evening"/> Evening -->
					<form:checkboxes items="${prefTimings}" path="timings"/>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<form:input type="submit" value="save" path=""/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>