<%-- 
    Document   : olahLogin
    Created on : Feb 2, 2022, 9:50:09 AM
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
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistem_peminjamanlab", "root", "");
                if (conn != null) {
                    if (username != null && password != null) {
                        Statement st = conn.createStatement();
                        String query = "SELECT * FROM login_mhs where username ='" + username + "' AND password = '" + password + "'";
                        ResultSet rs = null;
                        rs = st.executeQuery(query);
                        int cek = 0;
                        while (rs.next()) {
                            cek++;
                            HttpSession sesi = request.getSession();
                            sesi.setAttribute("fullname", rs.getString("fullname"));
                        }
                        if (cek > 0) {
                            response.sendRedirect("beranda.jsp");
                        } else {
                            response.sendRedirect("login.jsp");
                        }
                    }
                } else {
                    response.sendRedirect("errorPageKalauAda.jsp");
                }
            } catch (Exception e) {
                out.println("Can't connect to database:" + e.getMessage());
            }
        %>
    </body>
</html>
