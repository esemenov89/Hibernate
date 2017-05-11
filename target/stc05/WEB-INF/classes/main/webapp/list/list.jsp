<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<c:choose>
    <c:when test="${username==null}">
    </c:when>
    <c:otherwise>
        <div style="position: fixed; top: 0%; right: 0;">
            <form action="${pageContext.request.contextPath}/logout" method="post">
                <input type="submit" value="Logout"/>
            </form>
        </div>
    </c:otherwise>
</c:choose>
<form method="get">
    <td><input type="button" value="Добавить" onclick="location.href = '../list/student/addStudent'"></td>

    <table>
        <c:forEach items="${list}" var="student">
            <tr>
                <td><c:out value="${student.id}"></c:out></td>
                <td><c:out value="${student.name}"></c:out></td>
                <td><c:out value="${student.age}"></c:out></td>
                <td><c:out value="${student.groupId}"></c:out></td>
                <td><input type="button" value="Редактировать"
                           onclick="location.href = '<%= request.getContextPath() %>../list/student/changeStudent?id=<c:out
                                   value="${student.id}"/>'"></td>
                <td><input type="button" name="edit" value="Удалить"
                           onclick="location.href = '../list/student/deleteStudent?id=<c:out value="${student.id}"/>'"></td>
            </tr>
        </c:forEach>
    </table>
</form>
<%--<a href="<c:url value="/j_spring_security_logout" />" > Logout</a></h2>--%>
</body>
</html>
