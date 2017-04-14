package org.framestudy.spring_mybatis.relationmag.dao.impl;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Classes;
import org.framestudy.spring_mybatis.relationmag.dao.IClassDao;
import org.framestudy.spring_mybatis.relationmag.mapper.ClassMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ClassDaoImpl implements IClassDao {

	@Resource
	private ClassMapper cm;
	
	@Override
	public Classes getClassesWithStusByClassId(Long id) {
		// TODO Auto-generated method stub
		return cm.getClassesWithStusByClassId(id);
	}

}
