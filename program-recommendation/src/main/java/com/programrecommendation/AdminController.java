package com.programrecommendation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.programrecommendation.demo.model.Diagnosis_criteria_VO;
import com.programrecommendation.demo.model.Matching_criteria_VO;
import com.programrecommendation.demo.model.Professor_weight_VO;
import com.programrecommendation.demo.service.LevelService;
import com.programrecommendation.demo.service.MatchService;
import com.programrecommendation.demo.service.ProfesserWeightService;

@Controller
public class AdminController {
	@Autowired
	ProfesserWeightService weightService;

	@Autowired
	MatchService matchService;
	
	@Autowired
	LevelService levelService;

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView goHome(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("content/admin.html");

		return mav;
	}

	// 세팅 값들을 가져오는 함수
	@RequestMapping(value = "/admin/getAll")
	@ResponseBody
	public String getSettingValue() {

		List<Professor_weight_VO> weight = weightService.getWeight();
		List<Matching_criteria_VO> match = matchService.getMatch();
		List<Diagnosis_criteria_VO> level = levelService.getLevel();
		
		Map<String,Object> data = new HashMap<String,Object>();
		System.out.println("aerh");
		
		data.put("weight", weight);
		data.put("match", match);
		data.put("leve", level);
		
		
		
		Gson gson = new Gson();
		String jsonData = gson.toJson(data);
		return jsonData;
	}

	// 가중치 값을 세팅하고 가져오는 함수

	// 매칭 비율을 가져오는 셋팅하고 가져오는 함수

	// 준비수준 기준치를 가져오는 함수

}
