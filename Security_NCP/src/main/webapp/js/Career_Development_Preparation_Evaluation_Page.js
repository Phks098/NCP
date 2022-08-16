/**
 * 
 */


function Save() {
	let check = [];
	let university_number = document.getElementById("university_number");

	for (var i = 0; i < document.getElementsByName("check_1").length; i++) {
		if (document.getElementsByName("check_1")[i].checked == true) {
			check.push(document.getElementsByName("check_1")[i].value);
		}
	}
	for (var i = 0; i < document.getElementsByName("check_2").length; i++) {
		if (document.getElementsByName("check_2")[i].checked == true) {
			check.push(document.getElementsByName("check_2")[i].value);
		}
	}
	for (var i = 0; i < document.getElementsByName("check_3").length; i++) {
		if (document.getElementsByName("check_3")[i].checked == true) {
			check.push(document.getElementsByName("check_3")[i].value);
		}
	}
	for (var i = 0; i < document.getElementsByName("check_4").length; i++) {
		if (document.getElementsByName("check_4")[i].checked == true) {
			check.push(document.getElementsByName("check_4")[i].value);
		}
	}
	for (var i = 0; i < document.getElementsByName("check_5").length; i++) {
		if (document.getElementsByName("check_5")[i].checked == true) {
			check.push(document.getElementsByName("check_5")[i].value);
		}
	}
	for (var i = 0; i < document.getElementsByName("check_6").length; i++) {
		if (document.getElementsByName("check_6")[i].checked == true) {
			check.push(document.getElementsByName("check_6")[i].value);
		}
	}

	let parameter = "?university_number" + university_number.innerText + "&check_1=" + check[0] + "&check_2=" + check[1] + "&check_3=" + check[2]
		+ "&check_4=" + check[3]
		+ "&check_5=" + check[4]
		+ "&check_6=" + check[5];

	location.href = "/Professr_Career/Instance" + parameter;

	var form = document.createElement('form'); // 폼객체 생성
	var objs;
	objs = document.createElement('input'); // 값이 들어있는 녀석의 형식
	objs.setAttribute('type', 'text'); // 값이 들어있는 녀석의 type
	objs.setAttribute('name', 'uId'); // 객체이름
	objs.setAttribute('value', $('#uId').val()); //객체값
	form.appendChild(objs);
	form.setAttribute('method', 'post'); //get,post 가능
	form.setAttribute('action', "/login/users"); //보내는 url
	document.body.appendChild(form);
	form.submit();



}