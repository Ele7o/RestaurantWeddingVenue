<%-- 
    Document   : phanhoiaod
    Created on : May 13, 2021, 1:18:18 PM
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
        <c:url value="/PhanHoiView/add" var="action" />
        <form:form method="post" 
                action="${action}"
                modelAttribute="phanhoi2">
            <form:errors path="*" element="div" 
                        cssClass="alert alert-danger" />
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="phanhoi.idPhanHoi"/></label>
                <form:input cssClass="form-control" path="idPhanHoi" style="color: #E1477E"  />
            </div>
            <div class="form-group"  style="margin-top: 20px;" >
                <label><spring:message code="donhang.idDonHang" /> </label>
                <form:select path="idDonHangForm" cssClass="form-control" style="color: #E1477E">
                    <c:forEach items="${donhang3}" var="dhang">
                        <c:if test="${dhang.idDonHang == phanhoi2.donHang.idDonHang}">
                            <option selected value="${dhang.idDonHang}">${dhang.idDonHang}</option>
                        
                        </c:if>
                        <c:if test="${dhang.idDonHang != phanhoi2.donHang.idDonHang}">
                            <option value="${dhang.idDonHang}">${dhang.idDonHang}</option>
                        </c:if>
                    </c:forEach>
                </form:select>
                
             <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="phanhoi.loaiPhanHoi"/></label>
                <form:input cssClass="form-control" path="loaiPhanHoi" style="color: #E1477E" />
            </div> 
             <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="phanhoi.noiDung"/></label>
                <form:input cssClass="form-control" path="noiDung" style="color: #E1477E" />
            </div> 
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="frm.ghiChu" /></label>
                <form:input cssClass="form-control" style="color: #E1477E" path="ghiChu" />
                  
            </div>
            <div style="margin-top: 20px;">
                
                <input type="submit" class="btn btn-danger" value="<spring:message code="frm.submit"/>"   />
            </div>
            
        </form:form>
    </div>
        
</fast-card>
        