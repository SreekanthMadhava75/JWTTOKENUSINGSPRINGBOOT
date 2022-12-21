package com.advana.service;


import com.advana.model.User;
import com.advana.exceptions.UserNotFoundException;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
	public void saveUser(User user);
	public User  getUserByNameAndPassword(String name, String password) throws UserNotFoundException;

}
