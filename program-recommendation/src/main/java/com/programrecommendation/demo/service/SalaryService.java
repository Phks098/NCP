package com.programrecommendation.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programrecommendation.demo.mapper.SalaryMapper;
import com.programrecommendation.demo.model.SalaryModel;

@Service
public class SalaryService {
	
	@Autowired
	public SalaryMapper mapper;
	
	public List<SalaryModel> getAllSalary(){
		return mapper.getAllSalary();
	}
	
	public SalaryModel getSalary(String id) {
		return mapper.getSalary(id);
	}
}
