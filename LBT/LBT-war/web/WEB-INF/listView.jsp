
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div>    
    <c:forEach var="lc" items="${commande.ligneCommandes}" >
        lc.produit
        lc.formule        
        lc.quantite
        lc.prix
        <hr>
    </c:forEach>            
</div>
