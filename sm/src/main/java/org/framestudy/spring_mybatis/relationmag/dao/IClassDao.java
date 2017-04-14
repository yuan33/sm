package org.framestudy.spring_mybatis.relationmag.dao;

import org.framestudy.spring_mybatis.relationmag.beans.Classes;

public interface IClassDao {
	/**
	 * 通过班级ID查询班级以及对应的学生
	 * @param id
	 * @return
	 */
	public Classes getClassesWithStusByClassId(Long id);
	
	
	
	
	
	
	
	
	
	
}
