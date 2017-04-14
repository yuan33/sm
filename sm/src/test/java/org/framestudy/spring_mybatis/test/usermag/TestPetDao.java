package org.framestudy.spring_mybatis.test.usermag;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Dog;
import org.framestudy.spring_mybatis.relationmag.beans.Pet;
import org.framestudy.spring_mybatis.relationmag.dao.IPetDao;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestPetDao {

	@Resource
	private IPetDao petDaoImpl;
	
	
	@Test
	public void getAllPet(){
		List<Pet> pets = petDaoImpl.getAllPet();
		System.out.println(pets);
	}
	
	
	@Ignore
	public void getDogById(){
		
		Dog dog = petDaoImpl.getDogById(1l);
		Assert.assertNotNull(dog);
		System.out.println(dog);
	}
	
	@Ignore
	public void saveDog(){
		Dog dog = new Dog(null, "小黄");
		dog.setBone(10);
		petDaoImpl.saveDog(dog);
		
		
	}
	
	
	
	
	
	
}
