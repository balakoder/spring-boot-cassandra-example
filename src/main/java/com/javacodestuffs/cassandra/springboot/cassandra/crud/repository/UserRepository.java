package com.javacodestuffs.cassandra.springboot.cassandra.crud.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.javacodestuffs.cassandra.springboot.cassandra.crud.model.User;

public interface UserRepository extends CassandraRepository<User, String> {
	@AllowFiltering
	List<User> findByIsActive(boolean isActive);

	List<User> findByUsernameContaining(String username);
}