package com.example.userservice.service;


import com.example.userservice.exception.UserException;
import com.example.userservice.model.User;

import java.util.List;


public interface UserService {

	User getUserByEmail(String email) throws UserException;

	User getUserFromJwtToken(String jwt) throws Exception;

	User getUserById(Long id) throws UserException;

	List<User> getAllUsers();

}
