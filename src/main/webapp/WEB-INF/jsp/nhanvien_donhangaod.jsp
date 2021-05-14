<%-- 
    Document   : nhanvien_donhangaod
    Created on : May 14, 2021, 9:48:09 AM
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
        <c:url value="/nvdhview/add" var="action" />
        <form:form method="post" 
                action="${action}"
                modelAttribute="nvdh2">
            <form:errors path="*" element="div" 
                        cssClass="alert alert-danger" />
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="nvdh.idNvDh"/></label>
                <form:input cssClass="form-control" path="idNhanVienDonHang"  />
            </div>

            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="nhanvien.tenNhanVien" /> </label>
                <form:select path="idNhanVienForm2" cssClass="form-control">
                    <c:forEach items="${nhanvien2}" var="nvien">
                        <c:if test="${nvien.idNhanVien == nvdh2.nhanVien2.idNhanVien}">
                            <option selected value="${nvien.idNhanVien}">${nvien.tenNhanVien}</option>
                        
                        </c:if>
                        <c:if test="${nvien.idNhanVien != nvdh2.nhanVien2.idNhanVien}">
                            <option value="${nvien.idNhanVien}">${nvien.tenNhanVien}</option>
                        </c:if>
                    </c:forEach>
                </form:select>
            </div>
            <div class="form-group"  style="margin-top: 20px;">
                <label><spring:message code="donhang.idDonHang" /> </label>
                <form:select path="idDonHangForm2" cssClass="form-control">
                    <c:forEach items="${donhang3}" var="dhng">
                        <c:if test="${dhng.idDonHang == nvdh2.donHang3.idDonHang}">
                            <option selected value="${dhng.idDonHang}">${dhang.idDonHang}</option>
                        </c:if>
                        <c:if test="${dhang.idDonHang == nvdh2.donHang3.idDonHang}">
                            <option value="${dhng.idDonHang}">${dhng.idDonHang}</option>
                        </c:if>
                    </c:forEach>
                </form:select>
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
