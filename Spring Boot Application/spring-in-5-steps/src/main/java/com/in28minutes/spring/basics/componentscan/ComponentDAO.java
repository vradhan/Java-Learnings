package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {
	
	@Autowired
	ComponentJDBCConnection jdbcConnection;

	public ComponentJDBCConnection getComponentJDBCConnection() {
		return jdbcConnection;
	}

	public void setComponentJDBCConnection(ComponentJDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
