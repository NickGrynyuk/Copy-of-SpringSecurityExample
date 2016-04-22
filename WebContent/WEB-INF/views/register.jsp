  <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<!DOCTYPE html>
<html lang="en">
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title></title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" media="screen" href="css/reset.css">
    <link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
    <link rel="stylesheet" type="text/css" media="screen" href="css/grid_12.css">
    <link rel="stylesheet" type="text/css" media="screen" href="css/superfish.css">
    <link rel="stylesheet" type="text/css" media="screen" href="css/skin.css">
    <script src="js/jquery-1.6.2.min.js" type="text/javascript"></script>
    <script src="js/jquery.jcarousel.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="js/superfish.js"></script>
    <script type="text/javascript">   
    $(function(){
                $('.box-5').hover(function(){
                    $(this).find(".fc").stop().animate({height:135}, "fast")
                }, function(){
                    $(this).find(".fc").stop().animate({height:0}, "slow")
                });
            })
    </script>
    <!--[if lt IE 7]>
  		<div style=' clear: both; text-align:center; position: relative;'> <a href="http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode"><img src="http://www.theie6countdown.com/images/upgrade.jpg" border="0" alt="" /></a></div>  
 	<![endif]-->
    <!--[if lt IE 9]>
   		<script type="text/javascript" src="js/html5.js"></script>
    	<link rel="stylesheet" type="text/css" media="screen" href="css/ie.css">
	<![endif]-->
    </head>
    <body>
<!--==============================header=================================-->
<header style="overflow:hidden">
          <div class="main">

          <ul  style="float:right" class="head-nav">
                        
		<sec:authorize access="isAnonymous()">
        <li ><a  href="login">Login </a></li>
        <li ><a  href="register">Registration </a></li>
        </sec:authorize>
     <sec:authorize access="isAuthenticated()">
     <li> <p></p></li>
		<li><a href="index.do>"><%= request.getUserPrincipal().getName() %></a></li>
        <li><a href="logout">Logout </a></li>
        </sec:authorize>
      </ul>
        
          <div class="clear"></div>
        </div>
        <br>	
<p align=center><img src="images/logo2.jpg"  alt="">


    </header>
<!--==============================content================================-->

<div class="main">

<div class="cp">
      <nav>
    <ul class="sf-menu">
       <li><a href="index.do">About Us </a></li>
          <li><a href="#">Jewelry</a>
          <ul>
              <li><a href="bronze.do">Bronze</a></li>
               <li><a href="silver.do">Silver</a></li>
                <li><a href="golden.do">Gold</a></li>
            		</ul>
            		</li>
         <li><a href="contacts.do">Contacts</a></li>
        <li><a href="UDB.do">Clients</a></li>
      
     
        </ul>
    <div class="clear"></div>
  </nav>
         <div class="AboutUs">
         <br>
         <br>
    <form  action="uadd.do" > 
      
            <table border="1" >
                <thead>
                    <tr>
                        <th colspan="2">Enter Information Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                    
                        <td>First Name</td>
                      
                        <td><input type="text" name="fname" value="" /></td>
                    </tr>
                        <tr></tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="lname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="email" name="email" value="" /></td>
                    </tr>
                              <tr></tr>
                    <tr>
                        <td>Login</td>
                        <td><input type="text" name="name" value="" /></td>
                    </tr>
                              <tr></tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" value="" /></td>
                    </tr>
                              <tr></tr>
                    <tr>
                        <td>Image</td>
  
                        <td><input type="text" name="image" value="" /></td><td>-(ex. http://www.site.com/ex.png)<td>
                    </tr>
                              <tr></tr>
                    <tr>
                        <td><input type="submit" value="Confirm" /></td>
                  
                    </tr>
                    <tr>
                        <td colspan="2">Already registered!! <a href="login">Login Here</a></td>
                    </tr>
                </tbody>
            </table>
            
        </form>
 </div>
 </div>
 </div>
      
  
      </body>
