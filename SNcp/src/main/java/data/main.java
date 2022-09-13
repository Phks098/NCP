package data;

import java.util.List;

import data.dao.Professor_Student_DAO;
import data.vo.Student_VO;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor_Student_DAO dao = new Professor_Student_DAO();
		List<Student_VO> list = dao.getStudent("10008","");
		
		for(Student_VO std:list) {
			System.out.println(std.toString());
		}
	}

}
