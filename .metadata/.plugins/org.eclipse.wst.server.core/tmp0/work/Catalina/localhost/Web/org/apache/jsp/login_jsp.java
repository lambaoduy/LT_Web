/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-11-26 11:45:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Watches an E-Commerce online Shopping Category Flat Bootstrap Responsive Website Template| Login :: w3layouts</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<!--webfont-->\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Dorsa' rel='stylesheet' type='text/css'>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<!-- start menu -->\r\n");
      out.write("<link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/megamenu.js\"></script>\r\n");
      out.write("<script>$(document).ready(function(){$(\".megamenu\").megamenu();});</script>\r\n");
      out.write("<script src=\"js/jquery.easydropdown.js\"></script>\r\n");
      out.write("<script src=\"js/simpleCart.min.js\"> </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"men_banner\">\r\n");
      out.write("   	  <div class=\"container\">\r\n");
      out.write("   	  	<div class=\"header_top\">\r\n");
      out.write("   	  	   <div class=\"header_top_left\">\r\n");
      out.write("	  	      <div class=\"box_11\"><a href=\"checkout.html\">\r\n");
      out.write("		      <h4><p>Cart: <span class=\"simpleCart_total\"></span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\"></span> items)</p><img src=\"images/bag.png\" alt=\"\"/><div class=\"clearfix\"> </div></h4>\r\n");
      out.write("		      </a></div>\r\n");
      out.write("	          <p class=\"empty\"><a href=\"javascript:;\" class=\"simpleCart_empty\">Empty Cart</a></p>\r\n");
      out.write("	          <div class=\"clearfix\"> </div>\r\n");
      out.write("	       </div>\r\n");
      out.write("           <div class=\"header_top_right\">\r\n");
      out.write("		  	 <div class=\"lang_list\">\r\n");
      out.write("				<select tabindex=\"4\" class=\"dropdown\">\r\n");
      out.write("					<option value=\"\" class=\"label\" value=\"\">$ Us</option>\r\n");
      out.write("					<option value=\"1\">Dollar</option>\r\n");
      out.write("					<option value=\"2\">Euro</option>\r\n");
      out.write("				</select>\r\n");
      out.write("			 </div>\r\n");
      out.write("			 <ul class=\"header_user_info\">\r\n");
      out.write("			  <a class=\"login\" href=\"login.html\">\r\n");
      out.write("				<i class=\"user\"> </i> \r\n");
      out.write("				<li class=\"user_desc\">My Account</li>\r\n");
      out.write("			  </a>\r\n");
      out.write("			  <div class=\"clearfix\"> </div>\r\n");
      out.write("		     </ul>\r\n");
      out.write("		    <!-- start search-->\r\n");
      out.write("				<div class=\"search-box\">\r\n");
      out.write("				   <div id=\"sb-search\" class=\"sb-search\">\r\n");
      out.write("					  <form>\r\n");
      out.write("						 <input class=\"sb-search-input\" placeholder=\"Enter your search term...\" type=\"search\" name=\"search\" id=\"search\">\r\n");
      out.write("						 <input class=\"sb-search-submit\" type=\"submit\" value=\"\">\r\n");
      out.write("						 <span class=\"sb-icon-search\"> </span>\r\n");
      out.write("					  </form>\r\n");
      out.write("				    </div>\r\n");
      out.write("				 </div>\r\n");
      out.write("				 <!----search-scripts---->\r\n");
      out.write("				 <script src=\"js/classie1.js\"></script>\r\n");
      out.write("				 <script src=\"js/uisearch.js\"></script>\r\n");
      out.write("				   <script>\r\n");
      out.write("					 new UISearch( document.getElementById( 'sb-search' ) );\r\n");
      out.write("				   </script>\r\n");
      out.write("					<!----//search-scripts---->\r\n");
      out.write("		            <div class=\"clearfix\"> </div>\r\n");
      out.write("			 </div>\r\n");
      out.write("		     <div class=\"clearfix\"> </div>\r\n");
      out.write("	    </div>\r\n");
      out.write("   		<div class=\"header_bottom\">\r\n");
      out.write("	     <div class=\"logo\">\r\n");
      out.write("		    <h1><a href=\"index.html\"><span class=\"m_1\">W</span>atches</a></h1>\r\n");
      out.write("	     </div>\r\n");
      out.write("	    <div class=\"menu\">\r\n");
      out.write("	     <ul class=\"megamenu skyblue\">\r\n");
      out.write("			<li><a class=\"color2\" href=\"#\">Mens</a>\r\n");
      out.write("				<div class=\"megapanel\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col1\">\r\n");
      out.write("							<div class=\"h_nav\">\r\n");
      out.write("								<h4>Men</h4>\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li><a href=\"men.html\">Watches</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">watches</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Blazers</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Suits</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Trousers</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Jeans</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Shirts</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Sweatshirts & Hoodies</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Swim Wear</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Accessories</a></li>\r\n");
      out.write("								</ul>	\r\n");
      out.write("							</div>							\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col1\">\r\n");
      out.write("							<div class=\"h_nav\">\r\n");
      out.write("								<h4>Women</h4>\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li><a href=\"men.html\">Watches</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Outerwear</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Dresses</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Handbags</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Trousers</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Jeans</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">T-Shirts</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Shoes</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Coats</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Accessories</a></li>\r\n");
      out.write("								</ul>	\r\n");
      out.write("							</div>							\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col2\">\r\n");
      out.write("							<div class=\"h_nav\">\r\n");
      out.write("								<h4>Trends</h4>\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li class>\r\n");
      out.write("										<div class=\"p_left\">\r\n");
      out.write("										  <img src=\"images/p1.jpg\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"p_right\">\r\n");
      out.write("											<h4><a href=\"#\">Denim shirt</a></h4>\r\n");
      out.write("											<span class=\"item-cat\"><small><a href=\"#\">watches</a></small></span>\r\n");
      out.write("											<span class=\"price\">29.99 $</span>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"clearfix\"> </div>\r\n");
      out.write("									</li>\r\n");
      out.write("									<li>\r\n");
      out.write("										<div class=\"p_left\">\r\n");
      out.write("										  <img src=\"images/p2.jpg\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"p_right\">\r\n");
      out.write("											<h4><a href=\"#\">Denim shirt</a></h4>\r\n");
      out.write("											<span class=\"item-cat\"><small><a href=\"#\">watches</a></small></span>\r\n");
      out.write("											<span class=\"price\">29.99 $</span>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"clearfix\"> </div>\r\n");
      out.write("									</li>\r\n");
      out.write("									<li>\r\n");
      out.write("										<div class=\"p_left\">\r\n");
      out.write("										  <img src=\"images/p3.jpg\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"p_right\">\r\n");
      out.write("											<h4><a href=\"#\">Denim shirt</a></h4>\r\n");
      out.write("											<span class=\"item-cat\"><small><a href=\"#\">watches</a></small></span>\r\n");
      out.write("											<span class=\"price\">29.99 $</span>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"clearfix\"> </div>\r\n");
      out.write("									</li>\r\n");
      out.write("								</ul>	\r\n");
      out.write("							</div>												\r\n");
      out.write("						</div>\r\n");
      out.write("					  </div>\r\n");
      out.write("					</div>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li><a class=\"color4\" href=\"#\">womens</a>\r\n");
      out.write("				<div class=\"megapanel\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col1\">\r\n");
      out.write("							<div class=\"h_nav\">\r\n");
      out.write("								<h4>Men</h4>\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li><a href=\"men.html\">Watches</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">watches</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Blazers</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Suits</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Trousers</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Jeans</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Shirts</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Sweatshirts & Hoodies</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Swim Wear</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Accessories</a></li>\r\n");
      out.write("								</ul>	\r\n");
      out.write("							</div>							\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col1\">\r\n");
      out.write("							<div class=\"h_nav\">\r\n");
      out.write("								<h4>Women</h4>\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li><a href=\"men.html\">Watches</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Outerwear</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Dresses</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Handbags</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Trousers</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Jeans</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">T-Shirts</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Shoes</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Coats</a></li>\r\n");
      out.write("									<li><a href=\"men.html\">Accessories</a></li>\r\n");
      out.write("								</ul>	\r\n");
      out.write("							</div>							\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"col2\">\r\n");
      out.write("							<div class=\"h_nav\">\r\n");
      out.write("								<h4>Trends</h4>\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li class>\r\n");
      out.write("										<div class=\"p_left\">\r\n");
      out.write("										  <img src=\"images/p1.jpg\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"p_right\">\r\n");
      out.write("											<h4><a href=\"#\">Denim shirt</a></h4>\r\n");
      out.write("											<span class=\"item-cat\"><small><a href=\"#\">watches</a></small></span>\r\n");
      out.write("											<span class=\"price\">29.99 $</span>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"clearfix\"> </div>\r\n");
      out.write("									</li>\r\n");
      out.write("									<li>\r\n");
      out.write("										<div class=\"p_left\">\r\n");
      out.write("										  <img src=\"images/p2.jpg\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"p_right\">\r\n");
      out.write("											<h4><a href=\"#\">Denim shirt</a></h4>\r\n");
      out.write("											<span class=\"item-cat\"><small><a href=\"#\">watches</a></small></span>\r\n");
      out.write("											<span class=\"price\">29.99 $</span>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"clearfix\"> </div>\r\n");
      out.write("									</li>\r\n");
      out.write("									<li>\r\n");
      out.write("										<div class=\"p_left\">\r\n");
      out.write("										  <img src=\"images/p3.jpg\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"p_right\">\r\n");
      out.write("											<h4><a href=\"#\">Denim shirt</a></h4>\r\n");
      out.write("											<span class=\"item-cat\"><small><a href=\"#\">watches</a></small></span>\r\n");
      out.write("											<span class=\"price\">29.99 $</span>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"clearfix\"> </div>\r\n");
      out.write("									</li>\r\n");
      out.write("								</ul>	\r\n");
      out.write("							</div>												\r\n");
      out.write("						</div>\r\n");
      out.write("					  </div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>				\r\n");
      out.write("				<li><a class=\"color10\" href=\"brands.html\">Brands</a></li>\r\n");
      out.write("				<li><a class=\"color3\" href=\"index.html\">Sale</a></li>\r\n");
      out.write("				<li><a class=\"color7\" href=\"404.html\">News</a></li>\r\n");
      out.write("				<div class=\"clearfix\"> </div>\r\n");
      out.write("			</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("	        <div class=\"clearfix\"> </div>\r\n");
      out.write("	    </div>\r\n");
      out.write("	   </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write(" 	\r\n");
      out.write("   <div class=\"account-in\">\r\n");
      out.write("   	 <div class=\"container\">\r\n");
      out.write("   	   <h3>Account</h3>\r\n");
      out.write("		<div class=\"col-md-7 account-top\">\r\n");
      out.write("		\r\n");
      out.write("		<!-- form dang nhap jsp  -->\r\n");
      out.write("		  <form action=\"Login\" method=\"post\">\r\n");
      out.write("			<div> 	\r\n");
      out.write("				<span>Email*</span>\r\n");
      out.write("				<input type=\"text\" name = \"email\"> \r\n");
      out.write("			</div>\r\n");
      out.write("			<div> \r\n");
      out.write("				<span class=\"pass\">Password*</span>\r\n");
      out.write("				<input type=\"password\" name=\"password\">\r\n");
      out.write("			</div>				\r\n");
      out.write("				<input type=\"submit\"\"> \r\n");
      out.write("		   </form>\r\n");
      out.write("		   \r\n");
      out.write("		   <!-- end -->\r\n");
      out.write("		   \r\n");
      out.write("		   \r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"col-md-5 left-account \">\r\n");
      out.write("			<a href=\"single.html\"><img class=\"img-responsive \" src=\"images/s4.jpg\" alt=\"\"/></a>\r\n");
      out.write("			<div class=\"five-in\">\r\n");
      out.write("			<h1>35% </h1><span>discount</span>\r\n");
      out.write("			</div>\r\n");
      out.write("			<a href=\"register.html\" class=\"create\">Create an account</a>\r\n");
      out.write("			<div class=\"clearfix\"> </div>\r\n");
      out.write("		</div>\r\n");
      out.write("	    <div class=\"clearfix\"> </div>\r\n");
      out.write("	  </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"map\">\r\n");
      out.write("	   <iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d3150859.767904157!2d-96.62081048651531!3d39.536794757966845!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sin!4v1408111832978\"> </iframe>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"footer\">\r\n");
      out.write("   	 <div class=\"container\">\r\n");
      out.write("   	 	<div class=\"newsletter\">\r\n");
      out.write("			<h3>Newsletter</h3>\r\n");
      out.write("			<p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard</p>\r\n");
      out.write("			<form>\r\n");
      out.write("			  <input type=\"text\" value=\"\" onfocus=\"this.value='';\" onblur=\"if (this.value == '') {this.value ='';}\">\r\n");
      out.write("			  <input type=\"submit\" value=\"SUBSCRIBE\">\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("   		<div class=\"cssmenu\">\r\n");
      out.write("		   <ul>\r\n");
      out.write("			<li class=\"active\"><a href=\"#\">Privacy</a></li>\r\n");
      out.write("			<li><a href=\"#\">Terms</a></li>\r\n");
      out.write("			<li><a href=\"#\">Shop</a></li>\r\n");
      out.write("			<li><a href=\"#\">About</a></li>\r\n");
      out.write("			<li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("		  </ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		<ul class=\"social\">\r\n");
      out.write("			<li><a href=\"\"> <i class=\"instagram\"> </i> </a></li>\r\n");
      out.write("			<li><a href=\"\"><i class=\"fb\"> </i> </a></li>\r\n");
      out.write("			<li><a href=\"\"><i class=\"tw\"> </i> </a></li>\r\n");
      out.write("	    </ul>\r\n");
      out.write("	    <div class=\"clearfix\"></div>\r\n");
      out.write("	    <div class=\"copy\">\r\n");
      out.write("           <p> &copy; 2015 Watches. All Rights Reserved | Design by <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a></p>\r\n");
      out.write("	    </div>\r\n");
      out.write("   	</div>\r\n");
      out.write("   </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>		");
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
