/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.62
 * Generated at: 2022-04-20 05:56:32 UTC
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

public final class user_002dpersonal_002ddetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("    <title>Personal Details</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS CDN -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\r\n");
      out.write("    <!-- Our Custom CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/sidebar-style.css\">\r\n");
      out.write("    <!-- Scrollbar Custom CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\"\r\n");
      out.write("        href=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Font Awesome JS -->\r\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/solid.js\"\r\n");
      out.write("        integrity=\"sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js\"\r\n");
      out.write("        integrity=\"sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("        <!-- Sidebar  -->\r\n");
      out.write("        <nav id=\"sidebar\">\r\n");
      out.write("            <div id=\"dismiss\">\r\n");
      out.write("                <i class=\"fas fa-arrow-left\"></i>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"sidebar-header\">\r\n");
      out.write("                <h3>Welcome</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"list-unstyled components\">\r\n");
      out.write("                <p>");
      out.print(session.getAttribute("fname"));
      out.write(' ');
      out.print(session.getAttribute("lname"));
      out.write("</p>\r\n");
      out.write("                    <!-- <a href=\"#homeSubmenu\" data-toggle=\"collapse\" aria-expanded=\"false\">Home</a>\r\n");
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
      out.write("                <li class=\"active\">    \r\n");
      out.write("                	<a href=\"user-personal-detail.jsp\">Personal Details</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"user-new-trip.jsp\">New Trip Request</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"user-pending-request.jsp\">Pending Request</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"user-approved-request.jsp\">Approved Request</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"user-trip-history.jsp\">Trip History</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"../index.jsp\">Logout</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page Content  -->\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar bg-light text-white\" style=\"background: linear-gradient(to right, #754edd, #e2114f);\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                    <button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-info\">\r\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                        <span>Dashboard</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <button class=\"btn btn-dark d-inline-block d-lg-none ml-auto\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("                        data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\r\n");
      out.write("                        aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                        <i class=\"fas fa-align-justify\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                        <ul class=\"nav navbar-nav ml-auto\">\r\n");
      out.write("                            <li class=\"nav-item active\">\r\n");
      out.write("                                <h3 class=\"nav-link\">Personal Details</h3>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("           \r\n");
      out.write("             \r\n");
      out.write("            <h3>My Data</h3>\r\n");
      out.write("           	<hr/>\r\n");
      out.write("          ");
  	
           	 try 
             {
           		 	/* String sid=(String)request.getSession().getAttribute("uid"); */
           		 	String sid=(String)session.getAttribute("uid");
					Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@132.145.42.131:1521/Testdb_pdb1.evopaassub1.evopaasvcn.oraclevcn.com","trainee_schema","Trn__Schema_21");
					String query = "select * from BATCH9BTR_USER_DETAILS a INNER JOIN batch9btr_department_mst b ON  a.dept_id=b.dept_id  INNER JOIN batch9btr_nationality_mst c ON  a.nationality_id=c.nationality_id where user_id='"+sid+"'";
					Statement st = conn.createStatement();
					ResultSet rs = st.executeQuery(query);
					if(rs.next()){
           
      out.write("\r\n");
      out.write("         \r\n");
      out.write("             <form>\r\n");
      out.write("             <div class=\"card shadow  mb-5  rounded m-4\"  style=\"background:linen;\">\r\n");
      out.write("             <div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-2 col-sm-12 text-center\">\r\n");
      out.write("                            <label for=\"fname\">First Name: </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-2 col-sm-12\">\r\n");
      out.write("                            <input type=\"text\" name=\"fname\" class=\"form-control border border-primary\" id=\"fname\" value=\"");
      out.print(rs.getString("f_name"));
      out.write("\" readonly >\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"col-md-2 col-sm-12 text-center\">\r\n");
      out.write("                            <label for=\"mname\">Middle Name: </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-2 col-sm-12\">\r\n");
      out.write("                            <input type=\"text\" name=\"mname\" class=\"form-control border border-primary\" id=\"mname\" value=\"");
      out.print(rs.getString("m_name"));
      out.write("\"  readonly >\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-2 col-sm-12 text-center\">\r\n");
      out.write("                            <label for=\"lname\">Last Name: </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-2 col-sm-12\">\r\n");
      out.write("                            <input type=\"text\" name=\"lname\" class=\"form-control border border-primary\" id=\"lname\" value=\"");
      out.print(rs.getString("l_name"));
      out.write("\" readonly>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("                    \r\n");
      out.write("                 <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 text-center\">\r\n");
      out.write("                            <label for=\"eno\">Employee No: </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12\">\r\n");
      out.write("                            <input type=\"text\" name=\"eno\" class=\"form-control border border-primary\" id=\"eno\" value=\"");
      out.print(rs.getString("emp_no"));
      out.write("\" readonly >\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 text-center\">\r\n");
      out.write("                            <label for=\"email\">Email ID: </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12\">\r\n");
      out.write("                            <input type=\"text\" name=\"email\" class=\"form-control border border-primary\" id=\"Email\" value=\"");
      out.print(rs.getString("email_id"));
      out.write("\" readonly>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 text-center\">\r\n");
      out.write("                            <label for=\"mno\">Mobile No: </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12\">\r\n");
      out.write("                            <input type=\"text\" name=\"mno\" class=\"form-control border border-primary\" id=\"mno\" value=\"");
      out.print(rs.getString("mobile_no"));
      out.write("\" readonly >\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 text-center\">\r\n");
      out.write("                            <label for=\"dob\">Date Of Birth: </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12\">\r\n");
      out.write("                            <input type=\"text\" name=\"dob\" class=\"form-control border border-primary\" id=\"dob\" value=\"");
      out.print(rs.getString("dob"));
      out.write("\" readonly>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 text-center\">\r\n");
      out.write("                            <label for=\"gender\">Gender: </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12\">\r\n");
      out.write("                            <input type=\"text\" name=\"gender\" class=\"form-control border border-primary\" id=\"gender\" value=\"");
      out.print(rs.getString("gender"));
      out.write("\" readonly >\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 text-center\">\r\n");
      out.write("                            <label for=\"doj\">Date Of Joining: </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12\">\r\n");
      out.write("                            <input type=\"text\" name=\"doj\" class=\"form-control border border-primary\" id=\"doj\" value=\"");
      out.print(rs.getString("joining_date"));
      out.write("\" readonly>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 text-center\">\r\n");
      out.write("                            <label for=\"addr\">Address: </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12\">\r\n");
      out.write("                            <input type=\"text\" name=\"addr\" class=\"form-control border border-primary\" id=\"addr\" value=\"");
      out.print(rs.getString("address"));
      out.write("\" readonly >\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 text-center\">\r\n");
      out.write("                            <label for=\"city\">City: </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12\">\r\n");
      out.write("                            <input type=\"text\" name=\"city\" class=\"form-control border border-primary\" id=\"city\" value=\"");
      out.print(rs.getString("city"));
      out.write("\" readonly>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 text-center\">\r\n");
      out.write("                            <label for=\"cont\">Country: </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12\">\r\n");
      out.write("                            <input type=\"text\" name=\"cont\" class=\"form-control border border-primary\" id=\"cont\" value=\"");
      out.print(rs.getString("country"));
      out.write("\" readonly >\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 text-center\">\r\n");
      out.write("                            <label for=\"national\">Nationality: </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12\">\r\n");
      out.write("                            <input type=\"text\" name=\"national\" class=\"form-control border border-primary\" id=\"national\" value=\"");
      out.print(rs.getString("nationality_name"));
      out.write("\" readonly>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 text-center\">\r\n");
      out.write("                            <label for=\"dept\">Department: </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12\">\r\n");
      out.write("                            <input type=\"text\" name=\"dept\" class=\"form-control border border-primary\" id=\"dept\" value=\"");
      out.print(rs.getString("dept_name"));
      out.write("\" readonly >\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12 text-center\">\r\n");
      out.write("                            <label for=\"pno\">Passport No: </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-12\">\r\n");
      out.write("                            <input type=\"text\" name=\"pno\" class=\"form-control border border-primary\" id=\"pno\" value=\"");
      out.print(rs.getString("passport_no"));
      out.write("\" readonly>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                    \r\n");
      out.write("                      \r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </form>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");

}
}
catch(Exception e){}

      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"overlay\"></div>\r\n");
      out.write("\r\n");
      out.write("    <!-- jQuery CDN - Slim version (=without AJAX) -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\r\n");
      out.write("        integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <!-- Popper.JS -->\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\"\r\n");
      out.write("        integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <!-- Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\"\r\n");
      out.write("        integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <!-- jQuery Custom Scroller CDN -->\r\n");
      out.write("    <script\r\n");
      out.write("        src=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            $(\"#sidebar\").mCustomScrollbar({\r\n");
      out.write("                theme: \"minimal\"\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#dismiss, .overlay').on('click', function () {\r\n");
      out.write("                $('#sidebar').removeClass('active');\r\n");
      out.write("                $('.overlay').removeClass('active');\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#sidebarCollapse').on('click', function () {\r\n");
      out.write("                $('#sidebar').addClass('active');\r\n");
      out.write("                $('.overlay').addClass('active');\r\n");
      out.write("                $('.collapse.in').toggleClass('in');\r\n");
      out.write("                $('a[aria-expanded=true]').attr('aria-expanded', 'false');\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("   \r\n");
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
