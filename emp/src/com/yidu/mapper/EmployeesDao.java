package com.yidu.mapper;

import com.yidu.pojo.Employees;

/**
 * 接口
 *
 * @author 罗伟平
 * @2019年1月4日
 * @下午6:39:32
 * @version 1.0
 */
public interface EmployeesDao {
	/**
	 * 
	 * @param employeesId
	 * @return 返回employees表的id
	 */
	public Employees queryEmployessById(int employeeId);
	public void addEmployess(Employees employees);
}
