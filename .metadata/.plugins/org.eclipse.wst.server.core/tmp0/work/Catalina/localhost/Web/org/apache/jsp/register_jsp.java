/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2025-01-11 16:08:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar", Long.valueOf(1736329064025L));
    _jspx_dependants.put("jar:file:/D:/Java_Project/Web/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Web/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar!/META-INF/c.tld", Long.valueOf(1602848772000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Watches an E-Commerce online Shopping Category Flat\r\n");
      out.write("	Bootstrap Responsive Website Template| Login :: w3layouts</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("	content=\"Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\">\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	 addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<!--webfont-->\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700'\r\n");
      out.write("	rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Dorsa' rel='stylesheet'\r\n");
      out.write("	type='text/css'>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<!-- start menu -->\r\n");
      out.write("<link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	media=\"all\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/megamenu.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	$(document).ready(function() {\r\n");
      out.write("		$(\".megamenu\").megamenu();\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"js/jquery.easydropdown.js\"></script>\r\n");
      out.write("<script src=\"js/simpleCart.min.js\">\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("	<div class=\"account-in\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/RegisterServlet\"\r\n");
      out.write("				method=\"post\" >\r\n");
      out.write("\r\n");
      out.write("				<div class=\"register-top-grid\">\r\n");
      out.write("					<h2>PERSONAL INFORMATION</h2>\r\n");
      out.write("					<div>\r\n");
      out.write("						<span>First Name<label>*</label></span> <input type=\"text\"\r\n");
      out.write("							name=\"firstname\">\r\n");
      out.write("							<p style=\"color: #dc3545;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nameError}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>  \r\n");
      out.write("					</div>\r\n");
      out.write("					<div>\r\n");
      out.write("						<span>Last Name<label>*</label></span> <input type=\"text\"\r\n");
      out.write("							name=\"lastname\">\r\n");
      out.write("							<p style=\"color: #dc3545;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lastnameError}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>  \r\n");
      out.write("					</div>\r\n");
      out.write("					<div>\r\n");
      out.write("						<span>Email Address<label>*</label></span> <input type=\"text\"\r\n");
      out.write("							name=\"email\">\r\n");
      out.write("							<p style=\"color: #dc3545;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emailError}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>  \r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("					<a class=\"news-letter\" href=\"#\"> <label class=\"checkbox\"><input\r\n");
      out.write("							type=\"checkbox\" name=\"checkbox\" checked=\"\"><i> </i>Sign\r\n");
      out.write("							Up for Newsletter</label>\r\n");
      out.write("					</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"register-bottom-grid\">\r\n");
      out.write("					<h2>LOGIN INFORMATION</h2>\r\n");
      out.write("					<div>\r\n");
      out.write("						<span>Password<label>*</label></span> <input type=\"password\"\r\n");
      out.write("							name=\"password\">\r\n");
      out.write("							<p style=\"color: #dc3545;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${passError}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>  \r\n");
      out.write("					</div>\r\n");
      out.write("					<div>\r\n");
      out.write("						<span>Confirm Password<label>*</label></span> <input\r\n");
      out.write("							type=\"password\" name=\"confirmPassword\">\r\n");
      out.write("							<p style=\"color: #dc3545;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${passError}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"clearfix\"></div>\r\n");
      out.write("				<div class=\"register-but\">\r\n");
      out.write("					<input type=\"submit\" value=\"submit\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"map\">\r\n");
      out.write("		<iframe\r\n");
      out.write("			src=\"https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d3150859.767904157!2d-96.62081048651531!3d39.536794757966845!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1408111832978\">\r\n");
      out.write("		</iframe>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}