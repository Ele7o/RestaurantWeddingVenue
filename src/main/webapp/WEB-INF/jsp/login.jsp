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

<spring:url value="/login" var="action" />
    <form action="${action}" method="post" >
        <div class="form-group">
            <label for="tenTaiKhoanId">
                <spring:message code="taiKhoan.tenTaiKhoan" />
            </label>
            <input name="tenTaiKhoan" id="tenTaiKhoanId" 
                class="form-control" />
        </div>
        <div class="form-group">
            <label for="matKhauId">
                <spring:message code="taiKhoan.matKhau" />
            </label>
            <input id="matKhauId" name="matKhau" 
                class="form-control" type="password" />
        </div>
        <div class="form-group">
            <input type="submit"
                value="<spring:message code="taiKhoan.login" />"/>
        </div>
</form>

<ul>
    <c:choose>
    <c:when test="${pageContext.request.userPrincipal.name == null}">
        <li>
            <a href="<c:url value="/register" />">Register</a>
        </li>
        <li>
            <a href="<c:url value="/login" />">Login</a>
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