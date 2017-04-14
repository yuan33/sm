package org.framestudy.spring_mybatis.relationmag.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Games;
import org.framestudy.spring_mybatis.relationmag.dao.IGameDao;
import org.framestudy.spring_mybatis.relationmag.mapper.GameMapper;
import org.springframework.stereotype.Repository;

@Repository
public class GameDaoImpl implements IGameDao {

	@Resource
	private GameMapper gm;
	
	@Override
	public List<Games> getAllGames() {
		// TODO Auto-generated method stub
		return gm.getAllGames();
	}

}
