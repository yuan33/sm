package org.framestudy.spring_mybatis.relationmag.service.impl;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Students;
import org.framestudy.spring_mybatis.relationmag.dao.IStudentDao;
import org.framestudy.spring_mybatis.relationmag.service.IStudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

	@Resource
	private IStudentDao studentDaoImpl;
	
	@Override
	public Students getStudentWithClassByStudentId(Long id) {
		// TODO Auto-generated method stub
		return studentDaoImpl.getStudentWithClassByStudentId(id);
	}

}
