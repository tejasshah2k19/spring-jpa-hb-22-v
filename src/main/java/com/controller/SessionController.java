package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.LoginDto;
import com.entity.UserEntity;
import com.repository.UserRepository;

@RestController
public class SessionController {

	@Autowired
	UserRepository userRepo;
	
	
	@PostMapping("/login")
	public ResponseEntity<?>  authenticate(LoginDto login) {

		UserEntity userTemp = userRepo.findByEmail(login.getEmail());
		if(userTemp == null) {
			return ResponseEntity.ok(login);
		}else {
			return ResponseEntity.ok(userTemp);
		}
		//match --> email fn ln 
	}
}
