
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accueil</title>
    </head>
    <body>
        
        <nav>
            <h1>Binevenue ${utilisateur.prenom} ${utilisateur.nom} !</h1>
        </nav>
        
        <c:url var="frontNewC" value="FrontController?section=####" />
        <a href="${frontNewC}">Nouvelle commande</a>
        
        <c:url var="frontCC" value="FrontController?section=####" />
        <a href="${frontCC}">Commandes en cours</a>
        
        <c:url var="frontAC" value="FrontController?section=####" />
        <a href="${frontAC}">Annuler une commande</a>
        
        <c:url var="frontMC" value="FrontController?section=####" />
        <a href="${frontMC}">Modifier une commande</a>
        
        <c:url var="frontEP" value="FrontController?section=####" />
        <a href="${frontEP}">Enregistrer un paiement</a>
        
        <c:url var="frontDEC" value="FrontController?section=####" />
        <a href="${frontDEC}">Déconnexion</a>
        
        
    </body>
</html>
