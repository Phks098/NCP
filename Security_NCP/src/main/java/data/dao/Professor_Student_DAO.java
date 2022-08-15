package data.dao;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import data.vo.Mypage_VO;
import data.vo.Student_VO;

public class Professor_Student_DAO {
		
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
	
	public static List<Mypage_VO> getStudent_LevelAll(String professor) {
		List<Mypage_VO> list = new ArrayList<Mypage_VO>();
		
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		list = session.selectList("mapper.mypage.selectProfessor", professor);
	
		return  list;
	}
	
	public static List<Student_VO> getStudent(String professor){
		List<Student_VO> list = new ArrayList<Student_VO>();
		
		sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		list = session.selectList("mapper.student.selectAll_pro", professor);
		
		
		return list;
	}
}
