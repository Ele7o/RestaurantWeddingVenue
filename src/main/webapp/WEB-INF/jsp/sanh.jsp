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




<table  class="table table-dark" >
    <tr>
        <th>Mã sảnh</th>
        <th>Sức chứa</th>
        <th>Giá</th>
        <th>Tình trạng</th>
        <th>Ghi chú</th>
    </tr>
    <c:forEach items="${sanh}" var="sanh">
    <tr id="sanh${sanh.idSanh}">
        <td>${sanh.idPhanHoi}</td> 
        <td>${sanh.sucChua}</td>
        <td>${sanh.gia}</td> 
        <td>${sanh.tinhTrang}</td> 
        <td>${sanh.ghiChu}</td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>
