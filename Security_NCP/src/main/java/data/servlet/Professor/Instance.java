package data.servlet.Professor;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.dao.Scholar_Evaluation_DAO;

@WebServlet("/Professr_Career/Instance")
public class Instance extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Instance() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String university_number = request.getParameter("university_number");
		
		ArrayList<String> value = new ArrayList<String>();

		for (int i = 0; i < 6; i++) {
			value.add(request.getParameter("check_" + (i + 1)));
			
		}
		for(int i = 0; i<value.size(); i++) {
			System.out.println("평가점수"+i);
		}
		
		Scholar_Evaluation_DAO.SetEvaluation(value, university_number);
		
		response.sendRedirect("/Professor_Search_Student.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
