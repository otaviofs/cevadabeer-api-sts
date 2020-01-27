package com.cevadabeer.api.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cevadabeer.api.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User>	findAll(){
		User u = new User(1L, "Maria", "78945612396", "maria@gmail.com", "999999999", "123456");
		return ResponseEntity.ok().body(u);
	}
	
	
}
