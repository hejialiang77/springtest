<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 16/3/20
  Time: 下午12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MultiActionController</title>
</head>
<body>
    <form name="HelloWorld" action="/springtest/helloWorldMultiAction.do" method="post">
        请输入你要提交的内容:<input type="text" name="helloWorld" value="" />
        <br>
        <input type="submit" name="method" value="insert" />
        <input type="submit" name="method" value="update" />
        <input type="submit" name="method" value="delete" />
    </form>
</body>
</html>
