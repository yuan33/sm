package org.framestudy.spring_mybatis.relationmag.dao.impl;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Husband;
import org.framestudy.spring_mybatis.relationmag.dao.IHusbandDao;
import org.framestudy.spring_mybatis.relationmag.mapper.HusbandMapper;
import org.springframework.stereotype.Repository;

@Repository
public class HusbandDaoImpl implements IHusbandDao {

	@Resource
	private HusbandMapper hm;
	
	@Override
	public int marry(Husband hus) {
		// TODO Auto-generated method stub
		return hm.marry(hus);
	}

	@Override
	public Husband getHusbandWithWifeByHusbandId(Long id) {
		// TODO Auto-generated method stub
		return hm.getHusbandWithWifeByHusbandId(id);
	}

	@Override
	public int deleteHusbandWithWifeByHusbandId(Long id) {
		// TODO Auto-generated method stub
		return hm.deleteHusbandWithWifeByHusbandId(id);
	}

}
