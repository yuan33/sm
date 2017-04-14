//package org.framestudy.spring_mybatis.test.usermag;
//
//import org.apache.ibatis.session.SqlSession;
//import org.framestudy.spring_mybatis.usermag.beans.UserInfo;
//import org.framestudy.spring_mybatis.usermag.mapper.UserMapper;
//import org.framestudy.spring_mybatis.utils.SessionUtils;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
//public class TestSessionCache {
//
//	@Test
//	public void testGetSessionCache(){
//		
//		SqlSession session = SessionUtils.getSession();
//		UserMapper um = session.getMapper(UserMapper.class);
//		
//		
//		UserInfo user = um.getUserInfoById(8l);
//		System.out.println(user);
//		
//		UserInfo user2 = um.getUserInfoById(8l);
//		
//		System.out.println(user2);
//		
//		
//		
//		
//	}
//	
//}
