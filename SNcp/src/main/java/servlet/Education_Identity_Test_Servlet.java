package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.dao.MyPage_DAO;
import data.dao.MyPage_DAO2;
import data.vo.Student_VO;

/**
 * Servlet implementation class Education_Identity_Test_Servlet
 */
@WebServlet("/Education_Identity_Test_Servlet")
public class Education_Identity_Test_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Education_Identity_Test_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String student_number = null;
		String power = null;
		String action = request.getParameter("action");
		
		
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("number")) {
				student_number = cookie.getValue();
			}
			if (cookie.getName().equals("power")) {
				power = cookie.getValue();
			}
		}
		
		MyPage_DAO2 dao2 = new MyPage_DAO2();
		
		
		
		Student_VO st = dao2.getStudentInformation(student_number);
		
		String page = "Education_Identity_Test_page.jsp";
		if(action == null) {
			 page = "Education_Identity_Test_page.jsp";
			 request.setAttribute("student", st);
			 
		}
		
		
		
		
		else if(action.equals("reTest")) {
			ArrayList<String> value = new ArrayList();
			System.out.println("reTest");
			
			System.out.println(student_number);
			for (int i = 0; i < 35; i++) {
				value.add(request.getParameter("check_" + (i + 1)));
			}
			dao2.re_insert(value, student_number);
			
			page = "index.jsp";
			
		}
		
		
		
	
		else if(action.equals("Education_Test_Set")) {
			System.out.println("Education_Test_Set_start");
			ArrayList<String> value = new ArrayList();
			
			
			
			System.out.println(student_number);
			for (int i = 0; i < 19; i++) {
				value.add(request.getParameter("check_" + (i + 1)));
			}
			
			
			dao2.insert_Education_Identity_Test(value,student_number);
			
		
			
			page = "index.jsp";
		}
		
		
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
