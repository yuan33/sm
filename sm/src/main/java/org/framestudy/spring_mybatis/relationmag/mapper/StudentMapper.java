package org.framestudy.spring_mybatis.relationmag.mapper;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.framestudy.spring_mybatis.relationmag.beans.Classes;
import org.framestudy.spring_mybatis.relationmag.beans.Students;

public interface StudentMapper {
	/**
	 * 根据学生的ID查询学生以及班级
	 * @param id
	 * @return
	 */
	
	@Select("select * from t_stus where id = #{id}")
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="name",column="stu_name",javaType=String.class),
		@Result(property="cls",javaType=Classes.class,column="fk_cls_id",one=@One(fetchType=FetchType.LAZY,select="getClassById"))
	})
	public Students getStudentWithClassByStudentId(Long id);
	
	
	@Select("select id as id,cls_name as name from t_class where id = #{id}")
	@ResultType(Classes.class)
	public Classes getClassById(Long id);
	
	
	
}
