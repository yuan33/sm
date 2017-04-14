package org.framestudy.spring_mybatis.relationmag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Games;
import org.framestudy.spring_mybatis.relationmag.beans.Player;
import org.framestudy.spring_mybatis.relationmag.dao.IPlayerDao;
import org.framestudy.spring_mybatis.relationmag.service.IPlayerService;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements IPlayerService {

	@Resource
	private IPlayerDao playerDaoImpl;
	
	
	@Override
	public Player getPlayerById(Long id) {
		// TODO Auto-generated method stub
		return playerDaoImpl.getPlayerById(id);
	}

	@Override
	public int playerChoiceGames(Player player, List<Games> games) {
		// TODO Auto-generated method stub
		return playerDaoImpl.playerChoiceGames(player, games);
	}

	@Override
	public List<Player> getPlayerWithGamesByPlayerName(String name) {
		// TODO Auto-generated method stub
		return playerDaoImpl.getPlayerWithGamesByPlayerName(name);
	}

}
