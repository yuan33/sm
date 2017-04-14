package org.framestudy.spring_mybatis.relationmag.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Dog;
import org.framestudy.spring_mybatis.relationmag.beans.Pet;
import org.framestudy.spring_mybatis.relationmag.dao.IPetDao;
import org.framestudy.spring_mybatis.relationmag.mapper.PetMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PetDaoImpl implements IPetDao {

	@Resource
	private PetMapper pm;
	
	@Override
	public int saveDog(Dog dog) {
		// TODO Auto-generated method stub
		return pm.saveDog(dog);
	}

	@Override
	public Dog getDogById(Long id) {
		// TODO Auto-generated method stub
		return pm.getDogById(id);
	}

	@Override
	public List<Pet> getAllPet() {
		// TODO Auto-generated method stub
		return pm.getAllPet();
	}

}
