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
              <li><a href="bronzes.do">Bronze</a></li>
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
 
         <h1 align=left >If you need  help, or just want to talk use contacts  below.</h1>
      
         <h1 align=left >   CONTACTS:</h1>
          <h2>  Skype: Nick_Grynyuk<br>
            Email: G_nik94@ukr.net<br>
            vk.com group: http://vk.com/club55284982<br> 
            <a href="mailto:G_nik94@ukr.net?subject=ProgramCenterHelp&body=Hello,need some help" >Press to quick message</a></h2>
   
      

        
        </div>
        </div>
 </div>
      
  
      </body>
