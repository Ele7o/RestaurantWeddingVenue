<%-- 
    Document   : phanhoi
    Created on : May 6, 2021, 7:06:25 PM
    Author     : X_X
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    #table{
        color:white;
    }
</style>
</br>
<h1 >CÁC PHẢN HỒI</h1>




<table id="table"  class="table table-borderer" >
    <tr>
        <th>Mã phản hồi</th>
        <th>Mã đơn hàng</th>
        <th>Loại</th>
        <th>Nội dung</th>
        <th>Ghi chú</th>
    </tr>
    <c:forEach items="${phanhoi}" var="phanhoi">
    <tr id="phanhoi${phanhoi.idPhanHoi}">
        <td>${phanhoi.idPhanHoi}</td> 
        <td>${phanhoi.idDonHang}</td>
        <td>${phanhoi.loaiPhanHoi}</td> 
        <td>${phanhoi.noiDung}</td> 
        <td>${phanhoi.ghiChu}</td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>
