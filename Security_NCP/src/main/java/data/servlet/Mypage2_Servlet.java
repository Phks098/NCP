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
		
		student = "201710648";
		
		MyPage_DAO2 dao = new MyPage_DAO2();
		
		
		
		Student_VO getStudent = new Student_VO();
		ArrayList<Mypage_VO> level = new ArrayList<Mypage_VO>();
	
		request.setAttribute("student", getStudent);
		
		request.setAttribute("level", level);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("MyPage.jsp");
		dispatcher.forward(request, response);
		
		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
