<%-- 
    Document   : nghiepvu
    Created on : May 3, 2021, 10:24:08 PM
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
<h1 >DANH SÁCH NHÂN VIÊN</h1>
<fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/nhanvien" />/?idNhanVien=0" 
                           >+</a></fast-button>
<fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/NghiepVu" />/" 
                           >Tất cả</a></fast-button>                           
<c:forEach items="${nghiepvu}" var="nvu">
    <fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/NghiepVu" />/?idNghiepVu=${nvu.idNghiepVu}" 
                           >${nvu.tenNghiepVu}</a></fast-button>   
</c:forEach>

<table id="table"  class="table table-borderder" >
    <tr>
        <th>Mã nhân viên</th>
        <th>Tên nhân viên</th>
        <th>Nghiệp vụ</th>
        <th></th>
    </tr>
    <c:forEach items="${nhanvien}" var="nvien">
    <tr id="nhanvien${nvien.idNhanVien}">
        <td>${nvien.idNhanVien}</td> 
        <td>${nvien.tenNhanVien}</td> 
        <td>${nvien.nghiepVu.tenNghiepVu}</td>
        <td>
            <fast-button href="#" appearance="outline"  onclick="deleteNhanVien(${nvien.idNhanVien})">Xóa</fast-button>
            <fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/nhanvien" />/?idNhanVien=${nvien.idNhanVien}" 
                           >Cập nhật</a></fast-button>
            <fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/nhanvien/info" />/?idNhanVien=${nvien.idNhanVien}" 
                           >Thông tin</a></fast-button>
            <fast-button appearance="accent"><a style="text-decoration: none; color:white"href="<c:url value="/nvdh/nhanvien" />/?idNhanVien=${nvien.idNhanVien}" 
                           >Các sảnh được phân bố </a></fast-button>
            
        </td>
    </tr>
    </c:forEach>
</table>

<script src="<c:url value="/js/main.js" />"></script>