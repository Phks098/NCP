package com.programrecommendation.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.programrecommendation.demo.model.Student_VO;

@Repository
@Mapper
public interface StudentMapper {

	List<Student_VO> searchStudent(@Param("professer") String professer, @Param("keyword") String keyword);

	Student_VO getStudent(@Param("university_number") String university_number);

}
