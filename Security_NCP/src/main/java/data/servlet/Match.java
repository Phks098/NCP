package data.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.dao.AdminMode_DAO;


@WebServlet("/Match")
public class Match extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Match() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AdminMode_DAO dao = new AdminMode_DAO();
		String[] setMatch = request.getParameterValues("setMatch");
		
		for(int i =0; i<setMatch.length; i++) {
			System.out.println(setMatch[i]);
		}
		
		/* dao.Update_Matching(matchset); */
	}

}
