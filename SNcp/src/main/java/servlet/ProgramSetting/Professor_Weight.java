package servlet.ProgramSetting;

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
import data.dao.Admin_Set_DAO;
import data.vo.Professor_weight_VO;

@WebServlet("/Professor_Weight")
public class Professor_Weight extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Professor_Weight() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Admin_Set_DAO dao = new Admin_Set_DAO();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println("get 요청 받음");
		Gson gson = new Gson();

		List<Professor_weight_VO> weightList = dao.getAll_Professor_weight_VO();
		List<Map<String, Object>> data = new ArrayList<>();

		for (Professor_weight_VO weight : weightList) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("evaluation_grade", weight.getEvaluation_grade());
			map.put("weight", weight.getWeight());
			data.add(map);
		}

		String jsonData = gson.toJson(data);
		response.getWriter().write(jsonData);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		AdminMode_DAO dao = new AdminMode_DAO();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println("Put 요청 받음");

		String weigt1 = request.getParameter("weigt_1");
		String weigt2 = request.getParameter("weigt_2");
		String weigt3 = request.getParameter("weigt_3");
		String weigt4 = request.getParameter("weigt_4");
		String weigt5 = request.getParameter("weigt_5");

		dao.Update_Professor_weight_VO(weigt1, 5);
		dao.Update_Professor_weight_VO(weigt2, 4);
		dao.Update_Professor_weight_VO(weigt3, 3);
		dao.Update_Professor_weight_VO(weigt4, 2);
		dao.Update_Professor_weight_VO(weigt5, 1);

		Gson gson = new Gson();

		List<Professor_weight_VO> weightList = dao.getAll_Professor_weight_VO();
		List<Map<String, Object>> data = new ArrayList<>();

		for (Professor_weight_VO weight : weightList) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("evaluation_grade", weight.getEvaluation_grade());
			map.put("weight", weight.getWeight());
			data.add(map);
		}

		String jsonData = gson.toJson(data);
		response.getWriter().write(jsonData);

	}

}
