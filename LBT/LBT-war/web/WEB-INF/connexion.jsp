

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="Css/numPadStyle" type="text/css" href="style.css">
        <title>Connexion</title>
    </head>
    <body>                        
               
        <h1>Connectez vous !</h1>
        
        <c:url var="frontNP" value="FrontController?section=numPad" />
        <c:import url="${frontNP}" />

        
    </body>
</html>
