/**
 * 
 */

function MatchUpdate() {
	let matchGet = document.getElementsByName("matchGet");
	let parameter = "?";


	for (i = 0; i < matchGet.length; i++) {
		if (i == matchGet.length - 1) {
			parameter += "setMatch=" + matchGet[i].value;
		} else {
			parameter += "setMatch=" + matchGet[i].value + "&";
		}
	}
	console.log(parameter);
	request.open("PUT", "./Match" + parameter, true);
	request.onreadystatechange = setLevelPage;
	request.send(null);
	
}
function setLevelPage(){
	if (request.readyState == 4 && request.status == 200) {
		
		console.log("amte");
		
	} else {
		console.log("진행 싫패	");
	}
}