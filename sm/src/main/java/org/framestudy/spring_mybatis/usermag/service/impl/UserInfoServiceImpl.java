package org.framestudy.spring_mybatis.usermag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.pojos.Pager;
import org.framestudy.spring_mybatis.usermag.beans.UserInfo;
import org.framestudy.spring_mybatis.usermag.dao.IUserDao;
import org.framestudy.spring_mybatis.usermag.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
@Service
public class UserInfoServiceImpl implements IUserService {

	@Resource
	private IUserDao userDaoImpl;
	
	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int saveUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		int rows = userDaoImpl.saveUserInfo(user);
		Integer.valueOf("adb");
		return rows;
	}
	
	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int updateUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return userDaoImpl.updateUserInfo(user);
	}

	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int deleteUserInfo(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.deleteUserInfo(id);
	}

	public UserInfo getUserInfoById(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserInfoById(id);
	}

	public UserInfo getUserByLoginNameAndPwd(String loginName, String pwd) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserByLoginNameAndPwd(loginName, pwd);
	}

	public List<UserInfo> queryUserListByMap(Map map) {
		// TODO Auto-generated method stub
		return userDaoImpl.queryUserListByMap(map);
	}
	
	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int batchSaveUserInfo(List<UserInfo> user) {
		// TODO Auto-generated method stub
		return userDaoImpl.batchSaveUserInfo(user);
	}

	@Transactional(readOnly=false,isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int batchDeleteUserInfo(List<UserInfo> user) {
		// TODO Auto-generated method stub
		return userDaoImpl.batchDeleteUserInfo(user);
	}

	@Override
	public Pager getUserListByMapToPager(Map map) {
		// TODO Auto-generated method stub
		int totalRows = userDaoImpl.countUserListByMapToPager(map);
		List<?> datas = userDaoImpl.getUserListByMapToPager(map);
		int page = (int) map.get("page");
		int rows = (int) map.get("rows");
		return new Pager(page,rows,totalRows,datas);
	}

}
