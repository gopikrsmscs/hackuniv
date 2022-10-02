package com.hackuniv.management.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hackuniv.management.entity.Attendance;

public interface AttendanceRespository extends CrudRepository<Attendance, Integer> {
	List<Attendance> findByUserIdAndCourseIdAndTermAndYear(Integer userId, Integer courseId, String term, String year);

	List<Attendance> findByUserIdAndCourseIdAndYearAndTerm(Integer userId, Integer courseId, String year, String term);
}
