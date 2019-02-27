package com.yidu;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import com.yidu.mapper.EmployeesDao;
import com.yidu.pojo.Employees;
import com.yidu.util.DbUtils;
/**
 * 测试类
 *
 * @author 罗伟平
 * @2019年1月4日
 * @下午6:18:26
 * @version 1.0
 */
public class EmployeesTest {
	public static SqlSessionFactory factory;
	@BeforeClass
	static void init() {
		factory = DbUtils.getInstance().getFactory();
	}
	public static void main(String[] args) {
		queryEmployessById();
	}
/**
 * 根据employees的id查询一条数据
 */@Test
	public static void queryEmployessById() {
		SqlSessionFactory factory = DbUtils.getInstance().getFactory();
		try (SqlSession session = factory.openSession();) {
			EmployeesDao mapper = (EmployeesDao) session.getMapper(Employees.class);
			Employees id = mapper.queryEmployessById(100);
			System.out.println(id.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/**
 * 增加一条数据
 */
	public static void addEmployess() {
		SqlSessionFactory factory = DbUtils.getInstance().getFactory();
		try (SqlSession session = factory.openSession();) {
			EmployeesDao mapper = (EmployeesDao) session.getMapper(Employees.class);
			Employees employees = new Employees();
			employees.setEmployeeId(100);
			employees.setFirstName("sded");
			employees.setEmail("swdewfef");
			employees.setHireDate(new Date());
			employees.setJobId("200");
			mapper.addEmployess(employees);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
