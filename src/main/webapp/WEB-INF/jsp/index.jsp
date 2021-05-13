<%-- 
    Document   : index
    Created on : Mar 27, 2021, 1:33:56 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<a%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<style>
    
      th{
          height: 300px;
          text-align: center;
          vertical-align: middle;
          text-decoration: none;
      }
</style>


<!doctype html>


    <!-- Bootstrap CSS -->
    


<!doctype html>


    <!-- Bootstrap CSS -->
    
    

    <table  class="table table-bordered" style="color: #E1477E">
        <tr>
            <th><a style="text-decoration: none; color: #E1477E" href="<c:url value="/NghiepVu/" />">Quan Ly Nhan Vien</a></th>
            <th ><a style="text-decoration: none; color: #E1477E" href="<c:url value="/KhachHang/" />">Quan Ly Khach Hang</th>
            <th><a style="text-decoration: none; color: #E1477E" href="<c:url value="/DichVu/"/>">Quan Ly Dich Vu </a></th>
          
            
        </tr>
        <tr>
            <th ><a style="text-decoration: none;color: #E1477E " href="<c:url value="/Sanh/"/>">Quan Ly Sanh </a></th>
            <th ><a style="text-decoration: none; color: #E1477E" href="<c:url value="/NghiepVuList/"/>">Quan Ly Nghiep Vu </th>
            <th ><a style="text-decoration: none; color: #E1477E" href="<c:url value="/PhanHoi/"/>">Quan Ly Phan Hoi</th>
        </tr>
        <tr>
            <th ><a style="text-decoration: none;color: #E1477E " href="<c:url value="/DonHang/"/>">Quan Ly Don Hang </a></th>
            <th ><a style="text-decoration: none;color: #E1477E " href="<c:url value="/dhdv/"/>">DonHang_DichVu </a></th>
            <th ><a style="text-decoration: none;color: #E1477E " href="<c:url value="/nvdh/"/>">NhanVien_DonHang </a></th>
        </tr>
    </table>