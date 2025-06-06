<%-- 
    Document   : Pagina5
    Created on : 15-03-2019, 15:07:34
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
        <% int num= Integer.parseInt(request.getParameter("txtnum"));
        
        %>
        <table>
            <% for(int i=0;i<num;i++)
            {
                %> <tr><td><%=i%></td></tr>
            <%}
            %> 
            
        </table>
    </body>
</html>
