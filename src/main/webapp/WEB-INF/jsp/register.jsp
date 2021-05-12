<%-- 
    Document   : register
    Created on : May 12, 2021, 2:12:59 PM
    Author     : X_X
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" 
uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" 
uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" 
uri="http://java.sun.com/jsp/jstl/core" %>

<form:form action="/NhaHangTiecCuoi/register/" method="post" modelAttribute="regis" enctype="multipart/form-data" >
    <form:errors path="*" cssClass="text-danger" />
        <div class="text-danger">${otherError}</div>
    <div class="form-group">
        <form:label path="tenTaiKhoan">Tên đăng nhập</form:label>
        <form:input path="tenTaiKhoan" cssClass="form-control" type="text" />
        <form:errors path="tenTaiKhoan" cssClass="text-danger" />
    </div>
    <div class="form-group">
        <form:label path="matKhau">Mật khẩu</form:label>
        <form:input path="matKhau" class="form-control" type="text" />

    </div>
    <div class="form-group">
        <form:label path="mail">Email</form:label>
        <form:input path="mail" class="form-control" type="text" />

    </div>
    <div class="form-group">
        <input type="submit"value="<spring:message code="user.register" />"/>
    </div>
</form:form>

<ul>
    <c:choose>
        <c:when test="${pageContext.request.userPrincipal.name == null}">
            <li>
                <a href="<c:url value="/login/" />">Đăng nhập</a>
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
