/**
@param {msg} 메세지 입력
@return 리턴 값 없음
 */

function test(){
	let test = document.getElementsByName("levelSet");
	for(let i = 0; i<test.length; i++){
		test[i].setAttribute("value",i);
	}
	
	console.log("성공");
}

test()