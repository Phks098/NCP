package com.programrecommendation.demo.model;

public class Preparation_Level_VO {
	private String university_number;
	private String capability_name;
	private String category_score;
	private String preparation_degree;
	private String preparation_level;
	private String preparation_rank;

	public Preparation_Level_VO(String university_number, String capability_name, String category_score,
			String preparation_degree, String preparation_level, String preparation_rank) {
		super();
		this.university_number = university_number;
		this.capability_name = capability_name;
		this.category_score = category_score;
		this.preparation_degree = preparation_degree;
		this.preparation_level = preparation_level;
		this.preparation_rank = preparation_rank;
	}

	public Preparation_Level_VO() {
		super();
	}

	public String getUniversity_number() {
		return university_number;
	}

	public void setUniversity_number(String university_number) {
		this.university_number = university_number;
	}

	public String getCapability_name() {
		return capability_name;
	}

	public void setCapability_name(String capability_name) {
		this.capability_name = capability_name;
	}

	public String getCategory_score() {
		return category_score;
	}

	public void setCategory_score(String category_score) {
		this.category_score = category_score;
	}

	public String getPreparation_degree() {
		return preparation_degree;
	}

	public void setPreparation_degree(String preparation_degree) {
		this.preparation_degree = preparation_degree;
	}

	public String getPreparation_level() {
		return preparation_level;
	}

	public void setPreparation_level(String preparation_level) {
		this.preparation_level = preparation_level;
	}

	public String getPreparation_rank() {
		return preparation_rank;
	}

	public void setPreparation_rank(String preparation_rank) {
		this.preparation_rank = preparation_rank;
	}

	@Override
	public String toString() {
		return "Preparation_Level_VO [university_number=" + university_number + ", capability_name=" + capability_name
				+ ", category_score=" + category_score + ", preparation_degree=" + preparation_degree
				+ ", preparation_level=" + preparation_level + ", preparation_rank=" + preparation_rank + "]";
	}

}
