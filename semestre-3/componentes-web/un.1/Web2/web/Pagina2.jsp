<%-- 
    Document   : Pagina2
    Created on : 15-03-2019, 14:49:22
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
        <form action="Pagina3.jsp" method="post">
        <table border="1">
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="txtname"></td>
            </tr>
             <tr>
                <td>Apellido</td>
                <td><input type="text" name="txtlastname"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" name="btnEnviar" value="Enviar"></td>
            </tr>
        </table>
        </form>
    </body>
</html>
