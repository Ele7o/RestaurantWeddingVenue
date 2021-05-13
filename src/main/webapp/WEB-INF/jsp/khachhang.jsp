<%-- 
    Document   : khachhang
    Created on : May 6, 2021, 6:47:06 PM
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
<h1 >CÁC KHÁCH HÀNG</h1>
<fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/KhachHangView" />/?idDichVu=0" 
                           >+</a></fast-button>



<table id="table" class="table table-borderer" >
    <tr>
        <th>Mã khách hàng</th>
        <th>Tên khách hàng</th>
        <th>Số điện thoại</th>
        <th>Ghi chú</th>
        <th></th>
    </tr>
    <c:forEach items="${khachhang}" var="khang">
    <tr id="khachhang${khang.idKhachHang}">
        <td>${khang.idKhachHang}</td> 
        <td>${khang.tenKhachHang}</td>
        <td>${khang.soDT}</td> 
        <td>${khang.ghiChu}</td>
        <td>
            <fast-button href="#" appearance="outline"  onclick="deleteKhachHang(${khang.idKhachHang})">Xóa</fast-button>
            <fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/KhachHangView" />/?idKhachHang=${khang.idKhachHang}" 
                           >Cập nhật</a></fast-button>   
            <fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/DonHang/kh" />/?idKhachHang=${khang.idKhachHang}" 
                           >Lịch sử đặt tiệc</a></fast-button>   
        </td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>
