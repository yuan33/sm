package org.framestudy.spring_mybatis.test.usermag;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Games;
import org.framestudy.spring_mybatis.relationmag.beans.Player;
import org.framestudy.spring_mybatis.relationmag.dao.IGameDao;
import org.framestudy.spring_mybatis.relationmag.dao.IPlayerDao;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestPlayerDao {

	@Resource
	private IPlayerDao playerDaoImpl;
	@Resource
	private IGameDao gameDaoImpl;
	
	@Test
	public void testGetPlayerWithGamesByPlayerName(){
		List<Player> players = playerDaoImpl.getPlayerWithGamesByPlayerName("小");
		for (Player player : players) {
			System.out.println(player.getName());
			System.out.println(player.getGames());
		}
	}
	
	@Ignore
	public void testPlayerChoiceGames(){
		Player player = playerDaoImpl.getPlayerById(2l);
		Assert.assertNotNull(player);
		List<Games> games = gameDaoImpl.getAllGames();
		Assert.assertNotNull(games);
		playerDaoImpl.playerChoiceGames(player, games);
	}
	
	
	
	
	
}
