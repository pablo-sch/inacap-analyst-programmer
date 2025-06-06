<%-- 
    Document   : Pagina3
    Created on : 15-03-2019, 14:57:30
    Author     : cesar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String nombre=request.getParameter("txtname");
            String apellido=request.getParameter("txtlastname");
         %>
        <table border="1">
            <tr>
                <td>Nombre</td>
                <td><%=nombre%></td>
            </tr>
             <tr>
                <td>Apellido</td>
                <td><%=apellido%></td>
            </tr>
            <tr>
                <td></td>
                <td><a href="Pagina2.jsp">Volver </a></td>
            </tr>
        </table>
    </body>
</html>
