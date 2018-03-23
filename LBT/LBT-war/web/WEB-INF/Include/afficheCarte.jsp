<%-- 
    Document   : afficheCarte
    Created on : 22 mars 2018, 10:03:55
    Author     : Manuel_PCB
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <section>
        <div id="BodyCarte">
            <table class="Carte">
                <tbody>
                    <c:forEach items="${catalogue2}" var="p">
                        <%--${p.description}    <br />
                        ${catalogue2}
                        ${p.proprietes}     <br />
                        ${p.image}          <br />
                        ${p.parametres} <br /> --%>
                        
                        
                        
                        <c:if test="${p.image!=null}"> 

                                <tr>
                                    <th rowspan="3"><i><a href="#">Ajouter</a></i>
                                    </th>
                                    <th rowspan="3"><figure><a href="${p.image}"><img src="${p.image}" title="Agrandir"></a></figure></th>
                                </tr>
                                <tr>
                                    <td>${p.nom}</td>
                                    <td><p>${p.description}</p>
                                        <c:forEach var="pp" items="${p.proprietes}">
                                            <p><label>${pp}</label></p>
                                        </c:forEach>     </td>
                                    <td><c:forEach var="pa" items="${p.parametres}">
                                        <p><label>${pa.toString()}</label></p>
                                    </c:forEach></td>
                                </tr>
                                <tr>
                                    <td><c:forEach var="pr" items="${p.produitEnfants}">
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
        </div>
    </section>