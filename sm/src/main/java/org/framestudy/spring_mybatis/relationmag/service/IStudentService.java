package org.framestudy.spring_mybatis.relationmag.service;

import org.framestudy.spring_mybatis.relationmag.beans.Students;

public interface IStudentService {
	/**
	 * 根据学生的ID查询学生以及班级
	 * @param id
	 * @return
	 */
	public Students getStudentWithClassByStudentId(Long id);
}
