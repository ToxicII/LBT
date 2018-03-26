<%-- 
    Document   : newCommandView
    Created on : 26 mars 2018, 22:40:02
    Author     : Nicolas VEDRENNE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                
        <nav>
            <h1>Binevenue ${utilisateur.prenom} ${utilisateur.nom} !</h1>
        </nav>
        
        <form action="FrontController" method="GET">
            <input type="text" name="numero" value="" placeholder="numéro de table"/><br>
            <input type="hidden" name="section" value="initCommande" />
            Passer cette commande en tant que client             
            <input type="checkbox" name="actor" value="set" /><br>
            <input type="submit" value="Ok" />
        </form>
        
        ${message}
        
    </body>
</html>
