<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>서원대학교</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" type="text/css" href="css/Main.css" />
<link rel="stylesheet" type="text/css" href="css/Prototype_CSS.css" />
<link rel="stylesheet" type="text/css" href="css/LoginPopup.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css"
	integrity="sha512-rqQltXRuHxtPWhktpAZxLHUVJ3Eombn3hvk9PHjV/N5DMUYnzKPC1i3ub0mEXgFzsaZNeJcoE0YHq0j/GFsdGg=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<script src="https://kit.fontawesome.com/46fda0e82e.js"
	crossorigin="anonymous"></script>
</head>
<body>
	<div>
		<jsp:include page="TopArea.jsp" />
	
			<main class="main_contents">
				<form action="/EITest" method="post">
					<div class="contents">
						<div class="match tbl_fixed match_row">
							<table>
								<colgroup>
									<col style="width: 10%;">
									<col style="width: 40%;">
									<col style="width: 10%;">
									<col style="width: 10%;">
									<col style="width: 10%;">
									<col style="width: 10%;">
									<col style="width: 10%;">
								</colgroup>

								<tr>
									<td colspan="7">[사범대 전용 진로정체감 검사]</td>
								</tr>
								<tr>
									<th rowspan="2">하위 영역</th>
									<th rowspan="2">문항내용</th>
									<th colspan="5">자가진단 진단 척도(실행 수준)</th>

								</tr>

								<tr>
									<th>매우 그렇지 않다</th>
									<th>그렇지 않다</th>
									<th>보통</th>
									<th>그렇다</th>
									<th>매우 그렇다</th>


								</tr>
								<tr>
									<th rowspan="7">인지</th>
									<td>나는 나의 적성을 탐색하고 교사라는 진로와 연결해 보고 싶다.</td>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_1" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
								<tr>
									<th>진로와 관련된 사항을 스스로 결정하기 위해 내가 무엇을 원하는지 나 자신에 대해 이해하는 시간을
										갖고 싶다.</th>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_2" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
								<tr>
									<td>나는 교사가 된 후 나아갈 수 있는 방향에 대해 알고 교사로서의 나의 모습을 고민해 보고 싶다.</td>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_3" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
								<tr>
									<th>진로와 관련된 나의 가치관을 탐색하고 싶다.</th>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_4" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
								<tr>
									<td>내가 좋아하고 관심 있는 일이 무엇인지 고민하고 교사라는 진로에 포함되는지 생각해 보고 싶다.</td>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_5" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
								<tr>
									<th>내가 원치 않는 진로를 부모님께 강요받았을 때 나의 뜻을 분명히 전달하고 나의 의지로 진로를
										선택하고 싶다.</th>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_6" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
								<tr>
									<td>나는 앞으로 진로와 관련하여 해야 할 일을 결정하고 그것을 잘 처리할 수 있을 것이라는 확신을
										갖고 싶다.</td>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_7" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>

								<tr>
									<th rowspan="7">정서</th>
									<th>나는 교사로서의 나의 능력이 무엇인지 몰라 생기는 막막함을 해소하고 싶다.</th>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_8" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
								<tr>
									<td>나는 진로와 관련하여 생기는 지나친 불안을 줄이고 싶다.</td>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_9" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
								<tr>
									<th>나는 교사라는 진로에 대해 잘 모르는 것 같아 생기는 막연한 걱정을 덜고 싶다.</th>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_10" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
								<tr>
									<td>나는 교사라는 진로에 대한 구체적 목표가 없어서 발생하는 고민을 줄이고 싶다.</td>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_11" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
								<tr>
									<th>나의 전공이나 앞으로의 진로에 대해 친구들과 비교하지 않고 진로와 관련된 나의 정서를 수용하고
										싶다.</th>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_12" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
								<tr>
									<td>나의 흥미가 교사라는 진로와 맞지 않을까 봐 생기는 두려움에 대해 표현하고 그 두려움을 덜고
										싶다.</td>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_13" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
								<tr>
									<th>나는 강점 탐색을 통해 나의 전공을 살려 취업하는데 필요한 자신감을 갖고 싶다.</th>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_14" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>


								<tr>
									<th rowspan="5">행동</th>
									<td>나는 교사에 대해 알아보기 위해 책, 교재, 참고서적, 기타 필요한것 등 여러 가지 정보를
										수집하고 공유하고 싶다.</td>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_15" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
								<tr>
									<th>나는 교사 이외의 여러 가지 종류의 직업을 탐색해 보고 싶다.</th>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_16" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
								<tr>
									<td>나는 교사가 되기 위해 실제로 어떻게 해야 하는지 알고 계획을 세워 보고 싶다.</td>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_17" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
								<tr>
									<th>나는 관심 있는 진로분야에 대한 나의 생각과 고민을 주변의 사람들에게 표현하고 싶다.</th>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_18" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>

								<tr>
									<td>나에게 적합한 진로를 탐색하기 위해 상담이나 심리검사 등을 활용하고 싶다.</td>
									<c:forEach begin="1" end="5" varStatus="status">
										<td><label><input class="Scolar_Evauation"
												name="check_19" value="${status.index}" type="radio"
												onclick="checkOnly(this,this.name)"></label></td>
									</c:forEach>
								</tr>
							</table>
						</div>
						<div>
							<input style="width: 110px; height: 30px" type="submit"
								value="저장"> <input style="width: 110px; height: 30px"
								type="button" onclick="exit()" value="취소">
						</div>
					</div>
		
		</form>

		</main>
</body>
</html>