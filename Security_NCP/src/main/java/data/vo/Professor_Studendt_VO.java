package data.vo;

import java.util.List;

import data.dao.Professor_Student_DAO;

public class Professor_Studendt_VO {
	
	Student_VO student;
	List<Professor_Student_DAO> level;
	
	
	
	public Professor_Studendt_VO() {
		super();
	}

	public Professor_Studendt_VO(Student_VO student, List<Professor_Student_DAO> level) {
		super();
		this.student = student;
		this.level = level;
	}

	public Student_VO getStudent() {
		return student;
	}

	public void setStudent(Student_VO student) {
		this.student = student;
	}

	public List<Professor_Student_DAO> getLevel() {
		return level;
	}

	public void setLevel(List<Professor_Student_DAO> level) {
		this.level = level;
	}
	
	
	@Override
	public String toString() {
		return "Professor_Studendt_VO [student=" + student + ", level=" + level + "]";
	}
}
