<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 16/3/13
  Time: 下午3:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${message}
<br/>
<p>语言列表</p>
<c:forEach items="${booklist}" var="node">
    <c:out value="${node}"/>
</c:forEach>
<br/>
<p>
    <c:forEach items="${map}" var="node">
        <c:out value="${node.key}"/>
        <c:out value="${node.value}"/>
        <br>
    </c:forEach>
</p>
</body>
</html>