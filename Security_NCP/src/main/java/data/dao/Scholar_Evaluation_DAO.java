package data.dao;

import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import data.vo.Professor_career_evaluation_VO;
import data.vo.Student_Code_VO;
import data.vo.Student_VO;

public class Scholar_Evaluation_DAO {

	private static SqlSessionFactory sqlMapper = null;

	private static SqlSessionFactory getInstance() {
		if (sqlMapper == null) {
			try {
				String resource = "data/mybatis/SqlMapConfig.xml";
				Reader reader = Resources.getResourceAsReader(resource);
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sqlMapper;
	}

	public static ArrayList<Student_VO> getStuduent_AllList(String professor) {

		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();

		List<Student_VO> list = new ArrayList<Student_VO>();

		list = session.selectList("mapper.student.selectAll_pro", professor);

		return (ArrayList<Student_VO>) list;
	}

	private Connection getConnection() throws Exception {

		String url = "jdbc:mysql://localhost:3306/ncp";
		String id = "root";
		String pw = "1234";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, id, pw);
		return con;

	}

//	public void SetEvaluation(ArrayList list, String univertion_number) {
//
//		String sql = null;
//
//		try {
//			Connection con = getConnection();
//			Statement stmt = con.createStatement();
//			for (int i = 0; i < list.size(); i++) {
//				sql = "update Professor_Career_Evaluation set " + "evaluation_grade = " + list.get(i)
//						+ " where test_category = " + (i + 1) + " and university_number = '" + univertion_number + "'";
//				stmt.executeUpdate(sql);
//			}
//
//			stmt.close();
//			con.close();
//
//		} catch (Exception e) {
//
//		}
//	}


	public static  void  SetEvaluation(ArrayList<String> list, String univertion_number) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();

	
		if (session.selectList("mapper.scholar.select",univertion_number) == null) {
			insertCareer_Evaluation(univertion_number, list);
		}

		else {
			deleteCareer_Evaluation(univertion_number);
			insertCareer_Evaluation(univertion_number, list);
		}

	}


	public static void deleteCareer_Evaluation(String student) {

		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();

		session.delete("mapper.scholar.delete",student);
		session.commit();

	}

	public static void insertCareer_Evaluation(String student,ArrayList<String> checkList) {
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		
		
		Student_Code_VO code = new Student_Code_VO();
		Student_DAO da = new Student_DAO();
		code = da.getStdent_Code(student);
		
		
		List<Professor_career_evaluation_VO> list = new ArrayList<>();
		
		
		for(int i = 0; i<checkList.size(); i++) {
			list.add(new Professor_career_evaluation_VO(code.getUniversity_number(),(i+1),Integer.parseInt(checkList.get(i)),code.getProfessor_number(),"now()"));
		}
		
		
		Map<String,Object> map = new HashMap<>();
		map.put("list", list);
		
		session.insert("mapper.scholar.insert_Evaluation",map);
		session.commit();
		
		
		
	}

}
