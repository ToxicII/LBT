function getXhr() {
    var xhr = null;
    if (window.XMLHttpRequest) // Firefox et autres
        xhr = new XMLHttpRequest();
    else if (window.ActiveXObject) { // Internet Explorer
        try {
            xhr = new ActiveXObject("Msxml2.XMLHTTP");
        } catch (e) {
            xhr = new ActiveXObject("Microsoft.XMLHTTP");
        }
    }
    else { // XMLHttpRequest non supporté par le navigateur
        alert("Votre navigateur ne supporte pas AJAX");
        xhr = false;
    }
    return xhr;
}

function attribCommTable(){
    var menu = document.getElementById("tableSaisie");
    menu.innerHTML = "";
    var ref = menu.getAttribute("value") ;
//    alert(ref);
    var xhr = getXhr();
    var url="FrontController?section=Catalogue&origine=ajax&ref="+ref;
    xhr.open("GET",url,true);
    xhr.onreadystatechange = function () {
        if(xhr.readyState == 4 && xhr.status == 200){
            var reponse = xhr.responseText;
            //alert(reponse);            
            menu.innerHTML = reponse;
        }
    };
    alert(url);
    xhr.send(null);
}



function effacerNum(){
    var menu1 = document.getElementById("tableSaisie");
    
    menu1.setAttribute("value", "");
}

function ajouterNum(ref){
    var menu1 = document.getElementById("tableSaisie");
    var menu = document.getElementById(ref);
    var old = menu1.getAttribute("value") ;
    var addus = menu.getAttribute("value") ;
//    alert(old);
    menu1.setAttribute("value", old+ref);
}

function affichNotTable(){
//	var elemP = document.getElementById("noteTable");        
//	elemP.innerHTML = "<c:url value='FrontController?section=affichPave' var='url01'/>${url01}<c:import url='${url01}' />";

    var menu = document.getElementById("noteTable");
    var xhr = getXhr();
    var url="FrontController?section=affichPave";
    xhr.open("GET",url,true);
    xhr.onreadystatechange = function () {
        if(xhr.readyState == 4 && xhr.status == 200){
            var reponse = xhr.responseText;
            // alert(reponse);            
            menu.innerHTML = reponse;
        }
    };
    xhr.send(null);
};

