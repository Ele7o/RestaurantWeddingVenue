<%-- 
    Document   : mon
    Created on : May 6, 2021, 6:57:59 PM
    Author     : X_X
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
</br>
<h1 >CÁC MÓN ĂN</h1>




<table  class="table table-dark" >
    <tr>
        <th>Mã món ăn</th>
        <th>Tên món ăn</th>
        <th>Giá</th>
        <th>Ghi chú</th>
    </tr>
    <c:forEach items="${mon}" var="mon">
    <tr id="mon${mon.idMon}">
        <td>${mon.idMon}</td> 
        <td>${mon.tenMon}</td>
        <td>${mon.gia}</td> 
        <td>${mon.ghiChu}</td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>
