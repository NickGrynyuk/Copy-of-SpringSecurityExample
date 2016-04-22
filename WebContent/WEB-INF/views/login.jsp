<html xmlns:th="http://www.thymeleaf.org" xmlns:tiles="http://www.thymeleaf.org">
  <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
  <head>

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
                }, 
                function(){
                    $(this).find(".fc").stop().animate({height:0}, "slow")
                });
            })
    </script>

<style>
password
{
border-radius: 3px; 
   -webkit-border-radius: 3px;
   -moz-border-radius: 3px; 
   -khtml-border-radius: 3px; 
   background: #ffffff !important;
   outline: none; 
   height: 24px; 
   width: 120px; 
   color: #cccccc; 
   font-size: 11px;
   font-family: Tahoma; }
username {
   border: 1px solid #cccccc; 
   border-radius: 3px; 
   -webkit-border-radius: 3px;
   -moz-border-radius: 3px; 
   -khtml-border-radius: 3px; 
   background: #ffffff !important;
   outline: none; 
   height: 24px; 
   width: 120px; 
   color: #cccccc; 
   font-size: 11px;
   font-family: Tahoma; 
}
 p {
    font-family: Verdana; 
    font-size: 20px 
   }
   
   td{
    font-family: Verdana; 
    font-size: 20px  
   }
    input{
    font-family: Verdana; 
    font-size: 20px  
   }
   label{font-family: Verdana; 
    font-size: 15px}
 </style>
    <!--[if lt IE 7]>
  		<div style=' clear: both; text-align:center; position: relative;'> <a href="http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode"><img src="http://www.theie6countdown.com/images/upgrade.jpg" border="0" alt="" /></a></div>  
 	<![endif]-->
    <!--[if lt IE 9]>
   		<script type="text/javascript" src="js/html5.js"></script>
    	<link rel="stylesheet" type="text/css" media="screen" href="css/ie.css">
	<![endif]-->
  </head>
  <body>
  <header>
           <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  

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
          <div class="clear"></div></nav>
        </div>
        </div>
        <br>
<p align=center><img src="images/logo2.jpg"  alt="">
	<br>
	<img src="images/logo.jpg"  alt=""></p>
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
  </nav></div> <br><br>
    <div tiles:fragment="content">
        <form name="f" th:action="@{/login}" method="post">               
            <fieldset>
                <p>Please Login</p>
                <div th:if="${param.error}" class="alert alert-error">    
                 
                </div>
                <div th:if="${param.logout}" class="alert alert-success"> 
                    
                </div>
                <label for="username">Username</label>
                <input type="text" id="username" name="username"/>       
                <label for="password">Password</label>
                <input type="password" id="password" name="password"/>    
                <div class="form-actions">
                    <button type="submit" class="btn">Log in</button>
                </div>
            </fieldset>
        </form>
    </div></div>
  </body>
</html>