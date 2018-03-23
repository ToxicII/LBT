<%-- 
    Document   : PaveNum
    Created on : 22 mars 2018, 17:28:23
    Author     : Manuel_PCB
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <body>
        <input type="text" id="tableSaisie" value = ""/>
        <table>
            <tbody>
                <tr>
                    <th> <p id="1" onclick="ajouterNum(1)" value="1"> 1  <p></th>
                    <th> <p id="2" onclick="ajouterNum(2)" value="2"> 2  <p></th>
                    <th> <p id="3" onclick="ajouterNum(3)" value="3"> 3  <p></th>
                </tr>
                <tr>
                    <th> <p id="4" onclick="ajouterNum(4)" value="4"> 4  <p></th>
                    <th> <p id="5" onclick="ajouterNum(5)" value="5"> 5  <p></th>
                    <th> <p id="6" onclick="ajouterNum(6)" value="6"> 6  <p></th>
                </tr>
                <tr>
                    <th> <p id="7" onclick="ajouterNum(7)" value="7"> 7  <p></th>
                    <th> <p id="8" onclick="ajouterNum(8)" value="8"> 8  <p></th>
                    <th> <p id="9" onclick="ajouterNum(9)" value="9"> 9  <p></th>
                </tr>
                <tr>
                    <th> <p id="Annul" onclick="effacerNum()"> Eff.   <p> </th>
                    <th> <p>  0  <p></th>
                    <th> <p id="EnterTable" onclick="attribCommTable()">  Entrer  <p></th>
                    <%--   ici il faut ; une saisie du n° de table puis 
                    créer commande et seulement alors ouvrir l'interface
                    client sur cette commande   --%>
                </tr>
            </tbody>
        </table>
    </body>
    <script  src="/LBT-war/Js/manuJS01.js" type="text/javascript"></script>

    
    
    