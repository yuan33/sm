package org.framestudy.spring_mybatis.relationmag.beans;

import java.io.Serializable;

public class Students implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9015831257833397620L;

	private Long id;
	private String name;
	
	private Classes cls;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(Long id, String name, Classes cls) {
		super();
		this.id = id;
		this.name = name;
		this.cls = cls;
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

	public Classes getCls() {
		return cls;
	}

	public void setCls(Classes cls) {
		this.cls = cls;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", cls=" + cls + "]";
	}
}
