<%-- 
    Document   : nhanvien_donhang
    Created on : May 13, 2021, 8:40:30 PM
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
<fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/nvdhview" />/?idDonHang=0" 
                           >+</a></fast-button>




<table id="table" class="table table-borderder" >
    <tr>
        <th>Mã</th>
        <th>Tên nhân viên</th>
        <th>Đơn hàng</th>
        <th>Ghi chú</th>
        <th></th>
        
    </tr>
    <c:forEach items="${nvdh}" var="nvdhang">
    <tr id="dhdv${nvdhang.idNhanVienDonHang}">
        <td>${nvdhang.idNhanVienDonHang}</td> 
        <td>${nvdhang.nhanVien2.tenNhanVien}</td> 
        <td>${nvdhang.donHang3.idDonHang}</td>
        <td>${nvdhang.ghiChu}</td>
        <td>
            <fast-button href="#" appearance="outline"  onclick="deleteNhanVienDonHang(${nvdhang.idNhanVienDonHang})">Xóa</fast-button>
            <fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/dhdvview" />/?idDonHangDichVu=${dhdvu.idDonHangDichVu}" 
                           >Cập nhật</a></fast-button>   
        </td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>
