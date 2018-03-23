<%-- 
    Document   : newCommServeur
    Created on : 22 mars 2018, 15:15:15
    Author     : Manuel_PCB
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nouvelle commande</title>
    </head>
    <body>
        <table>
            <tbody>
                <tr>
                    <th> <a href="#">   Serveur  </a> </th>
                </tr>
                <tr>
                    <th> <a href="#" id="CommClient" onclick="affichNotTable()">    Client   </a> </th>
                    <%--   ici il faut ; une saisie du n° de table puis 
                    créer commande et seulement alors ouvrir l'interface
                    client sur cette commande   --%>
                </tr>
            </tbody>
        </table>
                <form id="noteTable">
                    <%-- ici le notePad de NicoV --%>
                </form>
    </body>
    <script  src="/LBT-war/Js/manuJS01.js" type="text/javascript"></script>
</html>
