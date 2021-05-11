<%-- 
    Document   : sanh
    Created on : May 6, 2021, 7:15:19 PM
    Author     : X_X
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
</br>
<h1 >SẢNH</h1>
<fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/SanhView" />/?idSanh=0" 
                           >+</a></fast-button>
<style>
    #table{
        color:white;
    }
</style>



<table id="table" class="table table-borderder" style="background-color:#181818" >
    <tr>
        <th>Mã sảnh</th>
        <th>Sức chứa</th>
        <th>Giá</th>
        <th>Tình trạng</th>
        <th>Ghi chú</th>
        <th></th>
    </tr>
    <c:forEach items="${sanh}" var="sanh">
    <tr id="sanh${sanh.idSanh}">
        <td>${sanh.idSanh}</td> 
        <td>${sanh.sucChua}</td>
        <td>${sanh.gia}</td> 
        <td>${sanh.tinhTrang}</td> 
        <td>${sanh.ghiChu}</td>
        <td>
            <fast-button href="#" appearance="outline"  onclick="deleteSanh(${sanh.idSanh})">Xóa</fast-button>
            <fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/SanhView" />/?idSanh=${sanh.idSanh}" 
                           >Cập nhật</a></fast-button>

            
        </td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>
