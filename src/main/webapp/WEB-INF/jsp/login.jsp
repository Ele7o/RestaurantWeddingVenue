<%-- 
    Document   : login
    Created on : May 10, 2021, 5:28:34 PM
    Author     : X_X
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" 
uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" 
uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" 
uri="http://java.sun.com/jsp/jstl/core" %>
<div class="alert alert-danger">
<c:if test="${param.error != null}">
<spring:message code="user.login.error1" />
</c:if>
<c:if test="${param.accessDenied != null}">
<spring:message code="user.login.error2" />
</c:if>
</div> 

<form:form action="/NhaHangTiecCuoi/login/" method="post" modelAttribute="login" enctype="multipart/form-data" >
    <form:errors path="*" cssClass="text-danger" />
        <div class="text-danger">${otherError}</div>
    <div class="form-group">
        <form:label path="tenTaiKhoan">Tên đăng nhập</form:label>
        <form:input path="tenTaiKhoan" class="form-control" type="text" />
        <form:errors path="tenTaiKhoan" cssClass="text-danger" />
    </div>
    <div class="form-group">
        <form:label path="matKhau">Mật khẩu</form:label>
        <form:input path="matKhau" class="form-control" type="text" />

    </div>
    <div class="form-group">
        <input type="submit"value="<spring:message code="user.login" />"/>
    </div>
</form:form>

<ul>
<c:choose>
<c:when test="${pageContext.request.userPrincipal.name == null}">
<li>
<a href="<c:url value="/register/" />">Đăng kí</a>
</li>
</c:when>
<c:when test="${pageContext.request.userPrincipal.name != null}">
<li>
<a href="#">${pageContext.request.userPrincipal.name}</a>
</li>
<li>
<a href="<c:url value="/logout" />">Logout</a>
</li>
</c:when>
</c:choose>
</ul>