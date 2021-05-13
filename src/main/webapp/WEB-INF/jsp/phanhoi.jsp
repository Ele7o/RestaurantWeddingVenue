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
<fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/PhanHoiView" />/?idPhanHoi=0" 
                           >+</a></fast-button>



<table id="table"  class="table table-borderer" >
    <tr>
        <th>Mã phản hồi</th>
        <th>Mã đơn hàng</th>
        <th>Loại</th>
        <th>Nội dung</th>
        <th>Ghi chú</th>
        <th></th>
    </tr>
    <c:forEach items="${phanhoi}" var="phanhoi">
    <tr id="phanhoi${phanhoi.idPhanHoi}">
        <td>${phanhoi.idPhanHoi}</td> 
        <td>${phanhoi.donHang.idDonHang}</td>
        <td>${phanhoi.loaiPhanHoi}</td> 
        <td>${phanhoi.noiDung}</td> 
        <td>${phanhoi.ghiChu}</td>
        <td>
            <fast-button href="#" appearance="outline"  onclick="deletePhanHoi(${phanhoi.idPhanHoi})">Xóa</fast-button>
            <fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/PhanHoiView" />/?idPhanHoi=${phanhoi.idPhanHoi}" 
                           >Cập nhật</a></fast-button>

            
        </td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>
