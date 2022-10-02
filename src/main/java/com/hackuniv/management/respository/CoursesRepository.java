package com.hackuniv.management.respository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.hackuniv.management.entity.Courses;

public interface CoursesRepository extends CrudRepository<Courses, Integer> {

	List<Courses> findByTermAndYear(String term, String year);

	Optional<Courses> findById(Integer id);

}
