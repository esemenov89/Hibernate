<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 18.04.2017
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
<form method="post">
    <input type="text" name="name" value=${name}>
    <input type="text" name="age" value=${age}>
    <input type="text" name="group_id" value=${group_id}>
    <input type="hidden" name="student_id" value="<%= request.getAttribute("id") %>">
    <input type="submit" value="Save" />
</form>

</body>
</html>
