package org.framestudy.spring_mybatis.relationmag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.framestudy.spring_mybatis.relationmag.beans.Dog;
import org.framestudy.spring_mybatis.relationmag.beans.Pet;

public interface PetMapper {
	/**
	 * 保存一只狗
	 * @param dog
	 * @return
	 */
	public int saveDog(@Param("dog")Dog dog);
	/**
	 * 根据ID查询一只狗
	 * @param id
	 * @return
	 */
	public Dog getDogById(Long id);
	/**
	 * 查询所有的宠物
	 * @return
	 */
	public List<Pet> getAllPet();
	
}
