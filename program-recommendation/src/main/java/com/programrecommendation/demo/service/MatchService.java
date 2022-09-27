package com.programrecommendation.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programrecommendation.demo.mapper.MatchMapper;
import com.programrecommendation.demo.model.Matching_criteria_VO;

@Service
public class MatchService {
	@Autowired
	public MatchMapper mapper;
	
	public List<Matching_criteria_VO> getMatch(){
		return mapper.getMatch();
	}
	

}
