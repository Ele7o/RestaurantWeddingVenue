<%-- 
    Document   : rnghiepvu
    Created on : May 5, 2021, 5:11:01 PM
    Author     : btson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1 >DANH SÁCH NHÂN VIÊN</h1>




<table  class="table table-dark" >
    <tr>
        <th>Mã nghiep vu</th>
        <th>Tên nghiep vu</th>
        <th></th>
    </tr>
    <c:forEach items="${nghiepvu}" var="nvu">
    <tr id="nghiepvu${nvu.idNghiepVu}">
        <td>${nvu.idNghiepVu}</td> 
        <td>${nvu.tenNghiepVu}</td> 
        
        <td>
            

            
        </td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>