package org.framestudy.spring_mybatis.test.usermag;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Classes;
import org.framestudy.spring_mybatis.relationmag.dao.IClassDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestClassDao {

	@Resource
	private IClassDao classDaoImpl;
	
	@Test
	public void testGetClassWithStudentByClassId(){
		
		Classes cls = classDaoImpl.getClassesWithStusByClassId(1l);
		System.out.println(cls.getName());
		System.out.println(cls.getStus());
	}
	
	
	
}
