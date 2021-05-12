<%-- 
    Document   : nhanvienview
    Created on : Apr 28, 2021, 11:25:41 PM
    Author     : btson
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>


<fast-card style="width: 100% "><img src="https://via.placeholder.com/300x200/414141" />
    <div style="padding: 0 10px 10px;  color: var(--neutral-foreground-rest);">
        <c:url value="/nhanvien/add" var="action" />
        <form:form method="post" 
                action="${action}"
                modelAttribute="nhanvien">
            <form:errors path="*" element="div" 
                        cssClass="alert alert-danger" />
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="nhanvien.idNhanVien"/></label>
                <form:input cssClass="form-control-plaintext" path="idNhanVien" style="color: #E1477E" disabled="true" />
            </div>

            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="nhanvien.tenNhanVien" /></label>
                <form:input cssClass="form-control-plaintext" path="tenNhanVien" style="color: #E1477E" disabled="true"/>
            </div>
            <div class="form-group"  style="margin-top: 20px;" >
                <label><spring:message code="nghiepvu.tenNghiepVu" /> </label>
                <form:select path="idNghiepVuForm" cssClass="form-control-plaintext" style="color: #E1477E" disabled="true">
                    <c:forEach items="${nghiepvu}" var="ngvu">
                        <c:if test="${ngvu.idNghiepVu == nhanvien.nghiepVu.idNghiepVu}">
                            <option selected value="${ngvu.idNghiepVu}">${ngvu.tenNghiepVu}</option>
                        
                        </c:if>
                        <c:if test="${ngvu.idNghiepVu != nhanvien.nghiepVu.idNghiepVu}">
                            <option value="${ngvu.idNghiepVu}">${ngvu.tenNghiepVu}</option>
                        </c:if>
                    </c:forEach>
                </form:select>
        
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="frm.ghiChu" /></label>
                <form:input cssClass="form-control-plaintext" style="color: #E1477E" path="ghiChu" disabled="true"/>
                  
            </div>
            
        </form:form>
    </div>
        
</fast-card>
        