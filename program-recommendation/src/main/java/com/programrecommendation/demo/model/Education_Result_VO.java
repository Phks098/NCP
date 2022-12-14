package com.programrecommendation.demo.model;

public class Education_Result_VO {
	String university_number;
	float result_education;
	boolean result;
	String check_date;

	public String getUniversity_number() {
		return university_number;
	}

	public void setUniversity_number(String university_number) {
		this.university_number = university_number;
	}

	public float getResult_education() {
		return result_education;
	}


	

	public void setResult_education(float result_education) {
		this.result_education = result_education;
	}

	public String isResult() {
		String test ="";
		if(this.result==true) {
			test = "교직";
		}else {
			test="비교직";
		}
		return test;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getCheck_date() {
		return check_date;
	}

	public void setCheck_date(String check_date) {
		this.check_date = check_date;
	}

	public Education_Result_VO(String university_number, float result_education, boolean result, String check_date) {
		super();
		this.university_number = university_number;
		this.result_education = result_education;
		this.result = result;
		this.check_date = check_date;
	}

	public Education_Result_VO() {
		super();
	}

	@Override
	public String toString() {
		return "Education_Result_VO [university_number=" + university_number + ", result_education=" + result_education
				+ ", result=" + result + ", check_date=" + check_date + "]";
	}

}
