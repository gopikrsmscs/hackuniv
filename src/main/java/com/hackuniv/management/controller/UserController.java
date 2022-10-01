package com.hackuniv.management.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackuniv.management.entity.User;
import com.hackuniv.management.service.UserService;

@RestController
@RequestMapping(value = "/user-management/user/student/")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("{ids}")
	public User getUserByEmail(@PathVariable String ids) throws Exception {
		Integer id = Integer.parseInt(ids);
		Optional<User> user = userService.findById(id);
		return user.get();
	}
}
