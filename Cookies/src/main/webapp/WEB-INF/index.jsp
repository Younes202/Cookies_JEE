<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <c:out value="${name}"/>
<form action="" method="post">
<p> Name : <input type="text" name="name"> </p>
<p> LastName : <input type="text" name="lastname"> </p>
<p> age : <input type="number" name="age"> </p>
<p><button type="submit"> Send </button> </p>

</form>
</body>
</html>