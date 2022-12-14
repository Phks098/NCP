package com.programrecommendation.demo.model;

public class Matching_criteria_VO {
	int capability_number;
	int category_number;
	float matching_rate;
		
	public Matching_criteria_VO(int capability_number, int category_number, float matching_rate) {
		super();
		this.capability_number = capability_number;
		this.category_number = category_number;
		this.matching_rate = matching_rate;
	}

	public Matching_criteria_VO() {
		super();
	}

	public int getCapability_number() {
		return capability_number;
	}
	
	public void setCapability_number(int capability_number) {
		this.capability_number = capability_number;
	}
	
	public int getCategory_number() {
		return category_number;
	}
	
	public void setCategory_number(int category_number) {
		this.category_number = category_number;
	}
	
	public float getMatching_rate() {
		return matching_rate;
	}
	
	public void setMatching_rate(float matching_rate) {
		this.matching_rate = matching_rate;
	}

	@Override
	public String toString() {
		return "Matching_criteria_VO [capability_number=" + capability_number + ", category_number=" + category_number
				+ ", matching_rate=" + matching_rate + "]";
	}


}
