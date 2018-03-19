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
        <p>${message}</p>
         
        <c:url var="frontCat" value="FrontController?section=Catalogue" />
        <a href="${frontCat}">afficher catalogue</a><br><br>
        <p>${messageCat}</p>
        
    </body>
</html>
