<%-- 
    Document   : nghiepvulist
    Created on : May 6, 2021, 2:53:05 PM
    Author     : X_X
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
</br>
<h1 >DANH SÁCH NGHIỆP VỤ</h1>

<style>
    body{
        margin:auto;
    }
    
    #table{
        color:white;
    }

</style>


<table id="table"  class="table table-borderer"  >
    <tr>
        <th>Mã nghiệp vụ</th>
        <th>Tên nghiệp vụ</th>
        <th>Ghi chú</th>
    </tr>
    <c:forEach items="${nghiepvulist}" var="nvu">
    <tr id="nghiepvu${nvu.idNghiepVu}">
        <td>${nvu.idNghiepVu}</td> 
        <td>${nvu.tenNghiepVu}</td> 
        <td>${nvu.ghiChu}</td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>
