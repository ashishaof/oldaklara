<%-- 
    Document   : layout
    Created on : Jun 1, 2019, 9:07:51 PM
    Author     : BAKSHI
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="message"%>

<%-- any content can be specified here e.g.: --%>

<%@ attribute name="title" required="false" %>
<%@ attribute name="head" fragment="true" %>
<%@ attribute name="body" fragment="true" required="true" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>


<head>
    <title>Klárka&AMP;Olda</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8">
	
	
	<!-- Font -->
	
	<link href="https://fonts.googleapis.com/css?family=Playball%7CBitter" rel="stylesheet">
	
	<!-- Stylesheets -->
	
	<link href="common-css/bootstrap.css" rel="stylesheet">
	
	
	<link href="common-css/fluidbox.min.css" rel="stylesheet">
	
	<link href="common-css/font-icon.css" rel="stylesheet">
	
	
	<link href="01-homepage/css/styles.css" rel="stylesheet">
	
	<link href="01-homepage/css/responsive.css" rel="stylesheet">
        
	
</head>


<jsp:invoke fragment="body"/>



<footer>
	<div class="container center-text">

		<div class="logo-wrapper">
			<a class="logo" href="#"><img src="images/logo-black.png" alt="Logo Image"></a>
			<i class="icon icon-star"></i>
		</div>






		<p class="copyright"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>

	</div><!-- container -->
</footer>
