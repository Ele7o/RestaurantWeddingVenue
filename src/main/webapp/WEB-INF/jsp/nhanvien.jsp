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


<h1 class="text-center text-success">QUẢN LÝ SẢN PHẨM</h1>

<c:url value="/nhanvien/add" var="action" />
<form:form method="post" 
           action="${action}"
           modelAttribute="nhanvien">
    <form:errors path="*" element="div" 
                 cssClass="alert alert-danger" />
    <div class="form-group">
        <label><spring:message code="nhanvien.tenNhanVien" /></label>
        <form:input cssClass="form-control" path="${tenNhanVien}" />
    </div>
    <div class="form-group">
        <label><spring:message code="nhanvien.nghiepVu" /> </label>
        <form:select path="${nghiepVu}" cssClass="form-control">
            <c:forEach items="${nghiepvu}" var="ngvu">
                <c:if test="${ngvu.idNghiepVu == nhanvien.nghiepVu.idNghiepVu}">
                    <option selected value="${ngvu.idNghiepVu}">${ngvu.tenNghiepVu}</option>
                </c:if>
                <c:if test="${ngvu.idNghiepVu != nhanvien.nghiepVu.idNghiepVu}">
                    <option value="${ngvu.idNghiepVu}">${ngvu.tenNghiepVu}</option>
                </c:if>
            </c:forEach>
        </form:select>
    </div>
     <div class="form-group">
        <label><spring:message code="nhanvien.ghiChu" /></label>
        <form:input cssClass="form-control" path="${ghichu}" />
    </div>
    <div>
        <form:hidden path="${idNhanVien}" />
        <input type="submit" class="btn btn-danger" value="<spring:message code="nhanvien.submit" />" />
    </div>
            
</form:form>