<%-- 
    Document   : khachhang
    Created on : May 6, 2021, 6:47:06 PM
    Author     : X_X
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
</br>
<h1 >CÁC KHÁCH HÀNG</h1>




<table  class="table table-dark" >
    <tr>
        <th>Mã khách hàng</th>
        <th>Tên khách hàng</th>
        <th>Số điện thoại</th>
        <th>Ghi chú</th>
    </tr>
    <c:forEach items="${khachhang}" var="khang">
    <tr id="khachhang${khang.idKhachHang}">
        <td>${khang.idKhachHang}</td> 
        <td>${khang.tenKhachHang}</td>
        <td>${khang.soDT}</td> 
        <td>${khang.ghiChu}</td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>
