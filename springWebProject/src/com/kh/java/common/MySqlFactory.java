package com.kh.java.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlFactory {
	public MySqlFactory(){
	}
	
	public static SqlSessionFactory getMySqlsession(){
		SqlSessionFactory sqlSessionFactory =null;
		InputStream inputStream =null;
		String resource = "/mybatis/mybatis-config.xml";
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}
}
