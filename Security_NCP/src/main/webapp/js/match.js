/**
 * 
 */
 
 function MatchUpdate() {
	let setMatch = [];
	let matchGet =document.getElementsByName("matchGet");
	
	for(let i = 0; i< matchGet.length; i++){
		setMatch.push(matchGet[i].value);
	}
	
	setMatch = JSON.stringify(setMatch);
	console.log(setMatch);
	

	/*request.open("Put", "./Match", true);
	request.send(setMatch);
*/
}
