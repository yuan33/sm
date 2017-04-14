package org.framestudy.spring_mybatis.relationmag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.framestudy.spring_mybatis.relationmag.beans.Games;

public interface GameMapper {
	/**
	 * 查询所有的游戏
	 * @return
	 */
	
	@Select("select id as id,game_name as name from t_game")
	@ResultType(Games.class)
	public List<Games> getAllGames();
	
	
	
	@Select("select g.id as id,g.game_name as name from t_game as g left join t_player_game as pg on g.id = pg.fk_game_id where fk_player_id = #{id}")
	@ResultType(Games.class)
	public List<Games> getGamesByPlayerId(Long id);
	
}
