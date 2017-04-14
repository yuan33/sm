package org.framestudy.spring_mybatis.relationmag.beans;

import java.io.Serializable;
import java.util.List;

public class Games implements Serializable {

	private Long id;
	private String name;
	
	private List<Player> players;

	public Games() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Games(Long id, String name, List<Player> players) {
		super();
		this.id = id;
		this.name = name;
		this.players = players;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Games [id=" + id + ", name=" + name + ", players=" + players + "]";
	}
	
	
}
