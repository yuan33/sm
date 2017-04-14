package org.framestudy.spring_mybatis.test.usermag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.pojos.Pager;
import org.framestudy.spring_mybatis.usermag.beans.UserInfo;
import org.framestudy.spring_mybatis.usermag.service.IUserService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestUserService {
	
	@Resource
	private IUserService userInfoServiceImpl;
	
	
	/**
	 * 测试分页
	 */
	@Ignore
	public void testGetUserListByMapToPager(){
		int page = 2;
		int rows = 5;
		
		String userName = "小";
		String loginName = "a";
		int index = (page - 1) * rows;
		Map map = new HashMap();
		map.put("page", page);
		map.put("index", index);
		map.put("rows", rows);
		map.put("age", 25);
		
		
		
		map.put("userName", userName);
		map.put("loginName", loginName);
		
		Pager pager = userInfoServiceImpl.getUserListByMapToPager(map);
		System.out.println(pager);
	}
	
	
	@Ignore
	public void testBatchDeleteUserInfo(){
		List<UserInfo> users = new ArrayList<UserInfo>();
		UserInfo user = new UserInfo();
		user.setId(4l);
		UserInfo user2 = new UserInfo();
		user2.setId(7l);
		users.add(user2);
		users.add(user);
		
		int rows = userInfoServiceImpl.batchDeleteUserInfo(users);
		Assert.assertEquals(2, rows);
		
	}
	
	
	
	@Ignore
	public void testBatchSaveUserInfo(){
		List<UserInfo> users = new ArrayList<UserInfo>();
		
		UserInfo user = new UserInfo(null, "小马", "d", "123456", 18);
		try {
			UserInfo user2 = (UserInfo) user.clone();
			user2.setLoginName("e");
			UserInfo user3 = (UserInfo) user.clone();
			user3.setLoginName("f");
			UserInfo user4 = (UserInfo) user.clone();
			user4.setLoginName("g");
			
			users.add(user4);
			users.add(user3);
			users.add(user2);
			users.add(user);
			
			int rows = userInfoServiceImpl.batchSaveUserInfo(users);
			Assert.assertEquals(4, rows);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Ignore
	public void testQueryUserListByMap(){
		Map map = new HashMap();
		map.put("userName", "妹");
		map.put("age", 18);
		List<UserInfo> users = userInfoServiceImpl.queryUserListByMap(map);
		Assert.assertNotNull(users);
		System.out.println(users);
		
	}
	
	@Ignore
	public void testLogin(){
		String name = "a3";
		String pwd = "123456";
		UserInfo user = userInfoServiceImpl.getUserByLoginNameAndPwd(name,pwd);
		Assert.assertNotNull(user);
		System.out.println(user);
	}
	
	@Ignore
	public void testDeleteUserInfo(){
		//删除与修改之前，都需要先查询
		UserInfo user = userInfoServiceImpl.getUserInfoById(3L);
		Assert.assertNotNull(user);
		System.out.println(user);
		
		int rows = userInfoServiceImpl.deleteUserInfo(user.getId());
		Assert.assertEquals(1, rows);
		
	}
	
	@Test
	public void testUpdateUserInfo(){
		UserInfo user = new UserInfo(25L, "长大了", "123456", 18);
		userInfoServiceImpl.updateUserInfo(user);
		
		System.out.println(user);
	}
	
	@Ignore
	public void testSaveUserInfo(){
		UserInfo user = new UserInfo(null, "美女", "123456", 18);
		userInfoServiceImpl.saveUserInfo(user);
		
		System.out.println(user);
	}
}
