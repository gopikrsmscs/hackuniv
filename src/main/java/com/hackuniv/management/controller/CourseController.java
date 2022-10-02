package com.hackuniv.management.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hackuniv.management.entity.Courses;
import com.hackuniv.management.entity.UserCourse;
import com.hackuniv.management.service.CourseService;

@RestController
@RequestMapping(value = "/courses/")
public class CourseController {

	@Autowired
	CourseService courseService;

	@GetMapping("{year}/{term}")
	public List<Courses> getCoursesByTermAndYear(@PathVariable String year, @PathVariable String term)
			throws Exception {
		List<Courses> courses = courseService.findByYearAndTerm(year, term);
		return courses;
	}

	@PostMapping("create")
	public void createCourses(@RequestBody(required = true) Courses courses) throws Exception {
		courseService.Create(courses);
	}

	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST,path="register", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void registerCourse(@RequestBody(required = true) UserCourse userCourse) throws Exception {
		courseService.Create(userCourse);
	}

	@GetMapping("/user/{id}")
	public List<Courses> getUserCourses(@PathVariable String id) throws Exception {
		Integer userId = Integer.parseInt(id);
		return courseService.findUserCourse(userId);
	}

}
