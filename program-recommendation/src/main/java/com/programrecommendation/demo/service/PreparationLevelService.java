package com.programrecommendation.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programrecommendation.demo.mapper.PreparationLevelMapper;
import com.programrecommendation.demo.model.Preparation_Level_VO;

@Service
public class PreparationLevelService {
	@Autowired
	public PreparationLevelMapper mapper;
	
	public List<Preparation_Level_VO> getPreparationLevel(String university_number) {
		return mapper.getPreparation("201610767");
	}

}
