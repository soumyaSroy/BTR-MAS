<%@ page language="java" import="java.sql.ResultSet" import="java.sql.Statement" import="java.sql.Connection" import="java.sql.DriverManager" import="java.text.SimpleDateFormat" import="java.util.Date" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
		<%  
		    
			/* Date deptdate=new SimpleDateFormat("dd/MM/yyyy").parse("ddate");
        	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        	String parsedDate = formatter.format(deptdate); */
			/* String returndate = request.getParameter("rdate");
        	Date returndt =new SimpleDateFormat("YYYY-MM-DD").parse(returndate); 
        	String deptdate = request.getParameter("ddate");
        	Date deptdt=new SimpleDateFormat("YYYY-MM-DD").parse(deptdate); */
        	
        	
        	
        	/* String returndate = request.getParameter("rdate");
        	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        	Date returndt = sdf.parse(returndate);
        	
        	String departdate = request.getParameter("ddate");
        	SimpleDateFormat pdf = new SimpleDateFormat("dd/MM/yyyy");
        	Date departdt = pdf.parse(departdate); */
        	
        	/* Date returndate=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("rdate"));
        	Date deptdate=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("ddate")); */
        	
        	/* String returndate = (String) request.getParameter("rdate");
        	String deptdate = (String) request.getParameter("ddate");     	
        	
        	String pattern = "yyyy-MM-dd";
        	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        	String returndt = simpleDateFormat.format(returndate);
        	System.out.println(returndt);
        	
        	String deptdt = simpleDateFormat.format(deptdate);
        	System.out.println(deptdt); */
        	
        	
        	
        	String sid=(String)session.getAttribute("uid");
        	String deptdate = request.getParameter("ddate");
        	String returndate = request.getParameter("rdate");
			String deptcountry = request.getParameter("dtcountry");
			String destcity = request.getParameter("dcity");
			String destaddr = request.getParameter("d_addr");
			String destcountry = request.getParameter("dcountry");
			String destpc = request.getParameter("postal");
			String currency = request.getParameter("currency");
			String estcost = request.getParameter("ecost");
			String advamt = request.getParameter("advance"); 
			String accomod = request.getParameter("accomodation");
			String tpurpose=request.getParameter("purpose");
			try
			{
				Connection connection = null;
			    Class.forName("oracle.jdbc.driver.OracleDriver");
			    connection = DriverManager.getConnection("jdbc:oracle:thin:@132.145.42.131:1521/Testdb_pdb1.evopaassub1.evopaasvcn.oraclevcn.com","trainee_schema","Trn__Schema_21");
				Statement statement = connection.createStatement();
				String command = "INSERT into BATCH9BTR_TRIP_DETAILS(user_id,trip_purpose_id,depart_date,return_date,depart_country,dest_addr,dest_city,dest_country,dest_postal_code,currency,est_cost,adv_amt,accomodation) values("+sid+",'"+tpurpose+"','"+deptdate+"','"+returndate+"','"+deptcountry+"','"+destaddr+"','"+destcity+"','"+destcountry+"','"+destpc+"','"+currency+"',"+estcost+","+advamt+",'"+accomod+"')";
			    statement.executeUpdate(command);
			    
			    String query = "Select Trip_id from batch9btr_trip_details where user_id = '"+sid+"' Order by trip_id DESC FETCH FIRST ROW ONLY";
				Statement st = connection.createStatement();
				ResultSet tr = st.executeQuery(query);
				tr.next();
				String tid = tr.getString("trip_id");
				String pen = "pending";
				
				String commandl1 = "INSERT into BATCH9BTR_APPROVAL_L1(user_id,trip_id,approval_status) values(2,'"+tid+"','"+pen+"')";
				String commandl2 = "INSERT into BATCH9BTR_APPROVAL_L2(user_id,trip_id,approval_status) values(3,'"+tid+"','"+pen+"')";
				String commandl3 = "INSERT into BATCH9BTR_APPROVAL_L3(user_id,trip_id,approval_status) values(4,'"+tid+"','"+pen+"')";
				st.executeUpdate(commandl1);
				st.executeUpdate(commandl2);
				st.executeUpdate(commandl3);
				

			    out.println("<script type=\"text/javascript\">");
	            out.println("alert('Request Successfully Submitted!');");
	            out.println("window.location.href = \"user-new-trip.jsp\";");
	            out.println("</script>");
				out.println("Data is successfully inserted!");
			    
			}
			catch(Exception e)
			{
			System.out.print(e);
			e.printStackTrace();
			}
		%>
</body>
</html>