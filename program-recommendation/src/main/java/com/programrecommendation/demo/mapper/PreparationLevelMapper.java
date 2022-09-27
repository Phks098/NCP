package com.programrecommendation.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.programrecommendation.demo.model.Preparation_Level_VO;

@Repository
@Mapper
public interface PreparationLevelMapper {
	List<Preparation_Level_VO> getPreparation(String university_number);
	//201610767
}
