<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="Css/numPadStyle.css">
        <title>Connexion</title>
    </head>
    <body>                        

        <h1>Connectez vous !</h1>

        <c:url var="frontPad" value="FrontController?section=numPad" />
        <c:import url="${frontPad}" />
        
        ${message}

    </body>
</html>
