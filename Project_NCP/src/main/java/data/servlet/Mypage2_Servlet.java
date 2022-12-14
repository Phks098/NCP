package data.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.dao.Education_Result_Get_DAO;
import data.dao.MyPage_DAO2;
import data.vo.Education_Reasult_Score_VO;
import data.vo.Mypage_VO;
import data.vo.Student_VO;


//�Ϲ� ���л� ���� ������ ó�� ��Ʈ�ѷ��̴�.
@WebServlet("/Mypage2")

public class Mypage2_Servlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public Mypage2_Servlet() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		
		String action = request.getParameter("action");
		String student = request.getParameter("student");
		
		

		
		MyPage_DAO2 dao = new MyPage_DAO2();
		String page = null;
		
		

		Education_Result_Get_DAO education_dao = new Education_Result_Get_DAO();
		
		
		Student_VO getStudent = new Student_VO();
		ArrayList<Education_Reasult_Score_VO> educationList = new ArrayList<Education_Reasult_Score_VO>();
		ArrayList<Mypage_VO> level = new ArrayList<Mypage_VO>();
		
		
		
		//Education_Test_Set
		if(action== null) {
			if(student != null) {
				getStudent = dao.getStudentInformation(student);
				level = dao.getStudent_Level(student);
				educationList = education_dao.getEducation(student);
				page ="MyPage.jsp";
			}
			
			
			
			
		}
				
		
	
		else if(action.equals("reTest")) {
			ArrayList<String> value = new ArrayList();
			System.out.println("reTest");
			
			System.out.println(student);
			for (int i = 0; i < 35; i++) {
				value.add(request.getParameter("check_" + (i + 1)));
			}
			dao.re_insert(value, student);
			page = "MyPage.jsp";
		}
		
		
		
		
		
		
		
		else if(action.equals("Education_Test_Set")) {
			
			System.out.println("Education_Test_Set_start");
			ArrayList<String> value = new ArrayList();
			
			
			
			System.out.println(student);
			for (int i = 0; i < 19; i++) {
				value.add(request.getParameter("check_"+(i + 1)));
				
			}
			
			
			for (int i = 0; i < 19; i++) {
				System.out.println(value.get(i));
				
			}
			
			
			dao.insert_Education_Identity_Test(value,student);
			
		
			
			page = "MyPage.jsp";
		}		
		
		
		System.out.println(getStudent.toString());
		request.setAttribute("student", getStudent);
		request.setAttribute("educationList", educationList);
		request.setAttribute("level", level);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
		
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
