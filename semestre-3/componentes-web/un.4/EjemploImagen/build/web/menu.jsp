<%-- 
    Document   : menu
    Created on : 05-07-2019, 12:27:41
    Author     : Cesar
--%>

<%@page import="modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="css/bootstrap.min.css">

    </head>
    <body>
        <%
             HttpSession sesion = request.getSession();  
             Usuario user= new Usuario();
        %>
         <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
         <form action="srvmenu" method="post" id="opimagenes">
                 <input type="hidden" name="op" value="imagen"> 
        <a class="nav-link" href="javascript: document.getElementById('opimagenes').submit();">Subir Imagen</a>
            </form>
      </li>
      <li class="nav-item">
           <form action="srvmenu" method="post" id="oplista">
                 <input type="hidden" name="op" value="lista"> 
        <a class="nav-link" href="javascript: document.getElementById('oplista').submit();">Lista</a>
            </form>

      </li>
       <li class="nav-item">
           <form action="srvmenu" method="post" id="opsalir">
                <input type="hidden" name="op" value="salir"> 
                <%
                      sesion= request.getSession();
                       user = (Usuario) sesion.getAttribute("usuario");
                      sesion.setAttribute("usuario", user); //pasamos el objeto completo
                 %>
        <a class="nav-link" href="javascript: document.getElementById('opsalir').submit();">Salir</a>
           </form>
      </li>
      
    </ul>
  </div>
</nav>
          <div class="row">
              <div class="col-md-6">
                 
                  <%
                  
                            if (sesion.getAttribute("usuario") != null) {
                                user = (Usuario) sesion.getAttribute("usuario");
                                out.println("<hr>");
                                out.println("BIENVENIDO");
                                out.println("Usuario: " + user.getUser());
                                out.println("<hr>");
                            }
                                       
                        
                    else
                    {
                          response.sendRedirect("login.jsp");
                    }
                    
                    
                    
                  %>



              </div>
        </div>
        
        <script src="js/jquery-3.3.0.min.js" ></script>
        <script src="js/bootstrap.min.js" ></script>
    </body>
</html>
