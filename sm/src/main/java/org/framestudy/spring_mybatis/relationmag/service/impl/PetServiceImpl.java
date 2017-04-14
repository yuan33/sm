package org.framestudy.spring_mybatis.relationmag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Dog;
import org.framestudy.spring_mybatis.relationmag.beans.Pet;
import org.framestudy.spring_mybatis.relationmag.dao.IPetDao;
import org.framestudy.spring_mybatis.relationmag.service.IPetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements IPetService {

	@Resource
	private IPetDao petDaoImpl;
	
	
	@Override
	public int saveDog(Dog dog) {
		// TODO Auto-generated method stub
		return petDaoImpl.saveDog(dog);
	}

	@Override
	public Dog getDogById(Long id) {
		// TODO Auto-generated method stub
		return petDaoImpl.getDogById(id);
	}

	@Override
	public List<Pet> getAllPet() {
		// TODO Auto-generated method stub
		return petDaoImpl.getAllPet();
	}

}
