package org.framestudy.spring_mybatis.relationmag.beans;

public class Dog extends Pet {

	private int bone;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(Long id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public int getBone() {
		return bone;
	}

	public void setBone(int bone) {
		this.bone = bone;
	}

	@Override
	public String toString() {
		return "Dog [id=" + getId() + ", name=" + getName() + ", bone=" + bone + "]";
	}
	
	
}
