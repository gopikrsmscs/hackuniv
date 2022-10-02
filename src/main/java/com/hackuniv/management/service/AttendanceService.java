package com.hackuniv.management.service;

import java.util.List;

import com.hackuniv.management.entity.Attendance;

public interface AttendanceService {

	List<Attendance> fetchTheAttendance(Integer userId, Integer courseId, String year, String term);

	void create(Attendance attendance);
}
