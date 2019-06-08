<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" trimDirectiveWhitespaces="true" %>

<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
    <head>
       <title>Klárka&AMP;Olda</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta charset="UTF-8">


        <!-- Font -->

        <link href="https://fonts.googleapis.com/css?family=Playball%7CBitter" rel="stylesheet">

        <!-- Stylesheets -->
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

        <link href="common-css/font-icon.css" rel="stylesheet">

        <link href="03-regular-page/css/styles.css" rel="stylesheet">

        <link href="03-regular-page/css/responsive.css" rel="stylesheet">

    </head>
    <body>

        <header>

            <div class="container">

                <a class="logo" href="#"><img src="images/logo-white.png" alt="Logo"></a>

                <div class="menu-nav-icon" data-nav-menu="#main-menu"><i class="icon icon-bars"></i></div>

                <ul class="main-menu visible-on-click" id="main-menu">
                    <li><a href="/">Domů</a></li>
                    <li><a href="/logout">Odhlásit se</a></li>
                </ul><!-- main-menu -->

            </div><!-- container -->
        </header>


        <div class="main-slider">
            <div class="display-table center-text">
                <div class="display-table-cell">
                    <div class="slider-content">

                        <h1 class="title">Prosím, dejte nám vědět</h1>


                    </div><!-- slider-content-->
                </div><!--display-table-cell-->
            </div><!-- display-table-->
        </div><!-- main-slider -->


        <section class="regular-area">
            <div class="container">
                <div class="row">
                     
                    <div class="col-sm-12">

                        <div class="content">
                           <form id="giftGuestDTO" class="form-horizontal" action="/guestpage/save" method="post"><div class="form-group">



                            <div class="form-check">
                                        <input class="form-check-input" type="checkbox" name="lunch" value="lunch" value="" id="defaultCheck1"    >
                                        <label class="form-check-label" for="defaultCheck1">
                                            ANO, dojdu na hostinu
                                        </label>
                                    </div>
                            <div class="form-check">
                                        <input class="form-check-input" type="checkbox" name="party" value="party" id="defaultCheck1"  >
                                        <label class="form-check-label" for="defaultCheck1">
                                            ANO, dojdu na párty
                                        </label>
                                    </div>
                                </div>
                                            <div class="form-group">
                                    <table class="table table-bordered">
                                        <tr>
                                            <th>Název</th>
                                            <th>Popis</th>
                                            <th>Vybrán</th>

                                        </tr>
                                        <tr>

                                                <td class="col-xs-1">tv</td>
                                                <td class="col-xs-1">smartTV1</td>
                                                <td class="col-xs-1"><input type="radio" name="selectedgift" value="11"  /></td>
                                            </tr>
                                        <tr>

                                                <td class="col-xs-1">tv</td>
                                                <td class="col-xs-1">smartTV2</td>
                                                <td class="col-xs-1"><input type="radio" name="selectedgift" value="12"  /></td>
                                            </tr>
                                        <tr>

                                                <td class="col-xs-1">tv</td>
                                                <td class="col-xs-1">smartTV3</td>
                                                <td class="col-xs-1"><input type="radio" name="selectedgift" value="13"  /></td>
                                            </tr>
                                        <tr>

                                                <td class="col-xs-1">testName</td>
                                                <td class="col-xs-1">testDescription</td>
                                                <td class="col-xs-1"><input type="radio" name="selectedgift" value="1"  /></td>
                                            </tr>
                                        </table>
                                </div>
                            
                                <div class="form-group">

                                    <input type="submit" value="Uložit" class="btn btn-primary btn-lg">


                                </div>
                            <div>
<input type="hidden" name="_csrf" value="65c31f8f-7285-49b2-b34a-8e503c77bb6b" />
</div></form></div><!-- content -->

                    </div><!-- col-sm-12 -->
                </div><!-- row -->
            </div><!-- container -->
        </section><!-- section -->


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


        <!-- SCIPTS -->

        <script src="common-js/jquery-3.1.1.min.js"></script>

        <script src="common-js/tether.min.js"></script>

        <script src="common-js/bootstrap.js"></script>

        <script src="common-js/scripts.js"></script>

    </body>
</html>