<%-- 
    Document   : suanghiepvulist
    Created on : May 9, 2021, 3:41:48 PM
    Author     : X_X
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<fast-card style="width: 100% "><img src="https://via.placeholder.com/300x200/414141" />
    <div style="padding: 0 10px 10px;  color: var(--neutral-foreground-rest);">
        <c:url value="/NghiepVuList/suanghiepvu/add" var="action" />
        <form:form method="post" 
                action="${action}"
                modelAttribute="nghiepvu">
            <form:errors path="*" element="div" 
                        cssClass="alert alert-danger" />
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="nghiepvu.idNghiepVu"/></label>
                <form:input cssClass="form-control" path="idNghiepVu" style="color: #E1477E"  />
            </div>

            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="nghiepvu.tenNghiepVu" /></label>
                <form:input cssClass="form-control" path="tenNghiepVu" style="color: #E1477E" />
            </div>
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="nghiepvu.ghiChu" /></label>
                <form:input cssClass="form-control" style="color: #E1477E" path="ghiChu" />
                  
            </div>
            <div style="margin-top: 20px;">
                
                <input type="submit" class="btn btn-danger"  value="<spring:message code="nghiepvu.submit" />" />
            </div>
            
            
        </form:form>
    </div>
        
</fast-card>
