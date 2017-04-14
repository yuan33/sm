package org.framestudy.spring_mybatis.relationmag.service.impl;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Classes;
import org.framestudy.spring_mybatis.relationmag.dao.IClassDao;
import org.framestudy.spring_mybatis.relationmag.service.IClassService;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl implements IClassService {

	@Resource
	private IClassDao classDaoImpl;
	
	@Override
	public Classes getClassesWithStusByClassId(Long id) {
		// TODO Auto-generated method stub
		return classDaoImpl.getClassesWithStusByClassId(id);
	}

}
