/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-04-19 10:18:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class user_002dpending_002drequest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("java.sql.DriverManager");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("<title>Pending Requests</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS CDN -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\r\n");
      out.write("<!-- Our Custom CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/sidebar-style.css\">\r\n");
      out.write("<!-- Scrollbar Custom CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<!-- Font Awesome JS -->\r\n");
      out.write("<script defer\r\n");
      out.write("	src=\"https://use.fontawesome.com/releases/v5.0.13/js/solid.js\"\r\n");
      out.write("	integrity=\"sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script defer\r\n");
      out.write("	src=\"https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js\"\r\n");
      out.write("	integrity=\"sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"wrapper\">\r\n");
      out.write("		<!-- Sidebar  -->\r\n");
      out.write("		<nav id=\"sidebar\">\r\n");
      out.write("			<div id=\"dismiss\">\r\n");
      out.write("				<i class=\"fas fa-arrow-left\"></i>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"sidebar-header\">\r\n");
      out.write("				<h3>Welcome</h3>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<ul class=\"list-unstyled components\">\r\n");
      out.write("				<p>");
      out.print(session.getAttribute("email"));
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("				<!-- <a href=\"#homeSubmenu\" data-toggle=\"collapse\" aria-expanded=\"false\">Home</a>\r\n");
      out.write("                      <ul class=\"collapse list-unstyled\" id=\"homeSubmenu\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Home 1</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Home 2</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Home 3</a>\r\n");
      out.write("                        </li> \r\n");
      out.write("                    </ul>-->\r\n");
      out.write("				<li><a href=\"user-personal-detail.jsp\">Personal Details</a></li>\r\n");
      out.write("				<li><a href=\"user-new-trip.jsp\">New Trip Request</a></li>\r\n");
      out.write("				<li class=\"active\"><a href=\"user-pending-request.jsp\">Pending\r\n");
      out.write("						Request</a></li>\r\n");
      out.write("				<li><a href=\"user-approved-request.jsp\">Approved Request</a></li>\r\n");
      out.write("				<li><a href=\"user-trip-history.jsp\">Trip History</a></li>\r\n");
      out.write("				<li><a href=\"../index.jsp\">Logout</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</nav>\r\n");
      out.write("\r\n");
      out.write("		<!-- Page Content  -->\r\n");
      out.write("		<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("			<nav class=\"navbar navbar-expand-lg navbar bg-light text-white\"\r\n");
      out.write("				style=\"background: linear-gradient(to right, #754edd, #e2114f);\">\r\n");
      out.write("				<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("					<button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-info\">\r\n");
      out.write("						<i class=\"fa fa-bars\"></i> <span>Dashboard</span>\r\n");
      out.write("					</button>\r\n");
      out.write("					<button class=\"btn btn-dark d-inline-block d-lg-none ml-auto\"\r\n");
      out.write("						type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("						data-target=\"#navbarSupportedContent\"\r\n");
      out.write("						aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("						aria-label=\"Toggle navigation\">\r\n");
      out.write("						<i class=\"fas fa-align-justify\"></i>\r\n");
      out.write("					</button>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("						<ul class=\"nav navbar-nav ml-auto\">\r\n");
      out.write("							<li class=\"nav-item active\">\r\n");
      out.write("								<h3 class=\"nav-link\">Pending Requests</h3>\r\n");
      out.write("							</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<h3>All pending requests</h3>\r\n");
      out.write("			<hr />\r\n");
      out.write("\r\n");
      out.write("			");

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sys as sysdba", "root");
				String query = "select * from batch9btr_trip_details t INNER JOIN batch9btr_approval_l1 a ON t.trip_id=a.trip_id INNER JOIN batch9btr_approval_l2 b ON t.trip_id=b.trip_id INNER JOIN batch9btr_approval_l3 c ON t.trip_id=c.trip_id where a.approval_status='pending' and b.approval_status='pending' and c.approval_status='pending' and t.user_id=1";
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(query);
				while (rs.next()) {
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"card shadow mb-5 m-4   rounded\">\r\n");
      out.write("				<div class=\"card-header text-light\"\r\n");
      out.write("					style=\"background: linear-gradient(to right, #754edd, #e2114f);\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col-md-9 col-sm-12 col-xl-9 \">\r\n");
      out.write("							<h4>\r\n");
      out.write("								Trip No.\r\n");
      out.write("								");
      out.print(rs.getString("trip_id"));
      out.write("</h4>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div\r\n");
      out.write("							class=\"col-md-3 col-sm-12 col-xl-3 p-1 d-flex justify-content-center\">\r\n");
      out.write("							<span class=\"badge badge-pill badge-info p-2\"\r\n");
      out.write("								style=\"font-size: 16px;\">Waiting for approval</span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"card-body\" style=\"background: linen;\">\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col-md-4 col-sm-4 col-xl-4 bg-light text-center\">\r\n");
      out.write("							<span> Depart date:");
      out.print(rs.getString("Depart_date"));
      out.write("\r\n");
      out.write("							</span>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"col-md-4 col-sm-4 col-xl-4  text-center\">\r\n");
      out.write("							<span> Return date: ");
      out.print(rs.getString("Return_date"));
      out.write("</span>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"col-md-4 col-sm-4 col-xl-4 bg-light text-center\">\r\n");
      out.write("							<span> Destination Country: ");
      out.print(rs.getString("dest_country"));
      out.write("\r\n");
      out.write("							</span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<br />\r\n");
      out.write("\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("						<div class=\"col-md-3 col-sm-3 col-xl-3 bg-light text-center\">\r\n");
      out.write("							<span> Departure country: ");
      out.print(rs.getString("depart_country"));
      out.write("\r\n");
      out.write("							</span>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<div class=\"col-md-3 col-sm-3 col-xl-3  text-center\">\r\n");
      out.write("							<span> Accommodation Required: ");
      out.print(rs.getString("accomodation"));
      out.write("\r\n");
      out.write("							</span>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"col-md-3 col-sm-3 col-xl-3 bg-light text-center\">\r\n");
      out.write("							<span> Advance Amount: ");
      out.print(rs.getString("adv_amt"));
      out.write(" AUD\r\n");
      out.write("							</span>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"col-md-3 col-sm-3 col-xl-3 text-center\">\r\n");
      out.write("							<span> Estimated Cost: ");
      out.print(rs.getString("est_cost"));
      out.write(" AUD\r\n");
      out.write("							</span>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<hr />\r\n");
      out.write("					<footer class=\"blockquote-footer\">Request Submitted on\r\n");
      out.write("						16/04/2022</footer>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			");

			}
			} catch (Exception e) {
			}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"overlay\"></div>\r\n");
      out.write("\r\n");
      out.write("	<!-- jQuery CDN - Slim version (=without AJAX) -->\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\r\n");
      out.write("		integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<!-- Popper.JS -->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\"\r\n");
      out.write("		integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<!-- Bootstrap JS -->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\"\r\n");
      out.write("		integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<!-- jQuery Custom Scroller CDN -->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		$(document).ready(function() {\r\n");
      out.write("			$(\"#sidebar\").mCustomScrollbar({\r\n");
      out.write("				theme : \"minimal\"\r\n");
      out.write("			});\r\n");
      out.write("\r\n");
      out.write("			$('#dismiss, .overlay').on('click', function() {\r\n");
      out.write("				$('#sidebar').removeClass('active');\r\n");
      out.write("				$('.overlay').removeClass('active');\r\n");
      out.write("			});\r\n");
      out.write("\r\n");
      out.write("			$('#sidebarCollapse').on('click', function() {\r\n");
      out.write("				$('#sidebar').addClass('active');\r\n");
      out.write("				$('.overlay').addClass('active');\r\n");
      out.write("				$('.collapse.in').toggleClass('in');\r\n");
      out.write("				$('a[aria-expanded=true]').attr('aria-expanded', 'false');\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
