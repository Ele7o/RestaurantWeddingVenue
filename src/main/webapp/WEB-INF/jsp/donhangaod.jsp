<%-- 
    Document   : donhangaod
    Created on : May 12, 2021, 12:40:27 PM
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
        <c:url value="/DonHangView/add" var="action" />
        <form:form method="post" 
                action="${action}"
                modelAttribute="donhang2">
            <form:errors path="*" element="div" 
                        cssClass="alert alert-danger" />
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="donhang.idDonHang"/></label>
                <form:input cssClass="form-control" path="idDonHang"  />
            </div>

            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="sanh.idSanh" /> </label>
                <form:select path="idKhachHangForm" cssClass="form-control">
                    <c:forEach items="${khachhang3}" var="khg">
                        <c:if test="${khg.idKhachHang == donhang2.khachHang.idKhachHang}">
                            <option selected value="${khg.idKhachHang}">${khg.tenKhachHang}</option>
                        
                        </c:if>
                        <c:if test="${khg.idKhachHang != donhang2.khachHang.idKhachHang}">
                            <option value="${khg.idKhachHang}">${khg.tenKhachHang}</option>
                        </c:if>
                    </c:forEach>
                </form:select>
            </div>
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="sanh.idSanh" /> </label>
                <form:select path="idSanhForm" cssClass="form-control">
                    <c:forEach items="${sanh3}" var="sanh">
                        <c:if test="${sanh.idSanh == donhang2.sanh.idSanh}">
                            <option selected value="${sanh.idSanh}">${sanh.idSanh}</option>
                        
                        </c:if>
                        <c:if test="${sanh.idSanh != donhang2.sanh.idSanh}">
                            <option value="${sanh.idSanh}">${sanh.idSanh}</option>
                        </c:if>
                    </c:forEach>
                </form:select>
            </div>
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="donhang.ngayToChuc" /></label>
                <form:input type="date" cssClass="form-control" path="ngayToChuc" />
            </div>
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="frm.ghiChu" /></label>
                <form:input cssClass="form-control" path="ghiChu" />
            </div>
            <div style="margin-top: 20px;">
                
                <input type="submit" class="btn btn-danger"  value="<spring:message code="frm.submit" />" />
            </div>
            
                    
        </form:form>
    </div>
</fast-card>
