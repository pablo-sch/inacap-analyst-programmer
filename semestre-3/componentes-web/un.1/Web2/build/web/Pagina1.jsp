<%-- 
    Document   : Pagina1
    Created on : 15-03-2019, 14:32:32
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
        <h1>Hello World!</h1>
        <%  //Esto es un Scriplet
            String saludo="Programacion Web en Java...";
            
        %>
        <h2><%=saludo%></h2> 
        <table border="1">
            <% for(int i=0;i<100;i++)
            {
             %>
             <tr><td><%=i%></td></tr>
             <% 
                 } 
             %>
        </table>
    </body>
</html>
