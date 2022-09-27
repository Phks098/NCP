package com.programrecommendation.demo.model;



import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder @Data
public class SalaryModel {
	
	
	private int id;
	
	@NonNull @Builder.Default private String name = "NULL NAME";
	private String email;
	public SalaryModel(int id, @NonNull String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public SalaryModel() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
