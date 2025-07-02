package com.example.userservice.controller;


import com.example.userservice.exception.UserException;
import com.example.userservice.mapper.UserMapper;
import com.example.userservice.model.User;
import com.example.userservice.payload.dto.UserDTO;
import com.example.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class UserController {


	private final UserService userService;
	private final UserMapper userMapper;
	

	
	@GetMapping("/api/users/profile")
	public ResponseEntity<UserDTO> getUserFromJwtToken(
			@RequestHeader("Authorization") String jwt) throws Exception {

		User user = userService.getUserFromJwtToken(jwt);
		UserDTO userDTO=userMapper.mapToDTO(user);


		return new ResponseEntity<>(userDTO,HttpStatus.OK);
	}

	@GetMapping("/api/users/{userId}")
	public ResponseEntity<UserDTO> getUserById(
			@PathVariable Long userId
	) throws UserException {
		User user = userService.getUserById(userId);
		if(user==null) {
			throw new UserException("User not found");
		}
		UserDTO userDTO=userMapper.mapToDTO(user);

		return new ResponseEntity<>(userDTO,HttpStatus.OK);
	}

	@GetMapping("/api/users")
	public ResponseEntity<List<User>> getUsers(
	) throws UserException {
		List<User> users = userService.getAllUsers();

		return new ResponseEntity<>(users,HttpStatus.OK);
	}






}
