<%-- 
    Document   : index
    Created on : Mar 27, 2021, 1:33:56 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
 

<!doctype html>


    <!-- Bootstrap CSS -->
    

    <style>
        .carousel-item{
                height: 32rem;
                background: #777;
                color:white;
                posision: relative; 
        }
        .container{
            position: absolute;
            bottom:0;
            left:0;
            right:0;
            padding-bottom: 50px;
        }
    </style>
    </br>
    </br>
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <div class="carousel-inner">
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1" ></li>
        </ol>
        <div class="carousel-item active">
            <div class="container">
                <h1>Headline</h1>
                <p>VAILOZDAUCATMOi</p>
                <a href="#"class="btn btn-lg btn-primary">
                    Sign up
                </a>
            </div>
        </div>
        <div class="carousel-item">
            <div class="container">
                <h1>DickHEad</h1>
                <p>VAILOZDAUCATMOi</p>
                <a href="#"class="btn btn-lg btn-primary">
                    Sign up
                </a>
            </div>
        </div>
    </div>
    </div>


    <!-- Optional JavaScript; choose one of the two! -->

<!--     Option 1: Bootstrap Bundle with Popper 
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>-->

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js" integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js" integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc" crossorigin="anonymous"></script>
    


