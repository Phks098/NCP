package com.programrecommendation;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.programrecommendation.demo.model.SalaryModel;
import com.programrecommendation.demo.service.SalaryService;

@Controller
public class HomeController {

	@Autowired
	SalaryService salaryService;
	
	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public ModelAndView goHome(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		
		List<SalaryModel> salaryList = salaryService.getAllSalary();
		
		mav.addObject("salaryList", salaryList);
		mav.setViewName("content/home.html");
		
		return mav;
	}
	
	@RequestMapping(value = "/home/get")
	public ModelAndView getHome(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		
		SalaryModel salary = salaryService.getSalary(request.getParameter("id"));
		
		mav.addObject("salaryList",salary);
		mav.setViewName("content/home.html");
		
		return mav;
	}
}