<%@ page language="java" import="java.sql.ResultSet" import="java.sql.Statement" import="java.sql.Connection" import="java.sql.DriverManager" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>All approved requests</title>

    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="../css/sidebar-style.css">
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet"
        href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"
        integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ"
        crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"
        integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY"
        crossorigin="anonymous"></script>

</head>

<body>

    <div class="wrapper">
        <!-- Sidebar  -->
        <nav id="sidebar">
            <div id="dismiss">
                <i class="fas fa-arrow-left"></i>
            </div>

            <div class="sidebar-header">
                <h3>Welcome</h3>
            </div>

            <ul class="list-unstyled components">
                <p><%=session.getAttribute("fname")%> <%=session.getAttribute("lname")%></p>
                
                    <!-- <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false">Home</a>
                      <ul class="collapse list-unstyled" id="homeSubmenu">
                        <li>
                            <a href="#">Home 1</a>
                        </li>
                        <li>
                            <a href="#">Home 2</a>
                        </li>
                        <li>
                            <a href="#">Home 3</a>
                        </li> 
                    </ul>-->
                
                <li>
                    <a href="admin-new-trip.jsp">New Trip Request</a>
                </li>
                <li>
                    <a href="admin-pending-request.jsp">Pending Request</a>
                </li>
                <li>
                    <a class="active" href="admin-approved-request.jsp">All Approved Request</a>
                </li>
                <li>
                    <a href="all-employee.jsp">All Employees</a>
                </li>
                <li>
                    <a href="../index.jsp">Logout</a>
                </li>
            </ul>

            
        </nav>

        <!-- Page Content  -->
        <div id="content">

            <nav class="navbar navbar-expand-lg navbar bg-light text-white" style="background: linear-gradient(to right, #754edd, #e2114f);">
                <div class="container-fluid">

                    <button type="button" id="sidebarCollapse" class="btn btn-info">
                        <i class="fa fa-bars"></i>
                        <span>Dashboard</span>
                    </button>
                    <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation">
                        <i class="fas fa-align-justify"></i>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="nav navbar-nav ml-auto">
                            <li class="nav-item active">
                                <h3 class="nav-link">Approved Request</h3>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>

            
           
           
            <h3>All approved requests</h3>
 			<hr/>
 			
 			<% 
 			try {
				String sid=(String)session.getAttribute("uid");
				Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@132.145.42.131:1521/Testdb_pdb1.evopaassub1.evopaasvcn.oraclevcn.com","trainee_schema","Trn__Schema_21");
				
				
				String query = "";


				if(sid.equals("2")){
					 query = "select * from batch9btr_trip_details t INNER JOIN batch9btr_approval_l1 a ON t.trip_id=a.trip_id where a.approval_status='approved'";
				}
				else if( sid.equals("3")){
					 query = "select * from batch9btr_trip_details t INNER JOIN batch9btr_approval_l1 a ON t.trip_id=a.trip_id INNER JOIN batch9btr_approval_l2 b ON t.trip_id=b.trip_id where a.approval_status='approved' and b.approval_status = 'approved'";
				}
				else if ( sid.equals("4")){
					 query = "select * from batch9btr_trip_details t INNER JOIN batch9btr_approval_l2 b ON t.trip_id=b.trip_id INNER JOIN batch9btr_approval_l3 c ON t.trip_id=c.trip_id where b.approval_status='approved' and c.approval_status = 'approved'";
				}
				else{
					 query = "";
				}
				
				
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(query);
				while (rs.next()) {
			%>
 			
 			
 			<div class="card shadow  mb-5 m-4 rounded">
			  <div class="card-header text-light" style="background: linear-gradient(to right, #754edd, #e2114f);">
			   <div class="row">
				  <div class="col-md-9 col-sm-12 col-xl-9 ">
				  <h4>Trip No. <%=rs.getString("trip_id")%></h4>
				  </div>
				  <div class="col-md-3 col-sm-12 col-xl-3 p-1 d-flex justify-content-center">
				  <span class="badge badge-pill badge-success p-2" style="font-size: 16px;">Application Approved</span>
				  </div>
				</div>
				</div>
			  <div class="card-body" style="background:linen;">		    
			      <div class="row">
			      	<div class="col-md-4 col-sm-4 col-xl-4 bg-light text-center">
			      	<span> Depart date: <%=rs.getString("Depart_date")%> </span>
			      	</div>
			      	
			      	<div class="col-md-4 col-sm-4 col-xl-4  text-center">
			      	<span> Return date: <%=rs.getString("Return_date")%> </span>
			      	</div>
			      	
			      	<div class="col-md-4 col-sm-4 col-xl-4 bg-light text-center">
			      	<span> Destination Country: <%=rs.getString("dest_country")%> </span>
			      	</div>			      
			      </div>
			      
			      <br/>
			      
			       <div class="row">
			       
			        <div class="col-md-3 col-sm-3 col-xl-3 bg-light text-center">
			      	<span> Departure Country: <%=rs.getString("depart_country")%> </span>
			      	</div>
			      	
			      	
			      	<div class="col-md-3 col-sm-3 col-xl-3  text-center">
			      	<span> Accommodation Required: <%=rs.getString("accomodation")%> </span>
			      	</div>
			      	
			      	<div class="col-md-3 col-sm-3 col-xl-3 bg-light text-center">
			      	<span> Advance Amount: <%=rs.getString("adv_amt")%> </span>
			      	</div>
			      	
			      	<div class="col-md-3 col-sm-3 col-xl-3 text-center">
			      	<span> Estimated Cost: <%=rs.getString("est_cost")%> </span>
			      	</div>	      			      
			      </div>
			
			      <hr/> 
			      <footer class="blockquote-footer">Request Approved By You On <%=rs.getDate("approval_date")%> </footer>
			  </div>
			</div> 
			
			
			<%
			}
			} 
            catch (Exception e) {
			}
			%>
			
			
			
 			
 			          
           
        </div>
    </div>

    <div class="overlay"></div>

    <!-- jQuery CDN - Slim version (=without AJAX) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"
        integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ"
        crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"
        integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm"
        crossorigin="anonymous"></script>
    <!-- jQuery Custom Scroller CDN -->
    <script
        src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>

    <script type="text/javascript">
        $(document).ready(function () {
            $("#sidebar").mCustomScrollbar({
                theme: "minimal"
            });

            $('#dismiss, .overlay').on('click', function () {
                $('#sidebar').removeClass('active');
                $('.overlay').removeClass('active');
            });

            $('#sidebarCollapse').on('click', function () {
                $('#sidebar').addClass('active');
                $('.overlay').addClass('active');
                $('.collapse.in').toggleClass('in');
                $('a[aria-expanded=true]').attr('aria-expanded', 'false');
            });
        });
    </script>
</body>

</html>