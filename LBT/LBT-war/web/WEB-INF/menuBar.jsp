<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:forEach var="cc" items="categorieCartes" >
    
    <c:url var="front" value="FrontController?section=menuContent&cat=${cc.nom}" />
    |<a href="${front}" >${cc.nom}</a>
    
</c:forEach>
