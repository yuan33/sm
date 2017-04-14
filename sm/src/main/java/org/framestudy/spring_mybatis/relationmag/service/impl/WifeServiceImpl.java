package org.framestudy.spring_mybatis.relationmag.service.impl;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Wife;
import org.framestudy.spring_mybatis.relationmag.dao.IWifeDao;
import org.framestudy.spring_mybatis.relationmag.service.IWifeService;
import org.springframework.stereotype.Service;

@Service
public class WifeServiceImpl implements IWifeService {

	@Resource
	private IWifeDao wifeDaoImpl;
	
	@Override
	public Wife getWifeWithHusbandByWifeId(Long id) {
		// TODO Auto-generated method stub
		return wifeDaoImpl.getWifeWithHusbandByWifeId(id);
	}

}
