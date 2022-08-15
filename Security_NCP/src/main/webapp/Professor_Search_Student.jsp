<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="data.dao.*"%>
<%@ page import="data.vo.*"%>
<%@ page import="java.util.ArrayList"%>
<%
ArrayList<Student_VO> list = (ArrayList<Student_VO>) request.getAttribute("studentList");// 교수의 지도학생 정보
ArrayList<ArrayList<Mypage_VO>> levelList = (ArrayList<ArrayList<Mypage_VO>>) request.getAttribute("levelList");
ArrayList<Integer> graph_line = new ArrayList<Integer>();
String professor = request.getParameter("professor");
%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" type="text/css" href="css/Main.css" />
<link rel="stylesheet" type="text/css" href="css/MyPage.css" />
<link rel="stylesheet" type="text/css" href="css/Professor_Search.css" />
<link rel="stylesheet" type="text/css" href="css/LoginPopup.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css"
	integrity="sha512-rqQltXRuHxtPWhktpAZxLHUVJ3Eombn3hvk9PHjV/N5DMUYnzKPC1i3ub0mEXgFzsaZNeJcoE0YHq0j/GFsdGg=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<script src="https://kit.fontawesome.com/46fda0e82e.js"
	crossorigin="anonymous">
	
</script>
</head>
<body>
	<jsp:include page="TopArea.jsp">
		<jsp:param name="visual_image"
			value="https://semsplus.seowon.ac.kr/contents/images/client/main/img_mainvisual.png" />
	</jsp:include>
	<div class="main_content">
		<div class="contents">
			<div class="searchFormZone">
				<div class="inner-left">
					<input id="keyword" type="text" placeholder="프로그램 명을 입력하세요"
						value="">
					<button onclick="searchPrograms();">
						<i class="fa-solid fa-magnifying-glass"></i>
					</button>
				</div>
				<div class="inner-middle">
				
				</div>
			</div>
			<div id="accordion" class="accordion"></div>
		</div>


	</div>


	<jsp:include page="SitemapPopup.jsp" />
	<jsp:include page="LoginPopup.jsp" />
	<script src="js/SitemapPopup.js"></script>
	<script src="js/LoginPopup.js"></script>
	<script src="js/Professor_Search.js"></script>




</body>
</html>