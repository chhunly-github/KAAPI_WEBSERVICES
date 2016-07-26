package org.khmeracademy.v3.configuration;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BaseConfiguration {
	@Autowired
	private DataSource datasource;
	
	
}
