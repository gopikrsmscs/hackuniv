package com.hackuniv.management.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackuniv.management.entity.Courses;
import com.hackuniv.management.entity.UserCourse;
import com.hackuniv.management.respository.CoursesRepository;
import com.hackuniv.management.respository.UserCourseRespository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CoursesRepository coursesRepository;

	@Autowired
	UserCourseRespository userCourseRespository;

	@Override
	public Optional<Courses> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return coursesRepository.findById(id);
	}

	@Override
	public List<Courses> findByYearAndTerm(String year, String term) throws Exception {
		// TODO Auto-generated method stub
		return coursesRepository.findByTermAndYear(term, year);
	}

	@Override
	public void Create(Courses courses) throws Exception {

		coursesRepository.save(courses);

	}

	@Override
	public void Create(UserCourse UserCourse) throws Exception {
		userCourseRespository.save(UserCourse);

	}

	@Override
	public List<Courses> findUserCourse(Integer userId) throws Exception {
		// TODO Auto-generated method stub
		List<UserCourse> userCourse = userCourseRespository.findByUserId(userId);
		List<Integer> courseIds = new ArrayList<>();
		userCourse.forEach(each -> courseIds.add(each.getCourseId()));
		List<Courses> result = new ArrayList<>();
		System.out.println(courseIds.size());
		Iterable<Courses> courses = coursesRepository.findAllById(courseIds);
		courses.forEach(result::add);
		return result;
	}

}
