<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>

</head>

<body>
<c:set var="rootContext" value="${pageContext.request.contextPath}/"/>

<h1>${msg}</h1>
<p>Hello again</p>

<c:out value="${varModel}"/> <br/>
<a href="${rootContext}second-page">second-page</a>

<form:form method="POST" action="${rootContext}">
    <input name="request"/>
    <input type="submit" value="submit value"/>
</form:form>

</body>

</html>