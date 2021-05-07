<%-- 
    Document   : base
    Created on : Apr 28, 2021, 9:52:33 AM
    Author     : btson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles"
          uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <title>
            <tiles:insertAttribute name="title" />
        </title>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
         <script type="module" src="https://unpkg.com/@microsoft/fast-components"></script>
        
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        
         <script type="module">
          import { FASTElement } from "https://unpkg.com/@microsoft/fast-element";

          // your code here
           </script>
           
        
    </head>
    <body>
        <fast-design-system-provider use-defaults use-defaults  >
            
             <tiles:insertAttribute name="header" />
        
        </br>
            <!-- content -->
            <tiles:insertAttribute name="content" />

            <!-- footer -->
            <tiles:insertAttribute name="footer" />
        </br>
    </fast-design-system-provider>
           
        
    </body>
</html>
