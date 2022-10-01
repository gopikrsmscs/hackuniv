package com.hackuniv.management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user-management/user")
public class HackUnivController {

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public static String index() {
		return "Hello!";
	}
	
}
