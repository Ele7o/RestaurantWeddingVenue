<%-- 
    Document   : donhang
    Created on : May 6, 2021, 4:00:21 PM
    Author     : X_X
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
</br>
<h1 >DANH SÁCH CÁC ĐƠN HÀNG</h1>




<table  class="table table-dark" >
    <tr>
        <th>Mã đơn hàng</th>
        <th>Mã khách hàng</th>
        <th>Mã sảnh</th>
        <th>Ngày tổ chức</th>
        <th>Ghi chú</th>
    </tr>
    <c:forEach items="${donhang}" var="dhang">
    <tr id="donhang${dhang.idDonHang}">
        <td>${dhang.idDonHang}</td> 
        <td>${dhang.idKhachHang}</td> 
        <td>${dhang.idSanh}</td>
        <td>${dhang.ngayToChuc}</td>
        <td>${dhang.ghiChu}</td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>
