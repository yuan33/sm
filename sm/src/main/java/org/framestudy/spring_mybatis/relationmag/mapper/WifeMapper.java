package org.framestudy.spring_mybatis.relationmag.mapper;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.framestudy.spring_mybatis.relationmag.beans.Husband;
import org.framestudy.spring_mybatis.relationmag.beans.Wife;

public interface WifeMapper {
	
	
	/**
	 * 根据妻子ID查询妻子与丈夫
	 * @param id
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="name",column="wife_name",javaType=String.class),
		@Result(property="hus",javaType=Husband.class,column="fk_hus_id",one=@One(fetchType=FetchType.LAZY,select="org.framestudy.spring_mybatis.relationmag.mapper.HusbandMapper.getHusbandByFkHusId"))
	})
	@Select("select * from t_wife where id = #{id}")
	public Wife getWifeWithHusbandByWifeId(Long id);
	
}
