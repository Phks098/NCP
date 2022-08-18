<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
				
				<div id="WeightSetArea" class="WeightSetArea"></div>
				<br><br>
				<div class="info_text_area">
					<img
						src="https://semsplus.seowon.ac.kr/contents/images/client/sub/icon_tit_lg.png" />
					<h3 class="info_text">매칭 비율 설정</h3>
				</div>
				
				<div id="matchArea" class="matchArea">
				
				</div>


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