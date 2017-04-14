package org.framestudy.spring_mybatis.relationmag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.framestudy.spring_mybatis.relationmag.beans.Games;
import org.framestudy.spring_mybatis.relationmag.beans.Player;

public interface PlayerMapper {
	/**
	 * 根据ID查询玩家
	 * @param id
	 * @return
	 */
	
	
	@Select("select id as id,player_name as name from t_player where id = #{id}")
	@ResultType(Player.class)
	public Player getPlayerById(Long id);
	
	
	/**
	 * 玩家选择多个游戏
	 * @param player
	 * @param games
	 * @return
	 */
	public int playerChoiceGames(@Param("player")Player player,@Param("games")List<Games> games);
	
	/**
	 * 根据玩家名称查询玩家，并查询游戏结果
	 * @param name
	 * @return
	 */
	
	@Select("select * from t_player where player_name like CONCAT(#{name},'%')")
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="name",column="player_name",javaType=String.class),
		@Result(property="games",javaType=List.class,column="id",many=@Many(fetchType=FetchType.LAZY,select="org.framestudy.spring_mybatis.relationmag.mapper.GameMapper.getGamesByPlayerId"))
	})
	public List<Player> getPlayerWithGamesByPlayerName(@Param("name")String name);
	
}
