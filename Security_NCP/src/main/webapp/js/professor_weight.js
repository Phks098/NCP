/**
 * 
 */

const request = new XMLHttpRequest();

window.onload = searchPrograms();

function searchPrograms() {
	request.open("Get", "./Professor_Weight", true);
	request.onreadystatechange = searchProcess;
	request.send(null);

}

function searchProcess() {
	const WeightSetArea = document.getElementById("WeightSetArea");// id='accordion' 태그에 접근
	if (request.readyState == 4 && request.status == 200) {
		let result = request.responseText;
		result = JSON.parse(result);

		console.log(result);

		WeightSetArea.innerHTML = "";
		createWeight(WeightSetArea, result);

	} else {
		console.log("진행 싫패	");
	}



}

function createWeight(WeightSetArea, data) {

	let div = document.createElement("div");
	let table = document.createElement("table");
	let tbody = document.createElement("tbody");

	//헤더
	let tr00 = document.createElement("tr");
	let th00 = document.createElement("th");
	th00.colSpan = 3;
	th00.innerHTML = "지도 교수 진로개발준비도 평가를 통합점수에 반영하기 위한 가중치 설정"
	tr00.appendChild(th00);

	let tr01 = document.createElement("tr");
	let th01_1 = document.createElement("th");
	let th01_2 = document.createElement("th");
	let th01_3 = document.createElement("th");



	th01_1.innerHTML = "영역별 평가 척도 (수준)";
	th01_2.innerHTML = "기존 가중치";
	th01_3.innerHTML = "신규 가중치";

	th01_1.setAttribute("style", "width:25%");
	th01_2.setAttribute("style", "width:25%");
	th01_3.setAttribute("style", "width:50%");


	tr01.appendChild(th01_1);
	tr01.appendChild(th01_2);
	tr01.appendChild(th01_3);


	//5점
	let tr02 = document.createElement("tr");
	let td02_1 = document.createElement("td");
	let td02_2 = document.createElement("td");
	let td02_3 = document.createElement("td");
	let input05 = document.createElement("input");
	input05.setAttribute("type", "number");
	input05.setAttribute("step", 0.1);
	input05.setAttribute("placeholder", "신규 가중치를 입력하세요");
	input05.setAttribute("onfocus", "this.placeholder=''");
	input05.setAttribute("onblur", "this.placeholder='신규 가중치를 입력하세요' ");
	input05.setAttribute("name", "setweight");
	input05.setAttribute("value",data[4]["weight"]);

	td02_1.innerHTML = "매우 그렇다(5점)";
	td02_2.innerHTML = data[4]["weight"];
	td02_3.appendChild(input05);


	tr02.appendChild(td02_1);
	tr02.appendChild(td02_2);
	tr02.appendChild(td02_3);

	//4점 가중치
	let tr03 = document.createElement("tr");
	let td03_1 = document.createElement("td");
	let td03_2 = document.createElement("td");
	let td03_3 = document.createElement("td");
	let input04 = document.createElement("input");
	input04.setAttribute("type", "number");
	input04.setAttribute("step", 0.1);
	input04.setAttribute("placeholder", "신규 가중치를 입력하세요");
	input04.setAttribute("onfocus", "this.placeholder=''");
	input04.setAttribute("onblur", "this.placeholder='신규 가중치를 입력하세요' ");
	input04.setAttribute("name", "setweight");
	input04.setAttribute("value",data[3]["weight"]);

	td03_1.innerHTML = "매우 그렇다(5점)";
	td03_2.innerHTML = data[3]["weight"];
	td03_3.appendChild(input04);


	tr03.appendChild(td03_1);
	tr03.appendChild(td03_2);
	tr03.appendChild(td03_3);








	//3점 가중치
	let tr04 = document.createElement("tr");
	let td04_1 = document.createElement("td");
	let td04_2 = document.createElement("td");
	let td04_3 = document.createElement("td");
	let input03 = document.createElement("input");
	input03.setAttribute("type", "number");
	input03.setAttribute("step", 0.1);
	input03.setAttribute("placeholder", "신규 가중치를 입력하세요");
	input03.setAttribute("onfocus", "this.placeholder=''");
	input03.setAttribute("onblur", "this.placeholder='신규 가중치를 입력하세요' ");
	input03.setAttribute("name", "setweight");
	input03.setAttribute("value",data[2]["weight"]);

	td04_1.innerHTML = "매우 그렇다(5점)";
	td04_2.innerHTML = data[2]["weight"];
	td04_3.appendChild(input03);


	tr04.appendChild(td04_1);
	tr04.appendChild(td04_2);
	tr04.appendChild(td04_3);


	//2점 가중치
	let tr05 = document.createElement("tr");
	let td05_1 = document.createElement("td");
	let td05_2 = document.createElement("td");
	let td05_3 = document.createElement("td");
	let input02 = document.createElement("input");
	input02.setAttribute("type", "number");
	input02.setAttribute("step", 0.1);
	input02.setAttribute("placeholder", "신규 가중치를 입력하세요");
	input02.setAttribute("onfocus", "this.placeholder=''");
	input02.setAttribute("onblur", "this.placeholder='신규 가중치를 입력하세요' ");
	input02.setAttribute("name", "setweight");
	input02.setAttribute("value",data[1]["weight"]);

	td05_1.innerHTML = "매우 그렇다(5점)";
	td05_2.innerHTML = data[1]["weight"];
	td05_3.appendChild(input02);


	tr05.appendChild(td05_1);
	tr05.appendChild(td05_2);
	tr05.appendChild(td05_3);

	//1점 가중치
	let tr06 = document.createElement("tr");
	let td06_1 = document.createElement("td");
	let td06_2 = document.createElement("td");
	let td06_3 = document.createElement("td");
	let input01 = document.createElement("input");
	input01.setAttribute("type", "number");
	input01.setAttribute("step", 0.1);
	input01.setAttribute("placeholder", "신규 가중치를 입력하세요");
	input01.setAttribute("onfocus", "this.placeholder=''");
	input01.setAttribute("onblur", "this.placeholder='신규 가중치를 입력하세요' ");
	input01.setAttribute("name", "setweight");
	input01.setAttribute("value",data[0]["weight"]);


	td06_1.innerHTML = "매우 그렇다(5점)";
	td06_2.innerHTML = data[0]["weight"];
	td06_3.appendChild(input01);


	tr06.appendChild(td06_1);
	tr06.appendChild(td06_2);
	tr06.appendChild(td06_3);

	tbody.appendChild(tr00);
	tbody.appendChild(tr01);
	tbody.appendChild(tr02);
	tbody.appendChild(tr03);
	tbody.appendChild(tr04);
	tbody.appendChild(tr05);
	tbody.appendChild(tr06);
	
	table.appendChild(tbody);
	
	let save = document.createElement("input");
	save.setAttribute("type", "button");
	save.setAttribute("value", "저장");
	save.setAttribute("onclick", "WeightUdate()");
	save.setAttribute("style","width:110px; height:30px");

	div.appendChild(table);
	div.append(save);
	WeightSetArea.appendChild(div);
}


function WeightUdate(){
	
	const weigttest = document.getElementsByName("setweight");
	let weigt_1 = weigttest[0].value;
	let weigt_2 = weigttest[1].value;
	let weigt_3 = weigttest[2].value;
	let weigt_4 = weigttest[3].value;
	let weigt_5 = weigttest[4].value;
	
	let parameter = "?weigt_1="+weigt_1+"&weigt_2="+weigt_2+"&weigt_3="+weigt_3+"&weigt_4="+weigt_4+"&weigt_5="+weigt_5;
	
	console.log(weigttest[0].value);
	
	request.open("Put", "./Professor_Weight"+parameter, true);
	request.onreadystatechange = searchProcess;
	request.send(null);
	
	
}
