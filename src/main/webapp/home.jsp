<%--
  Created by IntelliJ IDEA.
  User: GzySyq
  Date: 2022/9/6
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%> <!--支持EL表达式，不设的话，EL表达式不会解析-->
<html>
<head>
    <title>home</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/logout">退出</a>
<a href="${pageContext.request.contextPath}/order-list">列表</a>
<a href="${pageContext.request.contextPath}/order-add">添加</a>
</body>
</html>
