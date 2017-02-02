package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=utf-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>Java Club Registration Form</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Java Club Registration Form</h1>\n");
      out.write("        <p>Please fill out the form below ...</p>\n");
      out.write("        <form name=\"registration\" action=\"javaclub/Register\" method=\"post\">\n");
      out.write("            Choose user ID: <input type=\"text\" name=\"user\">\n");
      out.write("            <br>\n");
      out.write("            Choose your password: <input type=\"password\" name=\"pass1\">\n");
      out.write("            <br>\n");
      out.write("            Re-enter your password: <input type=\"password\" name=\"pass2\">\n");
      out.write("            <br>\n");
      out.write("            Enter your first name: <input type=\"text\" name=\"firstName\">\n");
      out.write("            <br>\n");
      out.write("            Enter your last name: <input type=\"text\" name=\"lastName\">\n");
      out.write("            <br>\n");
      out.write("            Enter your email: <input type=\"email\" name=\"email\">\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"Signup\">\n");
      out.write("        </form>\n");
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
