package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.UserEntity;
import com.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepo;

	@PostMapping
	public UserEntity saveUser(UserEntity user) {
		// db store
		userRepo.save(user);
		return user;
	}

	@GetMapping
	public List<UserEntity> getAllUsers() {

		List<UserEntity> users = userRepo.findAll();
		return users;
	}

	@DeleteMapping
	public boolean removeUser(@RequestParam("userId") int userId) {
		Optional<UserEntity> user = userRepo.findById(userId);
		if (user.isPresent()) {
			userRepo.deleteById(userId);
			return true;
		} else {
			return false;
		}
	}

	@PutMapping
	public UserEntity updateUser(UserEntity user) {
		userRepo.save(user);//id fn ln 
		return user;
	}


}

