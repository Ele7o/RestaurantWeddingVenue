<%-- 
    Document   : nghiepvu
    Created on : May 3, 2021, 10:24:08 PM
    Author     : btson
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
</br>
<h1 >DANH SÁCH NHÂN VIÊN</h1>




<table  class="table table-dark" >
    <tr>
        <th>Mã nhân viên</th>
        <th>Tên nhân viên</th>
        <th></th>
    </tr>
    <c:forEach items="${nhanvien}" var="nvien">
    <tr id="nhanvien${nvien.idNhanVien}">
        <td>${nvien.idNhanVien}</td> 
        <td>${nvien.tenNhanVien}</td> 
        
        <td>
            <fast-button href="#" appearance="accent" onclick="deleteNhanVien(${nvien.idNhanVien})">Xóa</fast-button>
             <a href="<c:url value="/nhanvien" />/?idNhanVien=${nvien.idNhanVien}" 
               class="btn btn-info">Cập nhật</a>

            
        </td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>