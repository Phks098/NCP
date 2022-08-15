package data.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import data.dao.Professor_Student_DAO;
import data.vo.Mypage_VO;
import data.vo.Student_VO;

/**
 * Servlet implementation class Professor_Student
 */
@WebServlet("/Professor_Student")
public class Professor_Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Professor_Student() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		Gson gson = new Gson();
		
		
		
		String professor = "10008";
		String keyword = request.getParameter("keyword");
		
		List<Student_VO> studentList = Professor_Student_DAO.getStudent(professor);
		List<Mypage_VO> leveList =Professor_Student_DAO.getStudent_LevelAll(professor);
		List<Map<String,Object>> studentMap = new ArrayList<>();
	
		
		
		
		for(Student_VO std : studentList) {
			int count = 0;
			Map<String, Object> data = new HashMap<>();
			data.put("university_number", (String)std.getUniversity_number());
			data.put("name", (String)std.getName());
			data.put("major", (String)std.getMajor());
			data.put("grade",(String)std.getGrade());
			data.put("possfer", (String)std.getPossfer());
			data.put("sex",(String)std.getSex());
			
			List<Mypage_VO> temp = new ArrayList<>();
			for (Mypage_VO level : leveList) {
				if(level.getUniversity_number().equals(std.getUniversity_number())) {
					temp.add(level);
				}
			}
			data.put("level",(List<Mypage_VO>)temp);
			studentMap.add(data);
		}
	
	
		
		
		String jsonData = gson.toJson(studentMap);
		response.getWriter().write(jsonData);
		
		
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
