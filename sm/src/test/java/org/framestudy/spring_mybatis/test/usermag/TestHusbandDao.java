package org.framestudy.spring_mybatis.test.usermag;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Husband;
import org.framestudy.spring_mybatis.relationmag.beans.Wife;
import org.framestudy.spring_mybatis.relationmag.dao.IHusbandDao;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestHusbandDao {

	@Resource
	private IHusbandDao husbandDaoImpl;
	
	
	@Ignore
	public void testDeleteHusbandWithWifeByHusbandId(){
		husbandDaoImpl.deleteHusbandWithWifeByHusbandId(1l);
	}
	
	@Ignore
	public void testGetHusbandWithWifeByHusbandId(){
		Husband hus = husbandDaoImpl.getHusbandWithWifeByHusbandId(1l);
		System.out.println(hus);
	}
	
	@Test
	public void testMarry(){
		Wife wife = new Wife(null, "老马", null);
		Husband hus = new Husband(null, "文章", wife);
		husbandDaoImpl.marry(hus);
	}
	
	
	
}
