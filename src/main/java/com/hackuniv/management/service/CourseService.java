package com.hackuniv.management.service;

import java.util.List;
import java.util.Optional;

import com.hackuniv.management.entity.Courses;
import com.hackuniv.management.entity.UserCourse;

public interface CourseService {
	Optional<Courses> findById(Integer id) throws Exception;

	List<Courses> findByYearAndTerm(String year, String term) throws Exception;

	void Create(Courses courses) throws Exception;

	void Create(UserCourse UserCourse) throws Exception;

	List<Courses> findUserCourse(Integer userId) throws Exception;

}
