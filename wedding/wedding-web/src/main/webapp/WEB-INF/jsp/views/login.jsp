<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
    
<my:layout title="Klárka&AMP;Olda">
    
<body>

    <header>

        <div class="container">

            <a class="logo" href="#"><img src="images/logo-white.png" alt="Logo"></a>

            <div class="menu-nav-icon" data-nav-menu="#main-menu"><i class="icon icon-bars"></i></div>

            <ul class="main-menu visible-on-click" id="main-menu">
                <li><a href="${pageContext.request.contextPath}/">Domů</a></li>

            </ul><!-- main-menu -->

        </div><!-- container -->
    </header>


    <div class="main-slider">
        <div class="display-table center-text">
            <div class="display-table-cell">
                <div class="slider-content">

                    <h1 class="title">Přihlaste se!</h1>


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
                            <h2 class="form-signin-heading">Ano, semhle</h2>

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

                            <button class="btn btn-lg btn-primary btn-block" type="submit">Vstoupit</button>
                            <br>


                        </form>


                    </div><!-- content -->

                </div><!-- col-sm-12 -->
            </div><!-- row -->
        </div><!-- container -->
    </section><!-- section -->

</
        <!-- SCIPTS -->

        <script src="common-js/jquery-3.1.1.min.js"></script>

        <script src="common-js/tether.min.js"></script>

        <script src="common-js/bootstrap.js"></script>

        <script src="common-js/scripts.js"></script>

</body>
</my:layout>
</html>