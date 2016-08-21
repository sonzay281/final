package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"assets/css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/manual/malualcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/npm.js\" type=\"text/javascript\"></script>\n");
      out.write("       ");
      out.write("\n");
      out.write("<title>User Login  ||  Event Management</title> \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("                <div class=\"main\">\n");
      out.write("                    <center> \n");
      out.write("                        <h3>Admin Login</h3>\n");
      out.write("                    </center>\n");
      out.write("                    <form method=\"post\" action=\"index.jsp\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Email</label>\n");
      out.write("                            <input type=\"email\" name=\"email\" class=\"form-control\" required=\"required\" placeholder=\"Enter the Email\">   \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Password</label>\n");
      out.write("                            <input type=\"password\" name=\"password\" class=\"form-control\" required=\"required\" placeholder=\"Enter Password\" >\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <div>\n");
      out.write("                        <input type=\"checkbox\" name=\"checkbox\"> Remember me?\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-success pull-right glyphicon glyphicon-log-in\" value=\"Login\"/>                  \n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"divider\">\n");
      out.write("                        <a href=\"reset.jsp\" class=\"btn btn-danger  btn-group-vertical\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-warning-sign\"></span> Forget Password?\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"signup.jsp\" class=\"btn btn-info btn-group-vertical\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-plus\"></span>Sign Up\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div><br>\n");
      out.write("              \n");
      out.write("                <footer><center>  <hr class=\"divider\">\n");
      out.write("                        <p>Copyright<span class=\"glyphicon-copyright-mark\"</span> 2016 Sanjaya Sapkota<br>All rights reserved.</p></center>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("            ");
      out.write(" </div>\n");
      out.write("    </div> \n");
      out.write("</body>\n");
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
