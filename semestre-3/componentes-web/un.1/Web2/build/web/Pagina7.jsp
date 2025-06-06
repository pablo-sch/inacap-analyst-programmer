<%-- 
    Document   : Pagina7
    Created on : 15-03-2019, 15:19:15
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
            int n1=Integer.parseInt(request.getParameter("txtnum1"));
            int n2=Integer.parseInt(request.getParameter("txtnum2"));
            int r=n1+n2;
         %>
        <table border="1">
            <tr>
                <td>Numero 1</td>
                <td><%=n1%></td>
            </tr>
             <tr>
                <td>Numero 2</td>
                <td><%=n2%></td>
            </tr>
            <tr>
                <td>Suma</td>
                <td><%=r%></td>
            </tr>
            <tr>
                <td></td>
                <td><a href="Pagina6.jsp">Volver </a></td>
            </tr>
        </table>
    </body>
</html>
