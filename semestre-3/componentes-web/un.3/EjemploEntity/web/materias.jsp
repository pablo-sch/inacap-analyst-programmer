<%-- 
    Document   : materias.jsp
    Created on : 29-05-2019, 17:35:47
    Author     : Cesar
--%>

<%@page import="acciones.listado"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Materias"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
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
        <a class="nav-link" href="materias.jsp">Materias</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="clientes.jsp">Clientes</a>
      </li>
      
    </ul>
  </div>
</nav>
          <div class="row">
            <div class="col-md-6">
                <form action="srvmaterias" method="post">
                    <div class="form-group">
                        <label for="txtcodigo">Codigo</label>
                        <input type="number" class="form-control" name="txtcodigo" id="txtcodigo"  placeholder="Ingrese Codigo">
                        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                    </div>
                    <div class="form-group">
                        <label for="txtnombre">Nombre</label>
                        <input type="text" name="txtnombre" class="form-control" id="txtnombre" placeholder="Nombre">
                    </div>
                    <% 
                      /*  listado listado=new listado();
                        List<Materias> lista= listado.listar();
                        for(int i=0;i<lista.size();i++)
                        {
                            out.println(lista.get(i).getMatcodigo());
                        
                        } */
                     
                    %>
                    <button type="submit" name="btnenviar" class="btn btn-primary" value="Agregar">Agregar</button>
                    <button type="submit" name="btnenviar" class="btn btn-primary" value="Actualizar">Actualizar</button>
                    <button type="submit" name="btnenviar" class="btn btn-primary" value="Eliminar">Eliminar</button>
                    <button type="submit" name="btnenviar" class="btn btn-primary" value="Listado">Listado</button>
                    <button type="submit" name="btnenviar" class="btn btn-primary" value="Filtrar">Filtrar</button>
                </form>
            </div>
        </div>
        
        <script src="js/jquery-3.3.0.min.js" ></script>
        <script src="js/bootstrap.min.js" ></script>
    </body>
</html>
