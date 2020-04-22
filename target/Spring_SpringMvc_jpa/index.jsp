
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/js/jquery.min.js"></script>

<html>
<body >

<form action="/resume/query" method="post">
    <input type="submit" value="查询">
</form>

<br><br>
<hr>

<form action="/resume/insert" method="post">
    id:<input type="text" id="id" name="id"><br>
    name:<input type="text" id="name" name="name"><br>
    address:<input type="text" id="address" name="address"><br>
    phone:<input type="text" id="phone" name="phone"><br>
    <input type="submit" value="新增"><br>
</form>
<%--<table border="2" style="border: #000000" align="center">
    <tr>
        <th colspan="2">id</th>
        <th colspan="2">name</th>
        <th colspan="2">address</th>
        <th colspan="2">phone</th>
    </tr>
    <c:forEach items="${resumeList}" varStatus="status" var="resume">

        <td colspan="2" >${resume.id}</td>
        <td colspan="2" >${resume.name}</td>
        <td colspan="2" >${resume.address}</td>
        <td colspan="2" >${resume.phone}</td>
    </c:forEach>

</table>--%>

</body>
</html>
