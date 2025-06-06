package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Usuario;

public final class cargarimagen_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

             HttpSession sesion = request.getSession();  
             Usuario user= new Usuario();
        
      out.write("\n");
      out.write("         <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("    <ul class=\"navbar-nav\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("         <form action=\"srvmenu\" method=\"post\" id=\"opimagenes\">\n");
      out.write("                 <input type=\"hidden\" name=\"op\" value=\"imagen\"> \n");
      out.write("        <a class=\"nav-link\" href=\"javascript: document.getElementById('opimagenes').submit();\">Imagenes</a>\n");
      out.write("            </form>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("           <form action=\"srvmenu\" method=\"post\" id=\"oplista\">\n");
      out.write("                 <input type=\"hidden\" name=\"op\" value=\"lista\"> \n");
      out.write("        <a class=\"nav-link\" href=\"javascript: document.getElementById('oplista').submit();\">Lista</a>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("      </li>\n");
      out.write("       <li class=\"nav-item\">\n");
      out.write("           <form action=\"srvmenu\" method=\"post\" id=\"opsalir\">\n");
      out.write("                <input type=\"hidden\" name=\"op\" value=\"salir\"> \n");
      out.write("                ");

                      sesion= request.getSession();
                       user = (Usuario) sesion.getAttribute("usuario");
                      sesion.setAttribute("usuario", user); //pasamos el objeto completo
                 
      out.write("\n");
      out.write("        <a class=\"nav-link\" href=\"javascript: document.getElementById('opsalir').submit();\">Salir</a>\n");
      out.write("           </form>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("          ");

                  
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
                    
                    
                    
                  
      out.write("\n");
      out.write("\n");
      out.write("          <div class=\"row\">\n");
      out.write("              <div class=\"col-md-6\">\n");
      out.write("                 \n");
      out.write("                      <form class=\"form-control\" method=\"post\" enctype='multipart/form-data' action=\"srvimagenes\">\n");
      out.write("                          Por favor, seleccione fichero a subir<br/>\n");
      out.write("                          <input type=\"file\" name=\"foto\" /> \n");
      out.write("                          </br>\n");
      out.write("                          <input type=\"submit\" name=\"cargar\" value=\"Subir\" />\n");
      out.write("                      </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script src=\"js/jquery-3.3.0.min.js\" ></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" ></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
