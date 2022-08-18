const request1 = new XMLHttpRequest();

function getMatch(){
	request1.open("Get","./Matching_Criteria",true);
	request1.onreadystatechange = getMatchProcess;
	request1.send(null);
}

function getMatchProcess(){
	const matchArea = document.getElementById("matchArea");
	if(request1.readyState ==4 && request1.status==200){
		
		let matchResult = request1.responseText;
		matchResult = JSON.parse(matchResult);
		 
		console.log(matchResult);
		
		matchArea.innerHTML = "";
		creatematchArea(matchResult);
		
	}else{
		console.log("읽어오는 중입니다.");
	}
}

function creatematchArea(){
	
	
}