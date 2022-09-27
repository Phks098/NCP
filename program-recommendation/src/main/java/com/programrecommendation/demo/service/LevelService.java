package com.programrecommendation.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programrecommendation.demo.mapper.LevelMapper;
import com.programrecommendation.demo.model.Diagnosis_criteria_VO;

@Service
public class LevelService {
	@Autowired
	LevelMapper mapper;
	
	public List<Diagnosis_criteria_VO> getLevel(){
		return mapper.getLevel();
	}
}
