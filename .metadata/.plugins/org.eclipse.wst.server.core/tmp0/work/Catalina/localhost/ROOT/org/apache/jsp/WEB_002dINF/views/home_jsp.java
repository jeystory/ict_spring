/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30
 * Generated at: 2020-04-03 08:09:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/menu_main.jsp", Long.valueOf(1585901331662L));
    _jspx_dependants.put("/WEB-INF/views/bottom.jsp", Long.valueOf(1585202317451L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/sw_layout.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("ul li {\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("h2 {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#event_wrap {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tpadding: 0px;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#frame {\r\n");
      out.write("\twidth: 1200px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#img {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".rolling_item{\r\n");
      out.write("\twidth : 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* write */\r\n");
      out.write("\r\n");
      out.write(".content img {\r\n");
      out.write("\twidth: 30%;\r\n");
      out.write("\tpadding : 0;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header {\r\n");
      out.write("/* \tmargin : 0;\r\n");
      out.write("\tpadding : 0; */\r\n");
      out.write("\t/* background-color:  #f1bdcf; */\r\n");
      out.write("\t/* border : 5px solid blue; */\r\n");
      out.write("\tposition :inherit;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"main_menu\">");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>menu main</title>\r\n");
      out.write("<link rel = \"stylesheet\" href=\"resources/css/cust_tb.css\">\r\n");
      out.write("<link rel = \"stylesheet\"  href=\"resources/css/sw_layout.css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t#main_menu_bar {\r\n");
      out.write("  \t\tlist-style-type: none;\r\n");
      out.write("  \t\tmargin: 0;\r\n");
      out.write("  \t\toverflow: hidden;\r\n");
      out.write("  \t\tbackground-color : lightcoral;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t#main_menu_bar li {\r\n");
      out.write("  \t\tdisplay: inline-block;\r\n");
      out.write("\t}\r\n");
      out.write(" \r\n");
      out.write("\tli a, .dropbtn {\r\n");
      out.write(" \t\tdisplay: inline-block;\r\n");
      out.write("  \t\tcolor: white;\r\n");
      out.write("  \t\ttext-align: center;\r\n");
      out.write("  \t\tpadding: 14px 16px; \r\n");
      out.write("  \t\ttext-decoration: none;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t#main_menu_bar li a:hover, .dropdown:hover .dropbtn {\r\n");
      out.write("  \t\t/* background-color: #ff1a48; */\r\n");
      out.write("  \t\tColor : black;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tli.dropdown { display: inline-block;}\r\n");
      out.write("\r\n");
      out.write("\t.dropdown-content {\r\n");
      out.write("  \t\tdisplay: none;\r\n");
      out.write("  \t\tposition: absolute;\r\n");
      out.write("  \t\t/* background-color : lightcoral; */\r\n");
      out.write("  \t\tcolor : white;\r\n");
      out.write("  \t\tmin-width: 160px;\r\n");
      out.write("  \t\t/* box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2); */\r\n");
      out.write("  \t\tz-index: 1;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t.dropdown-content a {\r\n");
      out.write(" \t \tcolor: white;\r\n");
      out.write("  \t\tpadding: 12px 16px; \r\n");
      out.write("  \t\ttext-decoration: none;\r\n");
      out.write("  \t\tdisplay: block;\r\n");
      out.write("  \t\ttext-align: left;\r\n");
      out.write("\t\tfloat : left\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t.dropdown-content a:hover \r\n");
      out.write("\t{\r\n");
      out.write("\t\t/* background-color: #ff4c4c; */\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t.dropdown:hover .dropdown-content {\r\n");
      out.write("  \t\tdisplay: block;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t#icon_img {\r\n");
      out.write("\t\tpostion : right;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<p>\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<img src=\"resources/images/banner2.png\" alt=\"top_banner\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<ul id = \"main_menu_bar\">\r\n");
      out.write("\t\t<li><a href=\"home.do\">Home</a></li>\r\n");
      out.write("  \t\t<li class = \"dropdown\"><a href=\"item.do?item_category=1\" class=\"dropbtn\">Menu</a>\r\n");
      out.write("  \t\t\t<div class=\"dropdown-content\" >\r\n");
      out.write("      \t\t\t<a href=\"item.do?item_category=1\">Cookie & Muffin </a>\r\n");
      out.write("      \t\t\t<a href=\"item.do?item_category=2\">Bread</a>\r\n");
      out.write("      \t\t\t<a href=\"item.do?item_category=3\">Dessert</a>\r\n");
      out.write("      \t\t\t<!-- <a href = \"address_test.do\">주소테스트</a> -->\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("  \t\t</li>\r\n");
      out.write("  \t\t\r\n");
      out.write("  \t\t<!-- <li><a href=\"index.do?cntPage=event\">Event</a></li> -->\r\n");
      out.write("  \t\t<li><a href=\"event.do\">Event</a></li>\r\n");
      out.write("  \t\t\r\n");
      out.write("  \t\t<li class = \"dropdown\"><a href=\"main_notice.do\" class=\"dropbtn\">고객센터</a>\t\t\t\r\n");
      out.write("  \t\t\t<div class=\"dropdown-content\">\r\n");
      out.write("      \t\t\t<a href=\"main_notice.do\">공지사항</a>\r\n");
      out.write("      \t\t\t<a href=\"item_qa.do\">Q/A</a>\r\n");
      out.write("    \t\t</div>\r\n");
      out.write("  \t\t</li>\r\n");
      out.write("  \t\t<div id = icon_img>\r\n");
      out.write("  \t\t<li><a href=\"cart_list.do?cust_id=mvo.id\"><img src=\"resources/images/cart.png\" alt=\"cart\" style=\"float:right;width:42px;height:42px; \"></a></li>\r\n");
      out.write(" \t\t<li><a href=\"login.do\"><img src=\"resources/images/login.png\" alt=\"login\" style=\"float:right;width:42px;height:42px;\"></a></li>\r\n");
      out.write(" \t\t</div>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<!-- <div id = icon_img>\r\n");
      out.write("  \t\t<a href=\"cart_list.do?cust_id=mvo.id\"><img src=\"resources/images/cart.png\" alt=\"cart\" style=\"float:right;width:42px;height:42px;\"></a>\r\n");
      out.write(" \t\t<a href=\"login.do\"><img src=\"resources/images/login.png\" alt=\"login\" style=\"float:right;width:42px;height:42px;\"></a>\r\n");
      out.write("  \t</div> -->\r\n");
      out.write("  </p>\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div class=\"rolling_item\" align =\"center\" >\r\n");
      out.write("\t\t<h2> Sweet Forest 베스트</h2>\r\n");
      out.write("\t\t<div style=\"position: absolute;\">\r\n");
      out.write("\t\t\t<div style=\"position: relative; top: 110px; left: 250px;\">\r\n");
      out.write("\t\t\t\t<img src=\"resources/images/btn_banner_prev.png\"></img>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div style=\"position: absolute;\">\r\n");
      out.write("\t\t\t<div style=\"position: relative; top: 110px; left: 1100px;\">\r\n");
      out.write("\t\t\t\t<img src=\"resources/images/btn_banner_next.png\"></img>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"\"> class=\"content\"><img src=\"resources/images/items/snack01.jpg\"></a>\r\n");
      out.write("\t\t\t<a href=\"\" class=\"content\"><img src=\"resources/images/items/bread01.jpg\"></a>\r\n");
      out.write("\t\t\t<a href=\"\" class=\"content\"><img src=\"resources/images/items/dessert01.jpg\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"event_wrap\" >\r\n");
      out.write("\t<h2>Sweet Forest 이벤트</h2>\r\n");
      out.write("\t\t<div id=\"frame\">\r\n");
      out.write("\t\t\t<ul id=\"banner\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><img src=\"resources/images/events/event_01.jpg\"></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><img src=\"resources/images/events/event_02.jpg\"></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><img src=\"resources/images/events/event_03.jpg\"></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\"><img src=\"resources/images/events/event_04.jpg\"></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div class=\"footer\">");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<p>Copyright 2020 SweetForest</p>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
