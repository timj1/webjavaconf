<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>

<head>

</head>

<body>
<c:set var="rootContext" value="${pageContext.request.contextPath}/"/>

<h1>${msg}</h1>

<a href="${rootContext}">front-page</a>

</body>

</html>