package com.hackuniv.management.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hackuniv.management.entity.UserCourse;

public interface UserCourseRespository extends CrudRepository<UserCourse, Integer> {
	List<UserCourse> findByUserId(Integer userId);

}
