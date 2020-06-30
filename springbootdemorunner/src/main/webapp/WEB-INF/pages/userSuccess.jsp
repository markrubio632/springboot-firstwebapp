<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

name:<c:out value="${user.uName }"></c:out><br>
email:<c:out value="${user.email}"></c:out><br>
password:<c:out value="${user.password}"></c:out><br>

Department:<c:out value="${user.department}"></c:out><br>
City:<c:out value="${user.city}"></c:out><br>
Country:<c:out value="${user.country}"></c:out><br>

<c:forEach var="language" items="${user.language}">

Language known:<c:out value="${language}"></c:out><br>
</c:forEach>

<c:forEach var="hobby" items="${user.hobby}">

Hobby:<c:out value="${hobby}"></c:out><br>
</c:forEach>

</body>
</html>