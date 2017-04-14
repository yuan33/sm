package org.framestudy.spring_mybatis.relationmag.dao.impl;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Students;
import org.framestudy.spring_mybatis.relationmag.dao.IStudentDao;
import org.framestudy.spring_mybatis.relationmag.mapper.StudentMapper;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Resource
	private StudentMapper sm;
	
	@Override
	public Students getStudentWithClassByStudentId(Long id) {
		// TODO Auto-generated method stub
		return sm.getStudentWithClassByStudentId(id);
	}

}
