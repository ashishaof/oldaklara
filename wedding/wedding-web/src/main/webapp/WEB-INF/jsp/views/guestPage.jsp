<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" trimDirectiveWhitespaces="true" %>

<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<my:layout title="Klárka&AMP;Olda">

<jsp:attribute name="body">

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
                       <c:if test="${not empty alert_success}">
                            <div class="alert alert-success" role="alert"><c:out value="${alert_success}"/></div>
                        </c:if>
                        <form:form method="post" action="${pageContext.request.contextPath}/guestpage/save" modelAttribute="giftGuestDTO"
                                   cssClass="form-horizontal">
                            <div class="form-group">



                        <c:if test="${giftGuestDTO.invitedLunch eq true}"> 
                                <div class="form-check">
                                    <input class="form-check-input" type="checkbox" name="lunch" value="lunch" value="" id="defaultCheck1"   <c:if test="${not empty giftGuestDTO.lunch}"> checked </c:if> >
                                    <label class="form-check-label" for="defaultCheck1">
                                        ANO, dojdu na hostinu
                                    </label>
                                </div>
                        </c:if>

                                <div class="form-check">
                                    <input class="form-check-input" type="checkbox" name="party" value="party" id="defaultCheck1" <c:if test="${not empty giftGuestDTO.party}"> checked </c:if> >
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
                                    <c:forEach items="${giftGuestDTO.gifts}" var="gift">
                                        <tr>

                                            <td class="col-xs-1"><c:out value="${gift.name}"/></td>
                                            <td class="col-xs-1"><c:out value="${gift.description}"/></td>
                                            <td class="col-xs-1"><input type="radio" name="selectedgift" value="${gift.id}" <c:if test="${giftGuestDTO.selectedgift eq gift.id}"> checked </c:if> /></td>
                                        </tr>
                                    </c:forEach>
                                </table>
                            </div>

                            <div class="form-group">

                                <input type="submit" value="Uložit" class="btn btn-primary btn-lg">


                            </div>
                        </form:form>

                    </div><!-- content -->

                </div><!-- col-sm-12 -->
            </div><!-- row -->
        </div><!-- container -->
    </section><!-- section -->

       

</jsp:attribute>
</my:layout>
