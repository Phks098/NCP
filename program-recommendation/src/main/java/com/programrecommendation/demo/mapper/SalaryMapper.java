package com.programrecommendation.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.programrecommendation.demo.model.SalaryModel;

@Repository
@Mapper
public interface SalaryMapper {
	
	List<SalaryModel> getAllSalary();
	
	SalaryModel getSalary(@Param("id") String id);
}
