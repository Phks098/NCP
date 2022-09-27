package com.programrecommendation.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.programrecommendation.demo.mapper.StudentMapper;
import com.programrecommendation.demo.model.Student_VO;

@Service
public class StudentService {
	
	@Autowired
	public StudentMapper mapper;
	
	
	public String getAllStudentList(String professer, String keyword){
		professer = "10008";
		
		
		List<Student_VO> studentList = mapper.searchStudent(professer,keyword);
		Gson gson = new Gson();
		List<Map<String,Object>> studentMap = new ArrayList<>();
		
		for(Student_VO std : studentList) {
			Map<String, Object> data = new HashMap<>();
			data.put("university_number", (String)std.getStudent_number());
			data.put("name", (String)std.getStudent_name());
			data.put("major", (String)std.getMajor_name());
			data.put("grade",(String)std.getGrade_name());
			data.put("possfer", (String)std.getProfessor_name());
			data.put("sex",(String)std.getSex_name());
			studentMap.add(data);
		}
		String jsonData = gson.toJson(studentMap);
		
		return jsonData;
	}
	
	public Student_VO getStudent(String university_number) {
		
		return  mapper.getStudent("201610767");
	}
	
	

}
