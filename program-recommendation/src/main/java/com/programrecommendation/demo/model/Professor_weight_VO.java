package com.programrecommendation.demo.model;

public class Professor_weight_VO {
	
	String evaluation_grade;
	String weight;
	public String getEvaluation_grade() {
		return evaluation_grade;
	}
	public void setEvaluation_grade(String evaluation_grade) {
		this.evaluation_grade = evaluation_grade;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public Professor_weight_VO(String evaluation_grade, String weight) {
		super();
		this.evaluation_grade = evaluation_grade;
		this.weight = weight;
	}
	public Professor_weight_VO() {
		super();
	}
	
	
	
	
}
