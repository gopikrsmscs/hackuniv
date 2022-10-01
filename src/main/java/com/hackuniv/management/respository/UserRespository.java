package com.hackuniv.management.respository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.hackuniv.management.entity.User;

public interface UserRespository extends CrudRepository<User, Integer> {
	Optional<User> findById(Integer id);
}
