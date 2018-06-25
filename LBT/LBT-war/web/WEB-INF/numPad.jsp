<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="Css/numPadStyle" type="text/css" href="style.css">

<div id="inputField" ></div>

<div id="numPad">  

    <div id="row1">
        <button class="key">1</button>
        <button class="key">2</button>
        <button class="key">3</button>				
    </div>
    <div id="row2">
        <button class="key">4</button>
        <button class="key">5</button>
        <button class="key">6</button>				
    </div>
    <div id="row3">
        <button class="key">7</button>
        <button class="key">8</button>
        <button class="key">9</button>				
    </div>
    <div id="row4">
        <button type="" class="key del">C</button>
        <button class="key">0</button>		
    </div>	

    <form action="FrontController" method="POST">
        <input type="hidden" name="section" value="connexionControl" />
        <input id="idOut" type="hidden" name="id" value="" />							
        <input type="submit" id="okButton" class="key ok" value="OK" />						
    </form>	
    
</div> 		

<script src="JS/numPad.js"></script>