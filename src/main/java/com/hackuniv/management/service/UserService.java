package com.hackuniv.management.service;

import java.util.Optional;

import com.hackuniv.management.entity.User;

public interface UserService {
	
	Optional<User> findById(Integer id) throws Exception;;
}
