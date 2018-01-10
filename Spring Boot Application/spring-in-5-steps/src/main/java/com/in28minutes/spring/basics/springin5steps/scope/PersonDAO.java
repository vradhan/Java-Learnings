package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
	
	@Autowired
	JDBCConnection jdbcConnection;

	public JDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
