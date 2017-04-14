package org.framestudy.spring_mybatis.relationmag.dao;

import java.util.List;

import org.framestudy.spring_mybatis.relationmag.beans.Games;

public interface IGameDao {
	
	/**
	 * 查询所有的游戏
	 * @return
	 */
	public List<Games> getAllGames();
}
