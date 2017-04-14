package org.framestudy.spring_mybatis.relationmag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.framestudy.spring_mybatis.relationmag.beans.Classes;
import org.framestudy.spring_mybatis.relationmag.beans.Students;

public interface ClassMapper {
	/**
	 * 通过班级ID查询班级以及对应的学生
	 * @param id
	 * @return
	 */
	@Select("select * from t_class where id = #{id}")
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="name",column="cls_name",javaType=String.class),
		@Result(property="stus",javaType=List.class,column="id",many=@Many(fetchType=FetchType.LAZY,select="getStudentByClassId"))
	})
	public Classes getClassesWithStusByClassId(Long id);
	
	
	@Select("select id as id,stu_name as name from t_stus where fk_cls_id = #{id}")
	@ResultType(Students.class)
	public List<Students> getStudentByClassId(Long id);
}
