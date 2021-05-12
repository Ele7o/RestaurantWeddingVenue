<%-- 
    Document   : dichvuaod
    Created on : May 11, 2021, 11:15:06 PM
    Author     : btson
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>








<fast-card style="width: 100% "><img src="https://via.placeholder.com/300x200/414141" />
    <div style="padding: 0 10px 10px;  color: var(--neutral-foreground-rest);">
        <c:url value="/DichVuView/add" var="action" />
        <form:form method="post" 
                action="${action}"
                modelAttribute="dichvu2">
            <form:errors path="*" element="div" 
                        cssClass="alert alert-danger" />
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="dichvu.idDichVu"/></label>
                    <form:input cssClass="form-control" path="idDichVu"/>
            </div>
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="dichvu.tenDichVu"/></label>
                <form:input cssClass="form-control" path="tenDichVu"/>
            </div>

            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="dichvu.gia" /></label>
                <form:input cssClass="form-control" path="gia" />
            </div>
        
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="frm.ghiChu" /></label>
                <form:input cssClass="form-control" path="ghiChu" />
            </div>
            <div style="margin-top: 20px;">
                
                <input type="submit" class="btn btn-danger" value="<spring:message code="frm.submit"/>"   />
            </div>
            
                    
        </form:form>
    </div>
</fast-card>

