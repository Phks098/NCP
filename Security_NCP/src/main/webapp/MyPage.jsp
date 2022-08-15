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
	<jsp:include page="TopArea.jsp" />
	<main class="main_contents">
		<div class="contents">

			<section class="nav-contents">
				<div class="nav-inner">
					<ul class="nav-list">
						<li class="l-info select-list"><a class="btnInfo">정보</a></li>
					</ul>
				</div>

				<div class="contents-info show">
					<section class="section_marea">
						<div class="info_text_area">
							<img
								src="https://semsplus.seowon.ac.kr/contents/images/client/sub/icon_tit_lg.png" />
							<h3 class="info_text">기본 정보</h3>
						</div>


						<!-- 학생 기본 정보 출력 -->
						<div class="base_info_table">
							<table>
								<tbody>
									<tr>
										<th>단과대학</th>
										<td>사범대학</td>
										<th>소속</th>
										<td>${student.major}</td>
									</tr>
									<tr>
										<th>부/복수/연계/융합전공</th>
										<td></td>
										<th>학년</th>
										<td>${student.grade}</td>
									</tr>
									<tr>
										<th>학번</th>
										<td>${student.university_number}</td>
										<th>이름</th>
										<td>${student.name}(${student.sex})</td>
									</tr>
								</tbody>
							</table>


							<table>
								<tr>
									<th colspan="6">진단 결과</th>
								</tr>
								<tr>
									<th>진단역량</th>
									<th>역량별 진단 점수</th>
									<th>백분율</th>
									<th>준비수준</th>
									<th>순위</th>
									<th>역량 평가</th>
								</tr>

								<c:choose>
									<c:when test="${not empty student }">
										<c:forEach items="${level}" var="level">
											<tr>
												<c:if test="${level.capability_name eq '자기이해'}">
													<th class="level_category">${level.capability_name}</th>
													<td>${level.category_score}</td>
													<td class="level_score">${level.preparation_degree}%</td>
													<td>${level.preparation_level}</td>
													<td>${level.preparation_rank}</td>
													<td rowspan="8"><div class="canvas_graph">
															<canvas id="myCanvas" style="background-color: aliceblue"
																width="380px" height="380px">			
															</canvas>

														</div></td>
												</c:if>
												<c:if test="${ level.capability_name != '자기이해'}">
													<th class="level_category">${level.capability_name}</th>
													<td>${level.category_score}</td>
													<td class="level_score">${level.preparation_degree}%</td>
													<td>${level.preparation_level}</td>
													<td>${level.preparation_rank}</td>
												</c:if>
											</tr>

										</c:forEach>

									</c:when>
									<c:otherwise>
										<tr>
											<th>자기이해</th>

											<td colspan="4" rowspan="8" style="font-size: 20px;">진로개발진비도
												검사를 진행해주세요
											</td>

										</tr>
										<tr>
											<th>진로탐색</th>
										</tr>
										<tr>
											<th>진로결정</th>
										</tr>
										<tr>
											<th>진로설계</th>
										</tr>
										<tr>
											<th>경력개발</th>
										</tr>
										<tr>
											<th>실무역량</th>
										</tr>
										<tr>
											<th>맞춤취업</th>
										</tr>
										<tr>
											<th>구직활동</th>

										</tr>


									</c:otherwise>
								</c:choose>



							</table>
						</div>
						<br>

						<!-- 학생 기본정보 및 역량 결과 (끝) -->

						<!-- 역량 그래프 요소 -->

						<!-- 역량 그래프 요소 (끝) -->
						<input type="button" onclick="test()" value="test">




					</section>
				</div>
				<!-- contents-info show/학생 기본 정보 및 역량 평가 출력 div-->




			</section>
		</div>
	</main>




	<jsp:include page="SitemapPopup.jsp" />
	<jsp:include page="LoginPopup.jsp" />
	<script src="js/SitemapPopup.js"></script>
	<script src="js/LoginPopup.js"></script>
	<script src="js/Competency_graph.js"></script>

	<!-- 	<script src="js/Canvas_graph.js"></script> -->


</body>
</html>
