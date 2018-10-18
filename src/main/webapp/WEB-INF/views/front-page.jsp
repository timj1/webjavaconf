<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
<style><%@include file="/WEB-INF/views/css/myStyle.css"%></style>
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


<table>
<c:set var="col" value="1"/>

<c:forEach items="${simpleList}" var="listElement">
    <c:if test="${col==1}">
        <tr>
    </c:if>
    <td>
    <c:out value="${listElement}"/> <br/>
    </td>
    <c:if test="${col==2}">
        </tr>
        <c:set var="col" value="0"/>
    </c:if>
    <c:set var="col" value="${col+1}"/>
</c:forEach>
</table>

<c:forEach begin="0" end="4" var="test">
    hello
    <c:out value="${test}"/>
</c:forEach>

<c:if test="${not empty varModel}">
    VarModel is not empty
</c:if>

</body>

</html>