<%-- 
    Document   : register
    Created on : May 11, 2021, 12:20:43 PM
    Author     : X_X
--%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container" id="register-container">
    <div id="register-block" >
        <div class="row w-100" >
            <a href="<c:url value="/register/" />" type="button" class="btn btn-primary col-6 active">Đăng kí</a>
        </div>

        <c:choose>
            <c:when test="${form == null}">
                <form:form id="user" method="POST" action="/NhaHangTiecCuoi/register/" 
                           modelAttribute="register" enctype="multipart/form-data">
                    <div class="row justify-content-around">
                        <img height="120px" width="120px" 
                             src="<c:url value="/resources/images/user.png" />" 
                             alt="logo">
                    </div>
                    <form:errors path="*" cssClass="text-danger" />
                    <div class="text-danger">${otherError}</div>
                    <div class="form-group">
                        <form:label path="tenTaiKhoan">Tên đăng nhập</form:label>
                        <form:input path="tenTaiKhoan" class="form-control" type="text" />
                        <form:errors path="tenTaiKhoan" cssClass="text-danger" />
                    </div>
                    
                    <div class="form-group">
                        <form:label path="matKhau">Mật Khẩu</form:label>
                        <form:input path="matKhau" class="form-control" type="password" />
                        <form:errors path="matKhau" cssClass="text-danger" />
                    </div>
                    
                    <div class="form-group">
                        <form:label path="mail">Email</form:label>
                        <form:input path="mail" class="form-control" type="text" />
                        <form:errors path="mail" cssClass="text-danger" />
                    </div>

                    <input class="form-control btn btn-success" type="submit" value="Đăng Ký">
                </form:form>
            </c:when>
        </c:choose>

        <div class="text-center py-2">
            <a href="<c:url value="/login/"/>">Đã có tài khoản</a>
        </div>
        <script src="<c:url value="/resources/js/register.js"/>"></script>
    </div>
</div>
