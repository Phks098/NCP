package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import data.dao.Professor_Student_DAO;
import data.vo.Mypage_VO;
import data.vo.Student_VO;

class main {

	public static void main(String[] args){

		String professor = "10008";
		Gson gson = new Gson();
		List<Student_VO> studentList = new ArrayList<>();
		studentList = Professor_Student_DAO.getStudent(professor);
		List<Mypage_VO> leveList = new ArrayList<>();
		leveList = Professor_Student_DAO.getStudent_LevelAll(professor);
		
		List<Map<String, String>> studentMap = new ArrayList<Map<String, String>>();
		List<Map<String, String>> leveMap = new ArrayList<Map<String, String>>();
		
		for(Student_VO std : studentList) {
			Map<String, String> data = new HashMap<>();
			data.put("university_number", std.getUniversity_number());
			data.put("name", std.getName());
			data.put("major", std.getMajor());
			data.put("grade",std.getGrade());
			data.put("possfer", std.getPossfer());
			data.put("sex",std.getSex());
			studentMap.add(data);
			
		}
		
		for (Mypage_VO level : leveList) {
			Map<String, String> data = new HashMap<>();
			data.put("university_number", level.getUniversity_number());
			data.put("category_score", Float.toString(level.getCategory_score()));
			data.put("capability_name", level.getCapability_name());
			data.put("preparation_degree", Integer.toString(level.getPreparation_degree()));
			data.put("preparation_level", level.getPreparation_level());
			data.put("preparation_rank", Integer.toString(level.getPreparation_rank()));
			leveMap.add(data);
		}
		
		
		
	}

}
