<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:forEach items="${categorieCartes}" var="cat">
    
    <c:url var="front" value="FrontController?section=menuContent&cat=${cat.nom}" />
    |<a href="${front}" >${cat.nom}</a>
    
</c:forEach>
