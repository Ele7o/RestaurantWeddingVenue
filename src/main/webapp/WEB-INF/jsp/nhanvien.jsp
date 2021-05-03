<%-- 
    Document   : nhanvien
    Created on : Apr 28, 2021, 11:25:41 PM
    Author     : btson
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>


<h1 class="text-center text-success">DANH SÁCH NHÂN VIÊN</h1>

<table class="table">
    <tr>
        <th>Mã nhân viên</th>
        <th>Tên tên nhân</th>
        <th>Gía bán</th>
        <th></th>
    </tr>
    <c:forEach items="${products}" var="p">
    <tr id="product${p.id}">
        <td>${p.id}</td> 
        <td>${p.name}</td> 
        <td>${p.price} VNĐ</td> 
        <td>
            <a href="javascript:;" class="btn btn-danger" 
               onclick="deleteProduct(${p.id})">Xóa</a>
               <a href="<c:url value="/product" />/?productId=${p.id}" 
               class="btn btn-info">Cập nhật</a>
            <a href="javascript:;" 
               onclick="addToCart(${p.id})"
               class="btn btn-success">Thêm vào giỏ</a>
        </td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>
