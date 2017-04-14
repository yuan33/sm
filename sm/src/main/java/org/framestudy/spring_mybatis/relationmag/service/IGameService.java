package org.framestudy.spring_mybatis.relationmag.service;

import java.util.List;

import org.framestudy.spring_mybatis.relationmag.beans.Games;

public interface IGameService {
	
	/**
	 * 查询所有的游戏
	 * @return
	 */
	public List<Games> getAllGames();
}
