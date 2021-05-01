<%-- 
    Document   : nhanvien
    Created on : Apr 28, 2021, 11:25:41 PM
    Author     : btson
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<h1 class="text-center text-success">NHAN VIEN</h1>
<form:form method="post" modelAttribute="nhanvien">
    <div class="form-group">
        <label><spring:message code="nhanvien.tenNhanVien" /></label>
        <form:input cssClass="form-control" path="tenNhanVien" />
    </div>
    <div class="form-group">
        <label><spring:message code="nhanvien.tenNghiepVu" /></label>
        <form:select path="category" cssClass="form-control">
            <c:forEach items="${categories}" var="cate">
            <option id="${cate.id}">${cate.name}</option>
            </c:forEach>
        </form:select>
    </div>
    <div class="form-group">
        <label><spring:message code="nhanvien.ghiChu" /></label>
        <form:input cssClass="form-control" path="ghiChu" />
    </div>
    
    <div>
        
        <input type="submit" class="btn btn-danger" value="<spring:message code="product.submit" />" />
    </div>
</form:form>