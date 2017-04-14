package org.framestudy.spring_mybatis.relationmag.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.framestudy.spring_mybatis.relationmag.beans.Husband;

public interface HusbandMapper {

	/**
	 * 男女结婚
	 * 
	 * @param hus
	 * @return
	 */

	@Insert(value = { "insert into t_hus (hus_name) values (#{hus.name});",
			"insert into t_wife (wife_name,fk_hus_id) values (#{hus.wife.name},(select id from t_hus where hus_name = #{hus.name}))" })
	//	@Options() //Options中可以设置每个标签的属性
	public int marry(@Param("hus") Husband hus);

	/**
	 * 根据丈夫的ID查询丈夫以及妻子
	 * 
	 * @param id
	 * @return
	 */
	
	
	@Select(value="select h.id as hId,h.hus_name as hName,w.id as wId,w.wife_name as wName from t_hus as h left join t_wife as w on h.id = w.fk_hus_id where h.id = #{id}")
//	@ResultMap("husMap")
	@Results({
		@Result(id=true,property="id",column="hId",javaType=Long.class),
		@Result(property="name",column="hName",javaType=String.class),
		@Result(property="wife.id",column="wId",javaType=Long.class),
		@Result(property="wife.name",column="wName",javaType=String.class)
	})
	public Husband getHusbandWithWifeByHusbandId(Long id);

	/**
	 * 根据丈夫的ID删除丈夫与妻子
	 * 
	 * @param id
	 * @return
	 */
	@Delete(value={"delete from t_wife where fk_hus_id = #{id};","delete from t_hus where id = #{id}"})
	public int deleteHusbandWithWifeByHusbandId(Long id);

	
	@Select(value="select id as id,hus_name as name from t_hus where id = #{id}")
	@ResultType(Husband.class)
	public Husband getHusbandByFkHusId(Long id);
	
	
	
	
}
