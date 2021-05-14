<%-- 
    Document   : donhang_dichvu
    Created on : May 13, 2021, 4:24:06 PM
    Author     : btson
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
<h1 >Thông tin đơn hàng</h1>
<fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/dhdvview" />/?idDonHangDichVu=0" 
                           >+</a></fast-button>




<table id="table" class="table table-borderder" >
    <tr>
        <th>Mã</th>
        <th>đơn hàng</th>
        <th>dịch vụ</th>
        <th>Số lượng</th>
        <th>Giá tạm tính</th>
        <th></th>
        <th></th>
    </tr>
    <c:forEach items="${dhdv}" var="dhdvu">
    <tr id="dhdv${dhdvu.idDonHangDichVu}">
        <td>${dhdvu.idDonHangDichVu}</td> 
        <td>${dhdvu.donHang2.idDonHang}</td> 
        <td>${dhdvu.dichVu2.tenDichVu}</td>
        <td>${dhdvu.soLuong}</td>
        <td>${dhdvu.tamTinh}</td>
        <td>${dhdvu.ghiChu}</td>
        <td>
            <fast-button href="#" appearance="outline"  onclick="deleteDonHangDichVu(${dhdvu.idDonHangDichVu})">Xóa</fast-button>
            <fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/dhdvview" />/?idDonHangDichVu=${dhdvu.idDonHangDichVu}" 
                           >Cập nhật</a></fast-button>   
        </td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>
