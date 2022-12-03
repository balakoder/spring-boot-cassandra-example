package com.javacodestuffs.cassandra.springboot.cassandra.crud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.CqlSessionFactoryBean;

import com.datastax.oss.driver.api.core.CqlSession;

@Configuration
public class CassandraConfig {

	@Value("${cassandra.local.datacenter}")
	private String localDatacenter;

	@Value("${spring.data.cassandra.keyspace-name}")
	private String keyspace;

	@Value("${spring.data.cassandra.port}")
	private int port;

	@Value("${spring.data.cassandra.contact-points}")
	private String contactPoints;

	@Bean
	public CqlSession session() {
		return CqlSession.builder().withKeyspace(keyspace).build();
	}

	@Bean
	public CqlSessionFactoryBean cassandraSession() {
		CqlSessionFactoryBean cqlSessionFactoryBean = new CqlSessionFactoryBean();
		// cqlSessionFactoryBean.setUsername(username);
		// cqlSessionFactoryBean.setPassword(password);
		cqlSessionFactoryBean.setKeyspaceName(keyspace);
		cqlSessionFactoryBean.setLocalDatacenter(localDatacenter);
		cqlSessionFactoryBean.setPort(port);
		cqlSessionFactoryBean.setContactPoints(contactPoints);
		return cqlSessionFactoryBean;
	}
}