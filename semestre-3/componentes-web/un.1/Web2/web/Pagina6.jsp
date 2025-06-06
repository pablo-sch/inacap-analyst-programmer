<%-- 
    Document   : Pagina6
    Created on : 15-03-2019, 15:17:44
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
        <form action="Pagina7.jsp" method="post">
        <table border="1">
            <tr>
                <td>Numero 1</td>
                <td><input type="text" name="txtnum1"></td>
            </tr>
             <tr>
                <td>Numero 2</td>
                <td><input type="text" name="txtnum2"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" name="btnEnviar" value="Enviar"></td>
            </tr>
        </table>
        </form>
    </body>
</html>
