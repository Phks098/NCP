/**
 * 
 */

function MatchUpdate() {
	let matchGet = document.getElementsByName("matchGet");
	var params = "setMatch:[";

	for (var i = 0; i < matchGet.length; i++) {
		if(i == matchGet.length){
			params += matchGet[i];
		}
		params +=  matchGet[i].value+",";
		
	}
	params += "]"
	
	params = JSON.stringify(params);
	
	console.log(params);



}
