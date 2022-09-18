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
 <c:if test="${ !empty sessionScope.name && !empty sessionScope.lastname && !empty sessionScope.age }">
        <p>you are ${ sessionScope.name } ${ sessionScope.lastname }   ${ sessionScope.age } !</p>
    </c:if>
      <form action="" method="post">
    		  <p> Write Name : <input type="text" name="name"> </p>
            <p> Write lastname : <input type="text" name="lastname"> </p>
            <p> Write age : <input type="text" name="age"> </p>
            <p><button type="submit">Send</button> </p>
      
      </form>
</body>
</html>