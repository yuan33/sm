package org.framestudy.spring_mybatis.relationmag.service;

import java.util.List;

import org.framestudy.spring_mybatis.relationmag.beans.Games;
import org.framestudy.spring_mybatis.relationmag.beans.Player;

public interface IPlayerService {
	
	/**
	 * 根据ID查询玩家
	 * @param id
	 * @return
	 */
	public Player getPlayerById(Long id);
	
	
	/**
	 * 玩家选择多个游戏
	 * @param player
	 * @param games
	 * @return
	 */
	public int playerChoiceGames(Player player,List<Games> games);
	/**
	 * 根据玩家名称查询玩家，并查询游戏结果
	 * @param name
	 * @return
	 */
	public List<Player> getPlayerWithGamesByPlayerName(String name);
	
	
	
	
	
	
}
