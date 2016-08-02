package org.khmeracademy.v3.configuration;


import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
public class DataSourceConfiguration {
	@Autowired
	private DataSource datasource;
	
	@Bean
	public SqlSessionFactoryBean sqlsessionfactorybean(){
		SqlSessionFactoryBean sqlsessionfactoryBean = new SqlSessionFactoryBean();
		sqlsessionfactoryBean.setDataSource(datasource);
		return sqlsessionfactoryBean;
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager(){
		return new DataSourceTransactionManager(datasource);
	}
}
