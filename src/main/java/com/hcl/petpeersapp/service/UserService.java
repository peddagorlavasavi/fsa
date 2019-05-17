package com.hcl.petpeersapp.service;

import java.util.List;


import com.hcl.petpeersapp.domain.User;

public interface UserService {

	public User createUser(User  user);

	public User updateUser(User user);

	public User deleteUser(Long id);

	public List<User> getAllUsers();

	public User getUserById(Long Id);

	public String loginUser(User user);

}
