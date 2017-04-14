package org.framestudy.spring_mybatis.test.usermag;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Students;
import org.framestudy.spring_mybatis.relationmag.dao.IStudentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestStudentDao {

	@Resource
	private IStudentDao studentDaoImpl;
	
	@Test
	public void testGetStudentWithClassByStudentId(){
		Students stu = studentDaoImpl.getStudentWithClassByStudentId(1l);
		System.out.println(stu.getName());
		System.out.println(stu.getCls());
	}
	
}
