package org.framestudy.spring_mybatis.relationmag.service.impl;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Husband;
import org.framestudy.spring_mybatis.relationmag.dao.IHusbandDao;
import org.framestudy.spring_mybatis.relationmag.service.IHusbandService;
import org.springframework.stereotype.Service;

@Service
public class HusbandServiceImpl implements IHusbandService {
	
	@Resource
	private IHusbandDao husbandDaoImpl;
	
	@Override
	public int marry(Husband hus) {
		// TODO Auto-generated method stub
		return husbandDaoImpl.marry(hus);
	}

	@Override
	public Husband getHusbandWithWifeByHusbandId(Long id) {
		// TODO Auto-generated method stub
		return husbandDaoImpl.getHusbandWithWifeByHusbandId(id);
	}

	@Override
	public int deleteHusbandWithWifeByHusbandId(Long id) {
		// TODO Auto-generated method stub
		return husbandDaoImpl.deleteHusbandWithWifeByHusbandId(id);
	}

}
