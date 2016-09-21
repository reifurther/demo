<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

    <head>
        ReiApp Login
    </head>

    <body>

        <c:if test="${!empty error}">
            <font color="red">
                <c:out value="${error}"></c:out>
            </font>
        </c:if>

        <form action="<c:url value="/login" /> " method="post">
            user name: <input type="text" name="userName"><br>
            password: <input type="password" name="password"><br>

            <input type="submit" value="submit">
            <input type="reset" value="reset">

        </form>
    </body>


</html>