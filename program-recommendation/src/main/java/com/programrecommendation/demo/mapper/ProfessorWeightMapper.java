package com.programrecommendation.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.programrecommendation.demo.model.Professor_weight_VO;

@Mapper
public interface ProfessorWeightMapper {
	
	public List<Professor_weight_VO> getWeight();
	

}
