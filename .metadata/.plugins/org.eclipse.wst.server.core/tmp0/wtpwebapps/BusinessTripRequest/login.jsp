<%@ page language="java" import="java.sql.ResultSet"
	import="java.sql.Statement" import="java.sql.Connection"
	import="java.sql.DriverManager"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
		
	<%
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String fname=null;
		String lname=null;
		String uid=null;
		try 
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@132.145.42.131:1521/Testdb_pdb1.evopaassub1.evopaasvcn.oraclevcn.com","trainee_schema","Trn__Schema_21");
		Statement st = con.createStatement();
		ResultSet rs;
		rs = st.executeQuery("select * from BATCH9BTR_USER_DETAILS a INNER JOIN BATCH9BTR_USER_TYPE_MST b ON a.user_type_id=b.user_type_id ");
		int x = 0;
    	while (rs.next()) 
    	{
        	if ((rs.getString("email_id").equals(email)) && rs.getString("password").equals(password)) {
            String stp = rs.getString("role");
            fname=rs.getString("f_name");
            lname=rs.getString("l_name");
            uid=rs.getString("user_id");
            if (stp.equals("Employee")) {
                x = 1;
                break;
            } else {
                x = 2;
                break;
            }
        }
    }
    if (x == 2) 
    {
    	session.setAttribute("fname",fname);
        session.setAttribute("lname",lname); 
        session.setAttribute("uid",uid);
        //session.setAttribute("email", email);
        response.sendRedirect("admin/admin-pending-request.jsp"); 
    } 
    else if (x == 1) 
    {
    	session.setAttribute("fname",fname);
        session.setAttribute("lname",lname);
        session.setAttribute("uid",uid);
      //session.setAttribute("email", email);
        response.sendRedirect("user/user-personal-detail.jsp"); 
    } 
    else 
    {
        out.println("Either you enter Invalid UserName or Password! Please Try Again");
        response.sendRedirect("index.jsp");
     %>
    <%
    } 
    }
    catch (Exception e) 
    	{
            out.println(e);
        }
        session.setAttribute("email", email);
    %> 
   
</body>
</html>