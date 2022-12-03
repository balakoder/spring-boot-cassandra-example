package com.javacodestuffs.cassandra.springboot.cassandra.crud.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javacodestuffs.cassandra.springboot.cassandra.crud.model.User;
import com.javacodestuffs.cassandra.springboot.cassandra.crud.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserRepository userRepository;

	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String title) {
		return new ResponseEntity<>(userRepository.findAll(), HttpStatus.CREATED);
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") String id) {

		Optional<User> user = userRepository.findById(id);
		return new ResponseEntity<>(user.get(), HttpStatus.OK);
	}

	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		try {
			user.setId(UUID.randomUUID().toString());
			User userSaved = userRepository.save(user);
			return new ResponseEntity<>(userSaved, HttpStatus.CREATED);
		} catch (Exception ex) {
			System.out.println(ex);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") String id, @RequestBody User user) {
		try {

			User userUpdated = userRepository.save(user);
			return new ResponseEntity<>(userUpdated, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") String id) {

		Optional<User> user = userRepository.findById(id);
		System.out.println("user is found of given ID" + user);
		userRepository.deleteById(id);
		return new ResponseEntity<>(new String("User is deleted"), HttpStatus.OK);

	}

	@GetMapping("/users/isActive")
	public ResponseEntity<List<User>> findByisActive(@RequestParam(required = false) boolean isActive) {
		return new ResponseEntity<>(userRepository.findByIsActive(isActive), HttpStatus.OK);

	}

}