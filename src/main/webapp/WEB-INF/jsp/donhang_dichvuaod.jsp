<%-- 
    Document   : donhang_dichvuaod
    Created on : May 13, 2021, 6:25:48 PM
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
        <c:url value="/dhdvview/add" var="action" />
        <form:form method="post" 
                action="${action}"
                modelAttribute="dhdv2">
            <form:errors path="*" element="div" 
                        cssClass="alert alert-danger" />
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="dhdv.idDhDv"/></label>
                <form:input cssClass="form-control" path="idDonHangDichVu"  />
            </div>

            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="donhang.idDonHang" /> </label>
                <form:select path="idDonHangForm2" cssClass="form-control">
                    <c:forEach items="${donhang4}" var="dhang">
                        <c:if test="${dhang.idDonHang == dhdv2.donHang2.idDonHang}">
                            <option selected value="${dhang.idDonHang}">${dhang.idDonHang}</option>
                        
                        </c:if>
                        <c:if test="${dhang.idDonHang != dhdv2.donHang2.idDonHang}">
                            <option value="${dhang.idDonHang}">${dhang.idDonHang}</option>
                        </c:if>
                    </c:forEach>
                </form:select>
            </div>
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="dichvu.tenDichVu" /> </label>
                <form:select path="idDichVuForm2" cssClass="form-control">
                    <c:forEach items="${dichvu3}" var="dvu">
                        <c:if test="${dvu.idDichVu == dhdv2.dichVu2.idDichVu}">
                            <option selected value="${dvu.idDichVu}">${dvu.tenDichVu}</option>
                        
                        </c:if>
                        <c:if test="${dvu.idDichVu != dhdv2.dichVu2.idDichVu}">
                            <option value="${dvu.idDichVu}">${dvu.tenDichVu}</option>
                        </c:if>
                    </c:forEach>
                </form:select>
            </div>
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="dhdv.soLuong" /></label>
                <form:input cssClass="form-control" path="soLuong" />
            </div>
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="dhdv.tamTinh" /></label>
                <form:input cssClass="form-control" path="tamTinh" />
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
