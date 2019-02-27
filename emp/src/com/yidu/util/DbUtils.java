package com.yidu.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *mybatis单例模式 
 *
 * @author 罗伟平
 * @2019年1月4日
 * @上午10:27:17
 * @version 1.0
 */
public class DbUtils {
	// 读取类路径下的核心配置文件
	private static final String MYBATE_RESOURCE = "mybatis-config.xml";
	private static SqlSessionFactory factory = null;
	private DbUtils() {
		try (InputStream inputStream = Resources.getResourceAsStream(MYBATE_RESOURCE);) {
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static DbUtils getInstance() {
		return SingletonInstance.INSTANCE;
	}

	public static class SingletonInstance {
		private static final DbUtils INSTANCE = new DbUtils();
	}

	public SqlSessionFactory getFactory() {
		return factory;
	}
}
