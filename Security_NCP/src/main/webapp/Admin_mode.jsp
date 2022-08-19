<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>서원대학교</title>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" type="text/css" href="css/Main.css" />
<link rel="stylesheet" type="text/css" href="css/MyPage.css" />
<link rel="stylesheet" type="text/css" href="css/LoginPopup.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css"
	integrity="sha512-rqQltXRuHxtPWhktpAZxLHUVJ3Eombn3hvk9PHjV/N5DMUYnzKPC1i3ub0mEXgFzsaZNeJcoE0YHq0j/GFsdGg=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<script src="https://kit.fontawesome.com/46fda0e82e.js"
	crossorigin="anonymous"></script>
</head>
<body>

	<jsp:include page="TopArea.jsp" />

	<main class="main_contents">
		<div class="contents">

			<div class="nav-inner">
				<ul class="nav-list">
					<li class="l-setting"><a class="btnSetting">관리 설정</a></li>
				</ul>
			</div>

			<div class="contents-info show">
				<div class="info_text_area">
					<img
						src="https://semsplus.seowon.ac.kr/contents/images/client/sub/icon_tit_lg.png" />
					<h3 class="info_text">가중치 설정</h3>
				</div>

				<!--가중치 설정 DIV-->
				<div id="WeightSetArea" class="WeightSetArea">
					<table>

						<colgroup>
							<col style="width: 25%;">
							<col style="width: 25%;">
							<col style="width: 50%;">
						</colgroup>

						<tbody>
							<tr>
								<th colspan="3">지도 교수 진로개발준비도 평가를 통합점수에 반영하기 위한 가중치 설정</th>
							</tr>
							<tr>
								<th>영역별 평가 척도 (수준)</th>
								<th>기존 가중치</th>
								<th>신규 가중치</th>
							</tr>
							<tr>
								<td>매우 그렇다(5점)</td>
								<td id="td05"></td>
								<td><input type="number" step="0.01" id="input05"
									placeholder="신규 가중치를 입력하세요" onfocus="this.placeholder=''"
									onblur="this.placeholder='신규 가중치를 입력하세요' " name="setweight"></td>
							</tr>

							<tr>
								<td>그렇다(4점)</td>
								<td id="td04"></td>
								<td><input type="number" step="0.01" id="input04"
									placeholder="신규 가중치를 입력하세요" onfocus="this.placeholder=''"
									onblur="this.placeholder='신규 가중치를 입력하세요' " name="setweight"></td>
							</tr>

							<tr>
								<td>보통(3점)</td>
								<td id="td03"></td>
								<td><input type="number" step="0.01" id="input03"
									placeholder="신규 가중치를 입력하세요" onfocus="this.placeholder=''"
									onblur="this.placeholder='신규 가중치를 입력하세요' " name="setweight"></td>
							</tr>

							<tr>
								<td>그렇지 않다(2점)</td>
								<td id="td02"></td>
								<td><input type="number" step="0.01" id="input02"
									placeholder="신규 가중치를 입력하세요" onfocus="this.placeholder=''"
									onblur="this.placeholder='신규 가중치를 입력하세요' " name="setweight"></td>
							</tr>

							<tr>
								<td>매우 그렇지 않다(1점)</td>
								<td id="td01"></td>
								<td><input type="number" step="0.01" id="input01"
									placeholder="신규 가중치를 입력하세요" onfocus="this.placeholder=''"
									onblur="this.placeholder='신규 가중치를 입력하세요' " name="setweight"></td>
							</tr>
						</tbody>
					</table>
					<div>
						<input class="saveBtn" type="button" onclick="WeightUdate()"
							value="저장">
					</div>

				</div>
				<!--가중치 설정 DIV end-->

				<br> <br>

				<div class="info_text_area">
					<img
						src="https://semsplus.seowon.ac.kr/contents/images/client/sub/icon_tit_lg.png" />
					<h3 class="info_text">매칭 비율 설정</h3>
				</div>

				<div id="matchArea" class="matchArea">
					<table>
						<colgroup>
							<col style="width: 20%;">
							<col style="width: 11%;">
							<col style="width: 11%;">
							<col style="width: 11%;">
							<col style="width: 11%;">
							<col style="width: 11%;">
							<col style="width: 11%;">
							<col style="width: 14%;">
						</colgroup>
						<tbody>
							<tr>
								<th colspan="8">진단영역-우리대학 진로취업 역량 매칭 비율 설정</th>
							</tr>
							<tr>
								<th></th>
								<th>자기이해</th>
								<th>전공직업정보</th>
								<th>진로<br>결정 확신도
								</th>
								<th>의사<br>결정 자신감
								</th>
								<th>관계 활용도</th>
								<th>구직 준비도</th>
								<th></th>
							</tr>
							<tr>
								<th>진로취업 역량 <br>(단계)
								</th>
								<th></th>
								<th></th>
								<th></th>
								<th></th>
								<th></th>
								<th></th>
								<th>합계</th>
							</tr>

							<tr>
								<th>자기이해</th>
								<c:forEach begin="1" end="7" varStatus="status">
									<td><input class="matchText" type="number"
										id="match01_${status.index}">%</td>
								</c:forEach>

							</tr>

							<tr>
								<th>진로탐색</th>
								<c:forEach begin="1" end="7" varStatus="status">
									<td><input class="matchText" type="number"
										id="match02_${status.index}"> %</td>
								</c:forEach>

							</tr>

							<tr>
								<th>진로결정</th>
								<c:forEach begin="1" end="7" varStatus="status">
									<td><input class="matchText" type="number"
										id="match03_${status.index}"> %</td>
								</c:forEach>
							</tr>

							<tr>
								<th>진로설계</th>
								<c:forEach begin="1" end="7" varStatus="status">
									<td><input class="matchText" type="number"
										id="match04_${status.index}"> %</td>
								</c:forEach>
							</tr>

							<tr>
								<th>경력개발</th>
								<c:forEach begin="1" end="7" varStatus="status">
									<td><input class="matchText" type="number"
										id="match05_${status.index}"> %</td>
								</c:forEach>
							</tr>

							<tr>
								<th>실무역량</th>
								<c:forEach begin="1" end="7" varStatus="status">
									<td><input class="matchText" type="number"
										id="match06_${status.index}"> %</td>
								</c:forEach>
							</tr>

							<tr>
								<th>맞춤취업</th>
								<c:forEach begin="1" end="7" varStatus="status">
									<td><input class="matchText" type="number"
										id="match07_${status.index}"> %</td>
								</c:forEach>
							</tr>

							<tr>
								<th>구직활동</th>
								<c:forEach begin="1" end="7" varStatus="status">
									<td><input class="matchText" type="number"
										id="match08_${status.index}"> %</td>
								</c:forEach>
							</tr>


						</tbody>
					</table>
					<div>
						<input class="saveBtn" type="button" onclick="WeightUdate()"
							value="저장">
					</div>
					<br> <br>

					

				</div>

				<div class="info_text_area">
					<img
						src="https://semsplus.seowon.ac.kr/contents/images/client/sub/icon_tit_lg.png" />
					<h3 class="info_text">준비수준 진단 기준설정</h3>
				</div>
				<div id="leveArea"></div>


			</div>
		</div>
	</main>
	<jsp:include page="SitemapPopup.jsp" />
	<jsp:include page="LoginPopup.jsp" />
	<script src="js/SitemapPopup.js"></script>
	<script src="js/LoginPopup.js"></script>
	<script src="js/professor_weight.js"></script>
	<script src="js/Matching_Criteria.js"></script>


</body>
</html>