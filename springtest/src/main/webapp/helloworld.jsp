<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 16/3/15
  Time: 下午8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<% String str = (String) request.getAttribute("helloworld"); %>
<body>
 <font SIZE="22" > <%=str%></font>
</body>
</html>
