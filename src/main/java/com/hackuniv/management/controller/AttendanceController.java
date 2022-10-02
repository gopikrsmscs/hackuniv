package com.hackuniv.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackuniv.management.entity.Attendance;
import com.hackuniv.management.service.AttendanceService;

@RestController
@RequestMapping(value = "/attendance/")
public class AttendanceController {

	@Autowired
	AttendanceService attendanceService;

	@GetMapping("{userIdString}/{courseIdString}/{year}/{term}")
	public List<Attendance> getCoursesByTermAndYear(@PathVariable String userIdString,
			@PathVariable String courseIdString, @PathVariable String year, @PathVariable String term)
			throws Exception {
		Integer userId = Integer.parseInt(userIdString);
		Integer courseId = Integer.parseInt(courseIdString);
		List<Attendance> attendance = attendanceService.fetchTheAttendance(userId, courseId, year, term);
		return attendance;
	}

	@PostMapping("create")
	public void createCourses(@RequestBody(required = true) Attendance attendance) throws Exception {
		attendanceService.create(attendance);
	}

}
