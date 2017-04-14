package org.framestudy.spring_mybatis.relationmag.dao;

import org.framestudy.spring_mybatis.relationmag.beans.Wife;

public interface IWifeDao {
	/**
	 * 根据妻子ID查询妻子与丈夫
	 * @param id
	 * @return
	 */
	public Wife getWifeWithHusbandByWifeId(Long id);
}
