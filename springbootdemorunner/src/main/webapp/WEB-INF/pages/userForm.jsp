 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

 <h3>welcome to registration page</h3>
 
 <!-- look at line 3 prefix: form for why we do form:form -->
 <form:form method= "post" modelAttribute="user">
 <form:errors/>
 
 Username:<form:input path="uName"/><br>
 <form:errors path="uName"/>
 email:<form:input path="email"/><br>
 <form:errors path="email"/>
 password:<form:password path="password"/><br>
 <form:errors path="password"/>
 
 
<form:select path="department">
<form:option value="0" label="select"/>
<form:options items="${dept}" itemValue="departName" itemLabel="departName"/>
</form:select><br>

<form:select path="city">
<form:option value="0" label="select"/>
<form:options items="${city}" itemValue="cityName" itemLabel="cityName"/>
</form:select><br>

<form:select path="country">
<form:option value="0" label="select"/>
<form:options items="${country}" itemValue="countryName" itemLabel="countryName"/>



</form:select>
<br>
<form:checkboxes items="${language}" path="language" itemValue="key" itemLabel="value"/><br>
<form:checkboxes items="${hobby}" path="hobby" itemValue="key" itemLabel="value"/>

<input type="submit" value="register"/>

 </form:form>

</body>
</html>