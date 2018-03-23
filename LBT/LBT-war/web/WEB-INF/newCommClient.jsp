<%-- 
    Document   : newCommClient
    Created on : 22 mars 2018, 22:29:06
    Author     : Manuel_PCB
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>La Carte</title>
        <link href="Css/styleSheet.css" rel="stylesheet" type="text/css"/> 
    </head>
    <header>
        <h1><i>La Carte</i></h1>
        <form  action="FrontController?section=ParseCatalogue" method="post">
            <label>Catégorie Carte : </label>
            <select name="categCarte">
                <c:forEach items="${categorie}" var="c">
                    <c:if test="${c.nom == cateChoix}" >
                        <option value = "${c.nom}" selected>${c.nom}</option>  
                    </c:if>
                    <c:if test="${!(c.nom == cateChoix)}">
                        <option value = "${c.nom}" >${c.nom}</option>
                    </c:if>
                </c:forEach>
            </select>
            <input type='submit' name='CategoCarte' value='Affiner' />
        </form>
            <br />
        <table>
            <thead>
                <tr>
                    <th rowspan="3">Commande</th>
                    <th rowspan="3">Image</th>
                </tr>
                <tr>
                    <th>Nom</th>
                    <th>Description</th>
                    <th>Dispopnibilite</th>
                </tr>
                <tr>
                    <th>Composition</th>
                    <th>Ingrédients</th>
                    <th>PrixTTC</th>
                </tr>
            </thead>
        </table>
    </header>
                     
        <c:url var="frontCat" value="FrontController?section=AfficheMenu" />
        <c:import url="${frontCat}"/>
                    <footer>
                        
                    </footer>

