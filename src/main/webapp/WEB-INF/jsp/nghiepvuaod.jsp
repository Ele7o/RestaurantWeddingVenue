<%-- 
    Document   : nghiepvuaod
    Created on : May 12, 2021, 12:57:57 AM
    Author     : btson
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>








<fast-card style="width: 100% "><img src="https://via.placeholder.com/300x200/414141" />
    <div style="padding: 0 10px 10px;  color: var(--neutral-foreground-rest);">
        <c:url value="/NghiepVuListView/add" var="action" />
        <form:form method="post" 
                action="${action}"
                modelAttribute="nghiepvu2">
            <form:errors path="*" element="div" 
                        cssClass="alert alert-danger" />
            <div class="form-group"  style="margin-top: 20px;">
<!--                <label><spring:message code="sanh.idSanh"/></label>-->
                    <form:input cssClass="form-control" path="idNghiepVu"/>
            </div>
            <div class="form-group"  style="margin-top: 20px;">
<!--                <label><spring:message code="sanh.sucChua"/></label>-->
                <form:input cssClass="form-control" path="tenNghiepVu"/>
            </div>

            <div class="form-group"  style="margin-top: 20px;">
<!--                <label><spring:message code="sanh.gia" /></label>-->
                <form:input cssClass="form-control" path="ghiChu" />
            </div>
        
           
            <div style="margin-top: 20px;">
                
                <input type="submit" class="btn btn-danger" value="<spring:message code="frm.submit"/>"   />
            </div>
            
                    
        </form:form>
    </div>
</fast-card>

