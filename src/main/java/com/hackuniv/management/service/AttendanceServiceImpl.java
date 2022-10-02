package com.hackuniv.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackuniv.management.entity.Attendance;
import com.hackuniv.management.respository.AttendanceRespository;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	AttendanceRespository attendanceRespository;

	@Override
	public List<Attendance> fetchTheAttendance(Integer userId, Integer courseId, String year, String term) {
		// TODO Auto-generated method stub
		return attendanceRespository.findByUserIdAndCourseIdAndYearAndTerm(userId, courseId, year, term);
	}

	@Override
	public void create(Attendance attendance) {
		attendanceRespository.save(attendance);

	}

}
