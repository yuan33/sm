package org.framestudy.spring_mybatis.relationmag.dao.impl;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.relationmag.beans.Wife;
import org.framestudy.spring_mybatis.relationmag.dao.IWifeDao;
import org.framestudy.spring_mybatis.relationmag.mapper.WifeMapper;
import org.springframework.stereotype.Repository;

@Repository
public class WifeDaoImpl implements IWifeDao {

	@Resource
	private WifeMapper wm;
	
	@Override
	public Wife getWifeWithHusbandByWifeId(Long id) {
		// TODO Auto-generated method stub
		return wm.getWifeWithHusbandByWifeId(id);
	}

}
