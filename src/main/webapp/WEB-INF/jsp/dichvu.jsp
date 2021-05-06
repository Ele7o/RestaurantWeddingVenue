<%-- 
    Document   : dichvu
    Created on : May 6, 2021, 3:49:41 PM
    Author     : X_X
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
</br>
<h1 >DANH SÁCH DỊCH VỤ</h1>




<table  class="table table-dark" >
    <tr>
        <th>Mã dịch vụ</th>
        <th>Tên dịch vụ</th>
        <th>Giá</th>
        <th>Ghi chú</th>
    </tr>
    <c:forEach items="${dichvu}" var="dvu">
    <tr id="dichvu${dvu.idDichVu}">
        <td>${dvu.idDichVu}</td> 
        <td>${dvu.tenDichVu}</td> 
        <td>${dvu.gia}</td>
        <td>${dvu.ghiChu}</td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>
