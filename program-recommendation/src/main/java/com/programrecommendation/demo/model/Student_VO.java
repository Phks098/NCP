package com.programrecommendation.demo.model;

public class Student_VO {
	private String student_number;
	private String student_name;
	private String major_name;
	private String grade_name;
	private String professor_name;
	private String sex_name;
	public Student_VO() {
		super();
	}
	public Student_VO(String student_number, String student_name, String major_name, String grade_name,
			String professor_name, String sex_name) {
		super();
		this.student_number = student_number;
		this.student_name = student_name;
		this.major_name = major_name;
		this.grade_name = grade_name;
		this.professor_name = professor_name;
		this.sex_name = sex_name;
	}
	public String getStudent_number() {
		return student_number;
	}
	public void setStudent_number(String student_number) {
		this.student_number = student_number;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getMajor_name() {
		return major_name;
	}
	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}
	public String getGrade_name() {
		return grade_name;
	}
	public void setGrade_name(String grade_name) {
		this.grade_name = grade_name;
	}
	public String getProfessor_name() {
		return professor_name;
	}
	public void setProfessor_name(String professor_name) {
		this.professor_name = professor_name;
	}
	public String getSex_name() {
		return sex_name;
	}
	public void setSex_name(String sex_name) {
		this.sex_name = sex_name;
	}
	
	


	

}
