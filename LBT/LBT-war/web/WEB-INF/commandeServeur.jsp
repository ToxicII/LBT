
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Commande n°</title>
    </head>
    <body>
        
        <c:url var="frontMB" value="FrontController?section=menuBar" />
        <c:import url="${frontMB}" />
                
        
        <%--<c:url var="frontMS" value="FrontController?section=serveurMenu" />
        <c:import url="${frontMS}" />--%>
        
       <%-- <c:url var="frontLCV" value="FrontController?section=listView" />
        <c:import url="${frontLCV}" /> --%>
       
       <hr>
       <c:forEach var="p" items="${produits}" >           
           ${p.nom}<br>
       </c:forEach>

    </body>
</html>
