package org.framestudy.spring_mybatis.relationmag.beans;

import java.io.Serializable;
import java.util.List;

public class Player implements Serializable {

	private Long id;
	private String name;
	
	private List<Games> games;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(Long id, String name, List<Games> games) {
		super();
		this.id = id;
		this.name = name;
		this.games = games;
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

	public List<Games> getGames() {
		return games;
	}

	public void setGames(List<Games> games) {
		this.games = games;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", games=" + games + "]";
	}
}
