package com.programrecommendation.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.programrecommendation.demo.model.Matching_criteria_VO;

@Mapper
public interface MatchMapper {
	List<Matching_criteria_VO> getMatch();
}
