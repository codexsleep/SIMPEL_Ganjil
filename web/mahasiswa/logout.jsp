<%-- 
    Document   : logout
    Created on : Feb 2, 2022, 10:06:33 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HttpSession sesi = request.getSession();
            sesi.invalidate();
            response.sendRedirect("login.jsp");
        %>
    </body>
</html>
