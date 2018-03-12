<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accueil</title>
    </head>
    <body>
        <c:url var="frontJT" value="FrontController?section=jeuTest" />
        <a href="${frontJT}">création du jeu de test</a><br><br>
        
        ${message}
        <br>
        <c:url var="frontCT" value="FrontController?section=creationDonnees" />
        <a href="${frontCT}">création du jeu de test G</a><br><br>
        
        ${message}
        
    </body>
</html>
