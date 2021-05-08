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




<table  class="table table-borderder" >
    <tr>
        <th>Mã đơn hàng</th>
        <th>Mã khách hàng</th>
        <th>Mã sảnh</th>
        <th>Ngày tổ chức</th>
        <th>Ghi chú</th>
        <th></th>
    </tr>
    <c:forEach items="${donhang}" var="dhang">
    <tr id="donhang${dhang.idDonHang}">
        <td>${dhang.idDonHang}</td> 
        <td>${dhang.idKhachHang}</td> 
        <td>${dhang.idSanh}</td>
        <td>${dhang.ngayToChuc}</td>
        <td>${dhang.ghiChu}</td>
        <td>
            <fast-button href="#" appearance="outline"  onclick="deleteDonHang(${dhang.idDonHang})">Xóa</fast-button>
            <fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/donhang" />/?idDonHang=${dhang.idDonHang}" 
                           >Cập nhật</a></fast-button>   
        </td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>
