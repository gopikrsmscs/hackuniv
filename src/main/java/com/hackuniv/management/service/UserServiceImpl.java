package com.hackuniv.management.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackuniv.management.entity.User;
import com.hackuniv.management.respository.UserRespository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRespository userRepository;
	
	@Override
	public Optional<User> findById(Integer id) {
		
		return userRepository.findById(id);
	}

}
