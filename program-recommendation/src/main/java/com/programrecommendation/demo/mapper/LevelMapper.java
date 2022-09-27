package com.programrecommendation.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.programrecommendation.demo.model.Diagnosis_criteria_VO;

@Mapper
public interface LevelMapper {

	List<Diagnosis_criteria_VO> getLevel();

}
