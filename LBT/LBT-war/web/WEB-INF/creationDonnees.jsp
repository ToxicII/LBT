<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
            <p>
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
    <body>
        <table class="Carte">
            <tbody>
                <c:forEach items="${catalogue}" var="p">
                    <c:if test="${p.image!=null}">
                        
                            <tr>
                                <th rowspan="3"><i><a href="#">Ajouter</a></i>
                                    <c:if test="false">
                                        <i><a href="#">Retirer</a>
                                    </c:if>
                                </th>
                                <th rowspan="3"><figure><a href="${p.image}"><img src="${p.image}" title="Agrandir"></a></figure></th>
                            </tr>
                            <tr>
                                <td>${p.nom}</td>
                                <td><p>${p.description}</p>
                                    <%--  <p>${p.getProprietes()}</p>--%>
                                    <c:forEach var="pp" items="${p.proprietes}">
                                        <p><label>${pp}</label></p>
                                    </c:forEach>     </td>
                                <td><c:forEach var="pa" items="${p.getParametres()}">
                                    <p><label>${pa.toString()}</label></p>
                                </c:forEach></td>
                            </tr>
                            <tr>
                                <td><c:forEach var="pr" items="${p.getProduitEnfants()}">
                                    <c:if test="${!pr.description.substring(0,10).equals('Accompagne')}">
                                        <p><label for="Compo">${pr.nom}</label></p>
                                    </c:if>
                                    <c:if test="${pr.description.substring(0,10).equals('Accompagne')}">
                                        <p><input type="radio" name="Compo" id="Compo" 
                                                  value="${pr.reference}" checked /><label for="Compo">${pr.nom}</label></p>
                                    </c:if>
                                    </c:forEach></td>
                                <td><c:forEach items="${p.getIngredients()}" var="i">
                                    <p><input type="checkbox" name="Ingred" id="Ingred" 
                                                  value="${i.nom}" checked /><label for="Ingred">${i.nom}</label></p>
                                    </c:forEach></td>
                                <td><fmt:formatNumber minIntegerDigits="1" minFractionDigits="2"
                                      maxFractionDigits="2" value="${p.getPrixTTC()}"/> €</td>
                            </tr>  
                    
                    </c:if>
                </c:forEach>
            </tbody>                    
        </table>
    </body>
</html>
