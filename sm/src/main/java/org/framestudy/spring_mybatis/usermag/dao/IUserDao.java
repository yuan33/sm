package org.framestudy.spring_mybatis.usermag.dao;

import java.util.List;
import java.util.Map;

import org.framestudy.spring_mybatis.usermag.beans.UserInfo;

public interface IUserDao {
	
	
	/**
	 * 统计满足条件的总条数
	 * @param map
	 * @return
	 */
	public int countUserListByMapToPager(Map map);
	/**
	 * 查询满足条件的所有数据
	 * @param map
	 * @return
	 */
	public List<?> getUserListByMapToPager(Map map);
	
	/**
	 * 批量删除
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
