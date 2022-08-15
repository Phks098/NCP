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

import data.dao.MyPage_DAO;
import data.vo.Mypage_VO;
import data.vo.Student_VO;


@WebServlet("/Mypage_Servlet")
public class Mypage_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Mypage_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		String action = request.getParameter("action");
		String student = request.getParameter("student");
		student="201710648";
		Student_VO getStudent = MyPage_DAO.getStudentInformation(student);
		ArrayList<Mypage_VO> level = MyPage_DAO.getStudent_Level(student);
	
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
