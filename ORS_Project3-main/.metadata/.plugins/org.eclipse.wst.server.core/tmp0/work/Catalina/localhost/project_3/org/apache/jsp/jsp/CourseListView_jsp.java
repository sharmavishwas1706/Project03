/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2023-01-21 08:07:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import in.co.rays.project_3.util.HTMLUtility;
import in.co.rays.project_3.dto.CourseDTO;
import java.util.Iterator;
import in.co.rays.project_3.util.DataUtility;
import java.util.List;
import in.co.rays.project_3.util.ServletUtility;
import in.co.rays.project_3.controller.CourseListCtl;
import in.co.rays.project_3.controller.ORSView;
import in.co.rays.project_3.controller.LoginCtl;
import in.co.rays.project_3.controller.ORSView;
import in.co.rays.project_3.controller.LoginCtl;
import in.co.rays.project_3.dto.RoleDTO;
import in.co.rays.project_3.dto.UserDTO;
import in.co.rays.project_3.controller.ORSView;

public final class CourseListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1672391402987L));
    _jspx_dependants.put("/jsp/FooterView.jsp", Long.valueOf(1672391402694L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("in.co.rays.project_3.util.HTMLUtility");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("in.co.rays.project_3.util.ServletUtility");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.CourseListCtl");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.RoleDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.util.DataUtility");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.CourseDTO");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.LoginCtl");
    _jspx_imports_classes.add("in.co.rays.project_3.dto.UserDTO");
    _jspx_imports_classes.add("in.co.rays.project_3.controller.ORSView");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>Course List View</title>\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/js/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/js/CheckBox11.js\"></script>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write(".text {\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write(".p4{\n");
      out.write("background-image: url('");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/bg3.png');\n");
      out.write("\tbackground-size: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<nav class=\"fixed-top\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Header</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\"\n");
      out.write("\tintegrity=\"sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/\"\n");
      out.write("\tcrossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".raj{\n");
      out.write("background-image : linear-gradient(to bottom right, grey, black );\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");

		UserDTO userDto = (UserDTO) session.getAttribute("user");

		boolean userLoggedIn = userDto != null;

		String welcomeMsg = "Hi, ";

		if (userLoggedIn) {
			String role = (String) session.getAttribute("role");
			welcomeMsg += userDto.getFirstName() + " (" + role + ")";
		} else {
			welcomeMsg += "Guest";
		}
	
      out.write("\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<nav class=\"navbar navbar-expand-lg raj\"  > <a class=\"navbar-brand\"\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\"><img\n");
      out.write("\t\t\tsrc=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/custom.png\" width=\"190px\"\n");
      out.write("\t\t\theight=\"50px\"></a>\n");
      out.write("\t\t<button class=\"navbar-toggler \" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("\t\t\tdata-target=\"#navbarNav\" aria-controls=\"navbarNav\"\n");
      out.write("\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\">\n");
      out.write("\t\t\t<i class= \"fas fa-bars\" style=\"color:#fff; font-size: 28px;\"></i></span>\n");
      out.write("\t\t</button>\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("\t\t\t\t<a class=\"nav-link\" href=\"#\"> <span class=\"sr-only\">(current)</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t");

					if (userLoggedIn) {
				
      out.write("\n");
      out.write("\t\t\t\t");

					if (userDto.getRoleId() == RoleDTO.STUDENT) {
				
      out.write("\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Marksheet</font>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\t\tclass=\" far fa-file-alt\"></i>Marksheet Merit List</a>\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\">\n");
      out.write("\t\t\t\t\t<a\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("\t\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\t\taria-expanded=\"false\"> \n");
      out.write("\t\t\t\t\t\t\t<font style=\"color: white;\">User</font>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><i class=\"fas fa-user-tie\"></i>My\n");
      out.write("\t\t\t\t\t\t\t\tProfile</a> <a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\t\tclass=\" fa fa-file-alt\"></i>Change Password</a>\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t");

					} else if (userDto.getRoleId() == RoleDTO.ADMIN) {
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px;\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">User</font>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-circle\"></i>Add User</a> <a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-friends\"></i>User List</a>\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Marksheet\n");
      out.write("\t\t\t\t\t</font></a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"far fa-file\"></i>Add Marksheet</a> <a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-paste\"></i>Marksheet List</a> <a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\" far fa-file-alt\"></i>Marksheet Merit List </a> <a\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"far fa-copy\"></i>Get Marksheet</a>\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Role</font>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-tie\"></i>Add Role</a> <a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-friends\"></i>Role List</a>\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">College</font>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-university\"></i>Add College</a> <a\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-building\"></i>College List </a>\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Course\n");
      out.write("\t\t\t\t\t</font></a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\"><i\t\t\t\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-book-open\"></i>Add Course</a> <a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sort-amount-down\"></i>Course List </a>\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Student</font>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"far fa-user-circle\"></i>Add Student</a> <a\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-users\"></i>Student List</a>\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Faculty\n");
      out.write("\t\t\t\t\t</font></a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user-tie\"></i>Add Faculty</a> <a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\"><i class=\" fas fa-users\"></i>Faculty\n");
      out.write("\t\t\t\t\t\t\tList</a>\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Time\n");
      out.write("\t\t\t\t\t\t\tTable</font>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-clock\"></i>Add TimeTable</a> <a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"far fa-clock\"></i>TimeTable List</a>\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\" style=\"padding-left: 5px\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <font style=\"color: white;\">Subject</font>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-calculator\"></i>Add Subject</a> <a\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\"> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sort-amount-down\"></i>Subject List\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\n");
      out.write("\t\t\t\t");

					}
					}
				
      out.write("\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"\n");
      out.write("\t\t\t\t\tstyle=\"padding-left: 5px; padding-right: 67px\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"><font style=\"color: white;\">");
      out.print(welcomeMsg);
      out.write("\n");
      out.write("\t\t\t\t\t</font></a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("\t\t\t\t\t\t");

							if (userLoggedIn) {
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sign-out-alt\"></i>Logout </a> <a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\"><i class=\"fas fa-user-tie\"></i>My\n");
      out.write("\t\t\t\t\t\t\tProfile</a> <a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\"> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-edit\"></i>Change Password\n");
      out.write("\t\t\t\t\t\t</a> <a class=\"dropdown-item\" target=\"blank\"\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\"><i class=\"fas fa-clone\"></i>Java\n");
      out.write("\t\t\t\t\t\t\tDoc </a>\n");
      out.write("\t\t\t\t\t\t");

							} else {
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sign-in-alt\"><b> Login</b></i> <a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.print(ORSView.USER_REGISTRATION_CTL);
      out.write("\"><i\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fas fa-registered\"><b> User Registration</b></i></a>\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("</nav>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("</head>\n");
      out.write("<body class=\"p4\" >\n");
      out.write("\t\n");
      out.write("\t<div>\n");
      out.write("\t\t<form action=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\" method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
      in.co.rays.project_3.dto.CourseDTO dto = null;
      dto = (in.co.rays.project_3.dto.CourseDTO) _jspx_page_context.getAttribute("dto", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (dto == null){
        dto = new in.co.rays.project_3.dto.CourseDTO();
        _jspx_page_context.setAttribute("dto", dto, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\n");
      out.write("\t\t\t");

				List list1 = (List) request.getAttribute("courseList");
			
      out.write("\n");
      out.write("\t\t\t");

				int pageNo = ServletUtility.getPageNo(request);
				int pageSize = ServletUtility.getPageSize(request);
				int index = ((pageNo - 1) * pageSize) + 1;
				int nextPageSize = DataUtility.getInt(request.getAttribute("nextListSize").toString());
				List list = ServletUtility.getList(request);
				Iterator<CourseDTO> it = list.iterator();
				if (list.size() != 0) {
			
      out.write("\n");
      out.write("\t\t\t<center>\n");
      out.write("\t\t\t\t<h1 class=\"text-light font-weight-bold pt-2\">Course\n");
      out.write("\t\t\t\t\tList</h1>\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");

							if (!ServletUtility.getSuccessMessage(request).equals("")) {
						
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 alert alert-success alert-dismissible\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-color: #80ff80\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n");
      out.write("\t\t\t\t\t\t\t<h4>\n");
      out.write("\t\t\t\t\t\t\t\t<font color=\"#008000\">");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font>\n");
      out.write("\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");

							if (!ServletUtility.getErrorMessage(request).equals("")) {
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\" col-md-4 alert alert-danger alert-dismissible\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n");
      out.write("\t\t\t\t\t\t\t<h4>\n");
      out.write("\t\t\t\t\t\t\t\t<font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font>\n");
      out.write("\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-3\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-2\">\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(HTMLUtility.getList("courseId", String.valueOf(dto.getId()), list1));
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-2\">\n");
      out.write("\t\t\t\t\t\t\t");

								HashMap map = new HashMap();
									map.put("1 y", "1 year");
									map.put("2 y", "2 year");
									map.put("3 y", "3 year");
									map.put("4 y", "4 year");
									map.put("5 y", "5 year");
									String HtmlList = HTMLUtility.getList("duration", dto.getDuration(), map);
							
      out.print(HtmlList);
      out.write("\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-2\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" class=\"btn btn-primary btn-md\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"font-size: 17px\" name=\"operation\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(CourseListCtl.OP_SEARCH);
      out.write("\">&emsp; <input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"submit\" class=\"btn btn-dark btn-md\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"font-size: 17px\" name=\"operation\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(CourseListCtl.OP_RESET);
      out.write("\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-3\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t</br>\n");
      out.write("\t\t\t\t\t<div style=\"margin-bottom: 20px;\" class=\"table-responsive\">\n");
      out.write("\t\t\t\t\t\t<table class=\"table table-dark table-bordered\">\n");
      out.write("\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t<tr style=\"background-color: #8C8C8C;\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<th width=\"10%\"><input type=\"checkbox\" id=\"select_all\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"Select\" class=\"text\"> Select All</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"text\">S.NO</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"text\">Course Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"text\">Duration</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"text\">Description</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th class=\"text\">Edit</th>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t\t");

								while (it.hasNext()) {
										dto = it.next();
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\"><input type=\"checkbox\" class=\"checkbox\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"ids\" value=\"");
      out.print(dto.getId());
      out.write("\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(index++);
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(dto.getCourseName());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(dto.getDuration());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(dto.getDescription());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td align=\"center\"><a href=\"CourseCtl?id=");
      out.print(dto.getId());
      out.write("\">Edit</a></td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<table width=\"100%\">\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"submit\" name=\"operation\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-secondary btn-md\" style=\"font-size: 17px\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(CourseListCtl.OP_PREVIOUS);
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(pageNo > 1 ? "" : "disabled");
      out.write("></td>\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"submit\" name=\"operation\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-md\" style=\"font-size: 17px\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(CourseListCtl.OP_NEW);
      out.write("\"></td>\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"submit\" name=\"operation\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-danger btn-md\" style=\"font-size: 17px\"\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(CourseListCtl.OP_DELETE);
      out.write("\"></td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\"><input type=\"submit\" name=\"operation\"\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"btn btn-secondary btn-md\" style=\"font-size: 17px\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"padding: 5px;\" value=\"");
      out.print(CourseListCtl.OP_NEXT);
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print((nextPageSize != 0) ? "" : "disabled");
      out.write("></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr></tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</br>\n");
      out.write("\t\t\t\t\t");

						}
						if (list.size() == 0) {
							System.out.println("user list view list.size==0");
					
      out.write("\n");
      out.write("\t\t\t\t\t<center>\n");
      out.write("\t\t\t\t\t\t<h1 class=\"text-primary font-weight-bold pt-3\">Course\n");
      out.write("\t\t\t\t\t\t\tList</h1>\n");
      out.write("\t\t\t\t\t</center>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</br>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");

							if (!ServletUtility.getSuccessMessage(request).equals("")) {
						
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4 alert alert-success alert-dismissible\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-color: #80ff80\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n");
      out.write("\t\t\t\t\t\t\t<h4>\n");
      out.write("\t\t\t\t\t\t\t\t<font color=\"#008000\">");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font>\n");
      out.write("\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write(" \n");
      out.write("\t\t\t\t\t\t");

							if (!ServletUtility.getErrorMessage(request).equals("")) {
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\" col-md-4 alert alert-danger alert-dismissible\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\">&times;</button>\n");
      out.write("\t\t\t\t\t\t\t<h4>\n");
      out.write("\t\t\t\t\t\t\t\t<font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font>\n");
      out.write("\t\t\t\t\t\t\t</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t </br>\n");
      out.write("\t\t\t\t\t<div style=\"padding-left: 48%;\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" name=\"operation\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-primary btn-md\" style=\"font-size: 17px\"\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(CourseListCtl.OP_BACK);
      out.write("\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"pageNo\" value=\"");
      out.print(pageNo);
      out.write("\"> <input\n");
      out.write("\t\t\t\t\t\ttype=\"hidden\" name=\"pageSize\" value=\"");
      out.print(pageSize);
      out.write("\">\n");
      out.write("\t\t</form>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write(".footer {\n");
      out.write(" position: fixed;\n");
      out.write("   left: 0;\n");
      out.write("   bottom: 0;\n");
      out.write("   width: 100%;\n");
      out.write("/*      background-color: #343a40;\n");
      out.write(" */      color: white;\n");
      out.write("   text-align: center;\n");
      out.write(" background-image:  linear-gradient(to bottom right, white, black, grey);\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("<div class=\"footer\">\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("<h5>&copy; RAYS Technologies</h5></center>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
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
