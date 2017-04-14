package org.framestudy.spring_mybatis.relationmag.beans;

import java.io.Serializable;

public class Pet implements Serializable {

	private Long id;
	
	private String name;

	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pet(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
