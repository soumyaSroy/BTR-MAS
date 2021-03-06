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
                    <a href="#">Find Employee</a>
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
 			
 			<div class="card shadow  mb-5 m-4 rounded">
			  <div class="card-header text-light" style="background: linear-gradient(to right, #754edd, #e2114f);">
			   <div class="row">
				  <div class="col-md-9 col-sm-12 col-xl-9 ">
				  <h4>Trip No. 1121</h4>
				  </div>
				  <div class="col-md-3 col-sm-12 col-xl-3 p-1 d-flex justify-content-center">
				  <span class="badge badge-pill badge-success p-2" style="font-size: 16px;">Application Approved</span>
				  </div>
				</div>
				</div>
			  <div class="card-body" style="background:linen;">		    
			      <div class="row">
			      	<div class="col-md-4 col-sm-4 col-xl-4 bg-light text-center">
			      	<span> Depart date: 18/04/2022 </span>
			      	</div>
			      	
			      	<div class="col-md-4 col-sm-4 col-xl-4  text-center">
			      	<span> Return date: 25/04/2022 </span>
			      	</div>
			      	
			      	<div class="col-md-4 col-sm-4 col-xl-4 bg-light text-center">
			      	<span> Destination Country: Russia </span>
			      	</div>			      
			      </div>
			      
			      <br/>
			      
			       <div class="row">
			       
			        <div class="col-md-3 col-sm-3 col-xl-3 bg-light text-center">
			      	<span> Departure Country: India </span>
			      	</div>
			      	
			      	
			      	<div class="col-md-3 col-sm-3 col-xl-3  text-center">
			      	<span> Accommodation Required: Yes </span>
			      	</div>
			      	
			      	<div class="col-md-3 col-sm-3 col-xl-3 bg-light text-center">
			      	<span> Advance Amount: 15,000 Rs. </span>
			      	</div>
			      	
			      	<div class="col-md-3 col-sm-3 col-xl-3 text-center">
			      	<span> Estimated Cost: 28,000 Rs. </span>
			      	</div>	      			      
			      </div>
			
			      <hr/> 
			      <footer class="blockquote-footer">Request Approved By You On 12/04/2022 </footer>
			  </div>
			</div> 
			
			
			<div class="card shadow  mb-5 m-4 rounded">
			  <div class="card-header text-light" style="background: linear-gradient(to right, #754edd, #e2114f);">
			   <div class="row">
				  <div class="col-md-9 col-sm-12 col-xl-9 ">
				  <h4>Trip No. 1121</h4>
				  </div>
				  <div class="col-md-3 col-sm-12 col-xl-3 p-1 d-flex justify-content-center">
				  <span class="badge badge-pill badge-success p-2" style="font-size: 16px;">Application Approved</span>
				  </div>
				</div>
				</div>
			  <div class="card-body" style="background:linen;">		    
			      <div class="row">
			      	<div class="col-md-4 col-sm-4 col-xl-4 bg-light text-center">
			      	<span> Depart date: 18/04/2022 </span>
			      	</div>
			      	
			      	<div class="col-md-4 col-sm-4 col-xl-4  text-center">
			      	<span> Return date: 25/04/2022 </span>
			      	</div>
			      	
			      	<div class="col-md-4 col-sm-4 col-xl-4 bg-light text-center">
			      	<span> Destination Country: Russia </span>
			      	</div>			      
			      </div>
			      
			      <br/>
			      
			       <div class="row">
			       
			        <div class="col-md-3 col-sm-3 col-xl-3 bg-light text-center">
			      	<span> Departure Country: India </span>
			      	</div>
			      	
			      	
			      	<div class="col-md-3 col-sm-3 col-xl-3  text-center">
			      	<span> Accommodation Required: Yes </span>
			      	</div>
			      	
			      	<div class="col-md-3 col-sm-3 col-xl-3 bg-light text-center">
			      	<span> Advance Amount: 15,000 Rs. </span>
			      	</div>
			      	
			      	<div class="col-md-3 col-sm-3 col-xl-3 text-center">
			      	<span> Estimated Cost: 28,000 Rs. </span>
			      	</div>	      			      
			      </div>
			
			      <hr/> 
			      <footer class="blockquote-footer">Request Approved By You On 12/04/2022 </footer>
			  </div>
			</div> 
 			
 			          
           
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