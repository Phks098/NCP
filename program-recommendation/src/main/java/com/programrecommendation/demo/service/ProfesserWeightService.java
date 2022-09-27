package com.programrecommendation.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programrecommendation.demo.mapper.ProfessorWeightMapper;
import com.programrecommendation.demo.model.Professor_weight_VO;

@Service
public class ProfesserWeightService {
	@Autowired
	public ProfessorWeightMapper weight;
	 
	public List<Professor_weight_VO> getWeight(){
		return weight.getWeight();
	}

}
