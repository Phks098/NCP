package data.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.dao.MyPage_DAO;
import data.dao.MyPage_DAO2;
import data.dao.Scholar_Evaluation_DAO;
import data.vo.Mypage_VO;
import data.vo.Professor_education_identity_test_VO;
import data.vo.Student_VO;

@WebServlet("/Professor_Search_Student_Servlet")
public class Professor_Search_Student_Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public Professor_Search_Student_Servlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		String prof  = request.getParameter("professor");
		String action=request.getParameter("action");
		
		
		
		prof = "10008";
		

		Scholar_Evaluation_DAO evaluationDao = new Scholar_Evaluation_DAO();
		MyPage_DAO2 dao = new MyPage_DAO2();
		
	
		String page ="Professor_Search_Student.jsp";
		
		/* 김대욱 교수님 코드 10008 
		   백지연 교수님 코드 1*/
		 
		/* ArrayList<student_VO>student = dao.getStudent_informaton(); */

		
		
		if(action == null) {
			String student = request.getParameter("student");
			Mypage_VO mm = new Mypage_VO();
			ArrayList<Student_VO> list = evaluationDao.getStuduent_AllList(prof); // 교수의 지도학생 정보
			ArrayList<ArrayList<Mypage_VO>> levelList = new ArrayList<ArrayList<Mypage_VO>>();
			
			levelList = dao.getStudent_LevelAll(prof);
			/* levelList = dao.getStudent_LevelAll(prof); */
			
			
			request.setAttribute("studentList", list);
			request.setAttribute("levelList", levelList);
			page ="Professor_Search_Student.jsp";
			
			
		}else {
			
			String student = request.getParameter("student");
			
			
			
			//진로개발준비도검사
			if (action.equals("goEvelment")) {
				request.setAttribute("professor",prof);
				page = "Scholar_Evaluation.jsp";
			} 
			
			//정체감평가 부분이다.
			else if(action.equals("goEducaion")) {	
				request.setAttribute("professor",prof);
				page = "Professor_Education_Identity_Test_Page.jsp";
			}
			
			
			
			// 진로개발준비도 검사 저장
			else if(action.equals("Evelment")) {
				

				ArrayList<String> value = new ArrayList();

				for (int i = 0; i < 6; i++) {
					value.add(request.getParameter("check_" + (i + 1)));
				}

				evaluationDao.SetEvaluation(value, student);
				
				
				
				Mypage_VO mm = new Mypage_VO();
				ArrayList<Student_VO> list = evaluationDao.getStuduent_AllList(prof); // 교수의 지도학생 정보
				ArrayList<ArrayList<Mypage_VO>> levelList = new ArrayList<ArrayList<Mypage_VO>>();
				
				levelList = dao.getStudent_LevelAll(prof);
				/* levelList = dao.getStudent_LevelAll(prof); */
				
				
				request.setAttribute("studentList", list);
				request.setAttribute("levelList", levelList);
	
				
				
				page ="Professor_Search_Student.jsp";
			}
			
			
			//진로 정체감 평가 저장
			else if(action.equals("Educaion")) {
				System.out.println("진로정체감 평가 시작");
				
				MyPage_DAO2 m2 = new MyPage_DAO2();
				
				ArrayList<String> value = new ArrayList();
				
				for(int i = 0; i<3; i++) {
					value.add(request.getParameter("check_"+(i+1)));
				}
				
				
				
				List<Professor_education_identity_test_VO> setEducationList = new ArrayList<Professor_education_identity_test_VO>();
				
				for(int i = 0; i<3; i++) {
					setEducationList.add(new Professor_education_identity_test_VO(student,(i+1),Integer.parseInt(value.get(i)),prof,"now()"));
				}
				
				m2.deleteProfessor_Education(student);
				System.out.println("학생"+student+"삭제 끝");
				m2.insertProfessor_education(setEducationList);
				System.out.println("학생"+student+"평가지 입력 지도교수="+prof);
			
				
				Mypage_VO mm = new Mypage_VO();
				ArrayList<Student_VO> list = evaluationDao.getStuduent_AllList(prof); // 교수의 지도학생 정보
				ArrayList<ArrayList<Mypage_VO>> levelList = new ArrayList<ArrayList<Mypage_VO>>();
				
				levelList = dao.getStudent_LevelAll(prof);
				/* levelList = dao.getStudent_LevelAll(prof); */
				
				
				request.setAttribute("studentList", list);
				request.setAttribute("levelList", levelList);
				page ="Professor_Search_Student.jsp";
			}
			
			
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}
	
	public void Matching(ArrayList<Student_VO> list,ArrayList<ArrayList<Mypage_VO>> leveList) {
		
		
	}

}


























