/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2025-01-09 15:48:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class brands_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar", Long.valueOf(1736329064025L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1736329151722L));
    _jspx_dependants.put("/header2.jsp", Long.valueOf(1736437647934L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Brands</title>\r\n");
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
      out.write("<!-- Reuse header and menu here -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"men_banner\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"header_top\">\r\n");
      out.write("				<div class=\"header_top_left\">\r\n");
      out.write("					<div class=\"box_11\">\r\n");
      out.write("						<a href=\"checkout.html\">\r\n");
      out.write("							<h4>\r\n");
      out.write("								<p>Cart:$ ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.getPrice()}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write('(');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.getsize()}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" items)</p>\r\n");
      out.write("								<img src=\"images/bag.png\" alt=\"\" />\r\n");
      out.write("								<div class=\"clearfix\"></div>\r\n");
      out.write("							</h4>\r\n");
      out.write("						</a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<p class=\"empty\">\r\n");
      out.write("						<a href=\"javascript:;\" class=\"simpleCart_empty\">Empty Cart</a>\r\n");
      out.write("					</p>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"header_top_right\">\r\n");
      out.write("					<div class=\"lang_list\">\r\n");
      out.write("						<select tabindex=\"4\" class=\"dropdown\">\r\n");
      out.write("							<option value=\"\" class=\"label\" value=\"\">$ Us</option>\r\n");
      out.write("							<option value=\"1\">Dollar</option>\r\n");
      out.write("							<option value=\"2\">Euro</option>\r\n");
      out.write("						</select>\r\n");
      out.write("					</div>\r\n");
      out.write("					<ul class=\"header_user_info\">\r\n");
      out.write("						<a class=\"login\" href=\"login.jsp\"> <i class=\"user\"> </i>\r\n");
      out.write("							<li class=\"user_desc\">");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("</li>\r\n");
      out.write("						</a>\r\n");
      out.write("						");
      if (_jspx_meth_c_005fchoose_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("						<div class=\"clearfix\"></div>\r\n");
      out.write("					</ul>\r\n");
      out.write("					<!-- start search-->\r\n");
      out.write("					<div class=\"search-box\">\r\n");
      out.write("						<div id=\"sb-search\" class=\"sb-search\">\r\n");
      out.write("							<form>\r\n");
      out.write("								<input class=\"sb-search-input\"\r\n");
      out.write("									placeholder=\"Enter your search term...\" type=\"search\"\r\n");
      out.write("									name=\"search\" id=\"search\"> <input\r\n");
      out.write("									class=\"sb-search-submit\" type=\"submit\" value=\"\"> <span\r\n");
      out.write("									class=\"sb-icon-search\"> </span>\r\n");
      out.write("							</form>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!----search-scripts---->\r\n");
      out.write("					<script src=\"js/classie1.js\"></script>\r\n");
      out.write("					<script src=\"js/uisearch.js\"></script>\r\n");
      out.write("					<script>\r\n");
      out.write("						new UISearch(document.getElementById('sb-search'));\r\n");
      out.write("					</script>\r\n");
      out.write("					<!----//search-scripts---->\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"clearfix\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("				<div class=\"header_bottom\">\r\n");
      out.write("				<div class=\"logo\">\r\n");
      out.write("					<h1>\r\n");
      out.write("						<a href=\"index.jsp\"><span class=\"m_1\">W</span>atches</a>\r\n");
      out.write("					</h1>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"menu\">\r\n");
      out.write("					<ul class=\"megamenu skyblue\">\r\n");
      out.write("						<li><a class=\"color2\" href=\"index.jsp\">Home</a></li>\r\n");
      out.write("						<li><a class=\"color10\" href=\"brands.jsp\">Brands</a></li>\r\n");
      out.write("						<li><a class=\"color3\" href=\"men.jsp\">Sale</a></li>\r\n");
      out.write("						<li><a class=\"color7\" href=\"404.jsp\">News</a></li>\r\n");
      out.write("						<div class=\"clearfix\"></div>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"clearfix\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("   <div class=\"men\">\r\n");
      out.write("   	<div class=\"container\">\r\n");
      out.write("      <div class=\"col-md-9 single_top\">\r\n");
      out.write("      	 <h1 class=\"page-heading product-listing\">\r\n");
      out.write("			Brands\r\n");
      out.write("		    <span class=\"heading-counter\">There are 4 brands</span>\r\n");
      out.write("         </h1>\r\n");
      out.write("         <div class=\"product-count\">Showing 1 - 4 of 4 items</div>\r\n");
      out.write("          <div class=\"brand_box\">\r\n");
      out.write("	         <div class=\"left-side col-xs-12 col-sm-3\">\r\n");
      out.write("				 <img src=\"images/2nd-day.jpg\" alt=\"\"/>\r\n");
      out.write("			 </div>\r\n");
      out.write("		     <div class=\"middle-side col-xs-12 col-sm-5\">\r\n");
      out.write("		     	<h4><a href=\"#\">Lorem Ipsum</a></h4>\r\n");
      out.write("		     	<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim</p>\r\n");
      out.write("			 </div>\r\n");
      out.write("			 <div class=\"right-side col-xs-12 col-sm-4\">\r\n");
      out.write("			 	<p><a href=\"#\">1 Product</a></p>\r\n");
      out.write("			    <a href=\"#\" class=\"btn btn1 btn-primary btn-normal btn-inline \" target=\"_self\">View Products</a>     \r\n");
      out.write("			 </div>\r\n");
      out.write("			 <div class=\"clearfix\"> </div>\r\n");
      out.write("		  </div>\r\n");
      out.write("		  <div class=\"brand_box\">\r\n");
      out.write("	         <div class=\"left-side col-xs-12 col-sm-3\">\r\n");
      out.write("				 <img src=\"images/mih-jeans.jpg\" alt=\"\"/>\r\n");
      out.write("			 </div>\r\n");
      out.write("		     <div class=\"middle-side col-xs-12 col-sm-5\">\r\n");
      out.write("		     	<h4><a href=\"#\">Lorem Ipsum</a></h4>\r\n");
      out.write("		     	<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim</p>\r\n");
      out.write("			 </div>\r\n");
      out.write("			 <div class=\"right-side col-xs-12 col-sm-4\">\r\n");
      out.write("			 	<p><a href=\"#\">1 Product</a></p>\r\n");
      out.write("			    <a href=\"#\" class=\"btn btn1 btn-primary btn-normal btn-inline \" target=\"_self\">View Products</a>     \r\n");
      out.write("			 </div>\r\n");
      out.write("			 <div class=\"clearfix\"> </div>\r\n");
      out.write("		  </div>\r\n");
      out.write("		  <div class=\"brand_box\">\r\n");
      out.write("	         <div class=\"left-side col-xs-12 col-sm-3\">\r\n");
      out.write("				 <img src=\"images/g-star-raw.jpg\" alt=\"\"/>\r\n");
      out.write("			 </div>\r\n");
      out.write("		     <div class=\"middle-side col-xs-12 col-sm-5\">\r\n");
      out.write("		     	<h4><a href=\"#\">Lorem Ipsum</a></h4>\r\n");
      out.write("		     	<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim</p>\r\n");
      out.write("			 </div>\r\n");
      out.write("			 <div class=\"right-side col-xs-12 col-sm-4\">\r\n");
      out.write("			 	<p><a href=\"#\">1 Product</a></p>\r\n");
      out.write("			    <a href=\"#\" class=\"btn btn1 btn-primary btn-normal btn-inline \" target=\"_self\">View Products</a>     \r\n");
      out.write("			 </div>\r\n");
      out.write("			 <div class=\"clearfix\"> </div>\r\n");
      out.write("		  </div>\r\n");
      out.write("		  <div class=\"brand_box\">\r\n");
      out.write("	         <div class=\"left-side col-xs-12 col-sm-3\">\r\n");
      out.write("				 <img src=\"images/weekday1.jpg\" alt=\"\"/>\r\n");
      out.write("			 </div>\r\n");
      out.write("		     <div class=\"middle-side col-xs-12 col-sm-5\">\r\n");
      out.write("		     	<h4><a href=\"#\">Lorem Ipsum</a></h4>\r\n");
      out.write("		     	<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim</p>\r\n");
      out.write("			 </div>\r\n");
      out.write("			 <div class=\"right-side col-xs-12 col-sm-4\">\r\n");
      out.write("			 	<p><a href=\"#\">1 Product</a></p>\r\n");
      out.write("			    <a href=\"#\" class=\"btn btn1 btn-primary btn-normal btn-inline \" target=\"_self\">View Products</a>     \r\n");
      out.write("			 </div>\r\n");
      out.write("			 <div class=\"clearfix\"> </div>\r\n");
      out.write("		  </div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"col-md-3 tabs\">\r\n");
      out.write("	      <h3 class=\"m_1\">Related Products</h3>\r\n");
      out.write("	      <ul class=\"product\">\r\n");
      out.write("	      	<li class=\"product_img\"><img src=\"images/m5.jpg\" class=\"img-responsive\" alt=\"\"/></li>\r\n");
      out.write("	      	<li class=\"product_desc\">\r\n");
      out.write("	      		<h4><a href=\"#\">quod mazim</a></h4>\r\n");
      out.write("	      		<p class=\"single_price\">$66.30</p>\r\n");
      out.write("	      		<a href=\"#\" class=\"link-cart\">Add to Wishlist</a>\r\n");
      out.write("	      	    <a href=\"#\" class=\"link-cart\">Add to Cart</a>\r\n");
      out.write("	        </li>\r\n");
      out.write("	      	<div class=\"clearfix\"> </div>\r\n");
      out.write("	      </ul>\r\n");
      out.write("	      <ul class=\"product\">\r\n");
      out.write("	      	<li class=\"product_img\"><img src=\"images/m6.jpg\" class=\"img-responsive\" alt=\"\"/></li>\r\n");
      out.write("	      	<li class=\"product_desc\">\r\n");
      out.write("	      		<h4><a href=\"#\">quod mazim</a></h4>\r\n");
      out.write("	      		<p class=\"single_price\">$66.30</p>\r\n");
      out.write("	      		<a href=\"#\" class=\"link-cart\">Add to Wishlist</a>\r\n");
      out.write("	      	    <a href=\"#\" class=\"link-cart\">Add to Cart</a>\r\n");
      out.write("	        </li>\r\n");
      out.write("	      	<div class=\"clearfix\"> </div>\r\n");
      out.write("	      </ul>\r\n");
      out.write("	      <ul class=\"product\">\r\n");
      out.write("	      	<li class=\"product_img\"><img src=\"images/m2.jpg\" class=\"img-responsive\" alt=\"\"/></li>\r\n");
      out.write("	      	<li class=\"product_desc\">\r\n");
      out.write("	      		<h4><a href=\"#\">quod mazim</a></h4>\r\n");
      out.write("	      		<p class=\"single_price\">$66.30</p>\r\n");
      out.write("	      		<a href=\"#\" class=\"link-cart\">Add to Wishlist</a>\r\n");
      out.write("	      	    <a href=\"#\" class=\"link-cart\">Add to Cart</a>\r\n");
      out.write("	        </li>\r\n");
      out.write("	      	<div class=\"clearfix\"> </div>\r\n");
      out.write("	      </ul>\r\n");
      out.write("	      <ul class=\"product\">\r\n");
      out.write("	      	<li class=\"product_img\"><img src=\"images/m3.jpg\" class=\"img-responsive\" alt=\"\"/></li>\r\n");
      out.write("	      	<li class=\"product_desc\">\r\n");
      out.write("	      		<h4><a href=\"#\">quod mazim</a></h4>\r\n");
      out.write("	      		<p class=\"single_price\">$66.30</p>\r\n");
      out.write("	      		<a href=\"#\" class=\"link-cart\">Add to Wishlist</a>\r\n");
      out.write("	      	    <a href=\"#\" class=\"link-cart\">Add to Cart</a>\r\n");
      out.write("	        </li>\r\n");
      out.write("	      	<div class=\"clearfix\"> </div>\r\n");
      out.write("	      </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("     <div class=\"clearfix\"> </div>\r\n");
      out.write("	</div>\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"footer\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"newsletter\">\r\n");
      out.write("				<h3>Newsletter</h3>\r\n");
      out.write("				<p>Lorem Ipsum is simply dummy text of the printing and\r\n");
      out.write("					typesetting industry. Lorem Ipsum has been the industry's standard</p>\r\n");
      out.write("				<form>\r\n");
      out.write("					<input type=\"text\" value=\"\" onfocus=\"this.value='';\"\r\n");
      out.write("						onblur=\"if (this.value == '') {this.value ='';}\"> <input\r\n");
      out.write("						type=\"submit\" value=\"SUBSCRIBE\">\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"cssmenu\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li class=\"active\"><a href=\"#\">Privacy</a></li>\r\n");
      out.write("					<li><a href=\"#\">Terms</a></li>\r\n");
      out.write("					<li><a href=\"#\">Shop</a></li>\r\n");
      out.write("					<li><a href=\"#\">About</a></li>\r\n");
      out.write("					<li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<ul class=\"social\">\r\n");
      out.write("				<li><a href=\"\"> <i class=\"instagram\"> </i>\r\n");
      out.write("				</a></li>\r\n");
      out.write("				<li><a href=\"\"><i class=\"fb\"> </i> </a></li>\r\n");
      out.write("				<li><a href=\"\"><i class=\"tw\"> </i> </a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<div class=\"clearfix\"></div>\r\n");
      out.write("			<div class=\"copy\">\r\n");
      out.write("				<p>\r\n");
      out.write("					&copy; 2015 Watches. All Rights Reserved | Design by <a\r\n");
      out.write("						href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("									");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("									");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("								");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /header2.jsp(76,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.user}", boolean.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("									");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.lastname}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("										");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.firstname}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("								");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("									My account\r\n");
          out.write("								");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f1(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f1_reused = false;
    try {
      _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f1.setParent(null);
      int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
      if (_jspx_eval_c_005fchoose_005f1 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("							");
          if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("							");
          if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("						");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      _jspx_th_c_005fchoose_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f1_reused = false;
    try {
      _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f1.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
      // /header2.jsp(86,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.user}", boolean.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
      if (_jspx_eval_c_005fwhen_005f1 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("								<a class=\"user_desc\" href=\"LogoutServlet\"\r\n");
          out.write("									style=\"text-decoration: underline; font-size: smaller;\">Logout</a>\r\n");
          out.write("							");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      _jspx_th_c_005fwhen_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(jakarta.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f1_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f1.setParent((jakarta.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
      int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f1 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("							");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      _jspx_th_c_005fotherwise_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f1_reused);
    }
    return false;
  }
}
