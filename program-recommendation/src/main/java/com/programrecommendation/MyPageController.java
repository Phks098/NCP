package com.programrecommendation;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.programrecommendation.demo.model.Preparation_Level_VO;
import com.programrecommendation.demo.model.Student_VO;
import com.programrecommendation.demo.service.PreparationLevelService;
import com.programrecommendation.demo.service.StudentService;

@RestController
public class MyPageController {

	@Autowired
	StudentService studentService;

	@Autowired
	PreparationLevelService preparationService;

	@RequestMapping(value = "/mypage")
	public ModelAndView goMypage(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		Student_VO student = studentService.getStudent(request.getParameter("university_number"));
		List<Preparation_Level_VO> level = preparationService.getPreparationLevel("");
		mav.addObject("student", student);
		mav.addObject("level", level);
		mav.setViewName("content/mypage.html");
		return mav;

	}

	@RequestMapping(value = "/test")
	public ModelAndView test(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		List<Preparation_Level_VO> level = preparationService.getPreparationLevel("");
		mav.addObject("student", level);

		mav.setViewName("content/home.html");
		return mav;

	}
}
