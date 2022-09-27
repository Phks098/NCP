package com.programrecommendation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.programrecommendation.demo.service.StudentService;

@Controller
public class ProfessorController {

	@Autowired
	public StudentService studentService;

	@RequestMapping(value = "/professer")
	public ModelAndView goMypage(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("content/professorStudentList.html");
		return mav;

	}

	@ResponseBody
	@RequestMapping(value = "/professer/get")
	public String getKeyword(HttpServletRequest request) {

		System.out.println("request.getParam:" + request.getParameter("keyword"));
		String keyword = request.getParameter("keyword");
		String professor = "10008";
		String studentList = studentService.getAllStudentList(professor, keyword);
		return studentList;

	}

}
