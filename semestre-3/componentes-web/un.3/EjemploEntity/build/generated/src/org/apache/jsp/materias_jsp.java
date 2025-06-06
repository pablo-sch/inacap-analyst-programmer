package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import acciones.listado;
import java.util.List;
import modelo.Materias;

public final class materias_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <a class=\"nav-link\" href=\"materias.jsp\">Materias</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"clientes.jsp\">Clientes</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <form action=\"srvmaterias\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtcodigo\">Codigo</label>\n");
      out.write("                        <input type=\"number\" class=\"form-control\" name=\"txtcodigo\" id=\"txtcodigo\"  placeholder=\"Ingrese Codigo\">\n");
      out.write("                        <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"txtnombre\">Nombre</label>\n");
      out.write("                        <input type=\"text\" name=\"txtnombre\" class=\"form-control\" id=\"txtnombre\" placeholder=\"Nombre\">\n");
      out.write("                    </div>\n");
      out.write("                    ");
 
                      /*  listado listado=new listado();
                        List<Materias> lista= listado.listar();
                        for(int i=0;i<lista.size();i++)
                        {
                            out.println(lista.get(i).getMatcodigo());
                        
                        } */
                     
                    
      out.write("\n");
      out.write("                    <button type=\"submit\" name=\"btnenviar\" class=\"btn btn-primary\" value=\"Agregar\">Agregar</button>\n");
      out.write("                    <button type=\"submit\" name=\"btnenviar\" class=\"btn btn-primary\" value=\"Actualizar\">Actualizar</button>\n");
      out.write("                    <button type=\"submit\" name=\"btnenviar\" class=\"btn btn-primary\" value=\"Eliminar\">Eliminar</button>\n");
      out.write("                    <button type=\"submit\" name=\"btnenviar\" class=\"btn btn-primary\" value=\"Listado\">Listado</button>\n");
      out.write("                    <button type=\"submit\" name=\"btnenviar\" class=\"btn btn-primary\" value=\"Filtrar\">Filtrar</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
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
