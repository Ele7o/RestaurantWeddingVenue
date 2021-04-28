<%-- 
    Document   : index
    Created on : Mar 27, 2021, 1:33:56 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        <h1>Hello World!</h1>
         <fast-button appearance="accent">Submit</fast-button>
        <h1 style="color:red">${messsage}</h1>
        
        <ul>
            <c:forEach items="${NghiepVu}" var="nghiepvu">
                <li>${nghiepvu.idNghiepVu} - ${nghiepvu.tenNghiepVu}</li>
            </c:forEach>
            
        </ul>

