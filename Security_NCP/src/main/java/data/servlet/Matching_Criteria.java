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

import data.dao.AdminMode_DAO;
import data.vo.Matching_criteria_VO;

@WebServlet("/Matching_Criteria")
public class Matching_Criteria extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Matching_Criteria() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		AdminMode_DAO dao = new AdminMode_DAO();
		ArrayList<Matching_criteria_VO> match = dao.getAll_Matching_criteria_VO(); 
		List<Map<String,Object>> data = new ArrayList<Map<String,Object>>();
		Gson gson = new Gson();
		
		for(Matching_criteria_VO temp : match) {
			Map<String,Object> map =  new HashMap<>();
			map.put("capability_number", temp.getCapability_number());
			map.put("category_number", temp.getCategory_number());
			map.put("matching_rate", temp.getMatching_rate());
			data.add(map);
		}
		
		String jsonData = gson.toJson(data);
		response.getWriter().write(jsonData);
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
