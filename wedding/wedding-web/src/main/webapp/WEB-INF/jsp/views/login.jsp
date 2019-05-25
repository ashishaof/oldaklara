<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
    <head>
        <title>TITLE</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta charset="UTF-8">


        <!-- Font -->

        <link href="https://fonts.googleapis.com/css?family=Playball%7CBitter" rel="stylesheet">

        <!-- Stylesheets -->

        <link href="common-css/bootstrap.css" rel="stylesheet">

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
                    <li><a href="index.html">HOME</a></li>
                  
                </ul><!-- main-menu -->

            </div><!-- container -->
        </header>


        <div class="main-slider">
            <div class="display-table center-text">
                <div class="display-table-cell">
                    <div class="slider-content">

                        <h1 class="title">Log in</h1>


                    </div><!-- slider-content-->
                </div><!--display-table-cell-->
            </div><!-- display-table-->
        </div><!-- main-slider -->


        <section class="regular-area">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">

                        <div class="content">


                            <form name="f" action="${pageContext.request.contextPath}/login" method="post" class="form-signin">
                                <h2 class="form-signin-heading">Please sign in</h2>

                                <c:if test="${not empty alert_success}">
                                    <div class="alert alert-success" role="alert"><c:out value="${alert_success}"/></div>
                                </c:if>

                                <c:if test="${param.error ne null}">
                                    <div class="alert alert-danger">
                                        Invalid username or password.
                                    </div>
                                </c:if>

                                <c:if test="${param.logout ne null}">
                                    <div class="alert alert-info">
                                        You have been logged out.
                                    </div>
                                </c:if>


                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                <input type="email" id="username" name="username" class="form-control" placeholder="Email address" required
                                       autofocus>
                                <input type="password" id="password" name="password" class="form-control" placeholder="Password" required>

                                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                                <br>


                            </form>
                          

                        </div><!-- content -->

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

                <div class="newsletter">
                    <h4 class="title">RECEIVE NEWS IN YOUR EMAIL</h4>
                    <p>Join our mailing list to receive news and announcements</p>
                    <div class="email-area">
                        <form>
                            <input class="email-input" type="text" placeholder="Your Email">
                            <button class="submit-btn" type="submit"><i class="icon icon-email-plane"></i></button>
                        </form>
                    </div><!-- email-area -->
                </div><!-- newsletter -->


                <ul class="social-icons">
                    <li><a href="#"><i class="icon icon-heart"></i></a></li>
                    <li><a href="#"><i class="icon icon-twitter"></i></a></li>
                    <li><a href="#"><i class="icon icon-instagram"></i></a></li>
                    <li><a href="#"><i class="icon icon-pinterest"></i></a></li>
                    <li><a href="#"><i class="icon icon-tripadvisor"></i></a></li>
                </ul>

                <ul class="footer-links">
                    <li><a href="#">HOME</a></li>
                    <li><a href="#">OUR STORIES</a></li>
                    <li><a href="#">THE WEDDING</a></li>
                    <li><a href="#">GALLERY</a></li>
                    <li><a href="#">CONTACT</a></li>
                </ul>

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