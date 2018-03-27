 
 var input = document.getElementById("inputField");
 var formOutput = document.getElementById("idOut");
 var okButton = document.getElementById("okButton");
 var keys = document.getElementsByClassName("key");
 var defColor = keys[0].style.backgroundColor;

 
 for (var i = 0 ; i < keys.length ; i++){	//keys init
	
	if (keys[i].className.includes("del")){
		keys[i].setAttribute("onclick", "delInput()");
	} else if (keys[i].className.includes("ok")){
		keys[i].setAttribute("disabled", "true");
	} else {
		keys[i].setAttribute("onclick", "setInputText(this.innerHTML)");
	}
				
	keys[i].setAttribute("onmouseover", "setOverBackGroundColor(this)");
	keys[i].setAttribute("onmouseout", "setOutBackGroundColor(this)");	
 }
 

function setInputText(text){	

	var inText = input.innerHTML;
	var outText = formOutput.getAttribute("value");	
	if (inText.length < 4 && outText.length < 4){
		input.innerHTML = inText + text;
		outText = outText + text;
		formOutput.setAttribute("value", outText);
		okButton.setAttribute("disabled", "true");
	}
	
	inText = input.innerHTML;
	outText = formOutput.getAttribute("value");	
	
	if (inText.length == 4 && outText.length == 4){
		okButton.removeAttribute("disabled");
	}
	
}

function delInput(){
	
	var inText = input.innerHTML;
	var outText = formOutput.getAttribute("value");	
	outText = outText.substring(0, (inText.length - 1));
	input.innerHTML = inText.substring(0, (inText.length - 1));
	formOutput.setAttribute("value", outText);
	okButton.setAttribute("disabled", "true");
}

function setOverBackGroundColor(element){
	element.style.backgroundColor = "lightBlue";
}

function setOutBackGroundColor(element){
	element.style.background = defColor;
}