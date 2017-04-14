package org.framestudy.spring_mybatis.relationmag.beans;

public class Cat extends Pet {

	private int fish;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(Long id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public int getFish() {
		return fish;
	}

	public void setFish(int fish) {
		this.fish = fish;
	}

	@Override
	public String toString() {
		return "Cat [id=" + getId() + ", name=" + getName() + ", fish=" + fish + "]";
	}
	
	
}
