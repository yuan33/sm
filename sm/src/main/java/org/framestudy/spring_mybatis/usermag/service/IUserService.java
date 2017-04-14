package org.framestudy.spring_mybatis.usermag.service;

import java.util.List;
import java.util.Map;

import org.framestudy.spring_mybatis.pojos.Pager;
import org.framestudy.spring_mybatis.usermag.beans.UserInfo;

public interface IUserService {
	
	
	
	
	
	/**
	 * 根据多参数完成分页查询
	 * @param map
	 * @return
	 */
	public Pager getUserListByMapToPager(Map map);
	
	/**
	 * 批量删除用户
	 * @param user
	 * @return
	 */
	public int batchDeleteUserInfo(List<UserInfo> user);
	
	/**
	 * 批量新增用户
	 * @param user
	 * @return
	 */
	public int batchSaveUserInfo(List<UserInfo> user);
	
	/**
	 * 多参数传递的方式：map
	 * @param map
	 * @return
	 */
	public List<UserInfo> queryUserListByMap(Map map);
	
	/**
	 * 
	 * @param loginName
	 * @param pwd
	 * @return
	 */
	public UserInfo getUserByLoginNameAndPwd(String loginName,String pwd);
	
	/**
	 * 多参数传递的方式：对象
	 * 保存用户
	 * @param user
	 * @return
	 */
	public int saveUserInfo(UserInfo user);
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public int updateUserInfo(UserInfo user);
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public int deleteUserInfo(Long id);
	
	/**
	 * 根据ID查询用户
	 * @param id
	 * @return
	 */
	public UserInfo getUserInfoById(Long id);
}
