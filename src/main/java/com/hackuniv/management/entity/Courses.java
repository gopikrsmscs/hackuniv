package com.hackuniv.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Courses {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
	
	@Column(nullable = false, name = "course_name")
    String course_name;
	
	@Column(nullable = false, name = "professsor")
    String professor;
	
	@Column(nullable = false, name = "time")
    String time;
	
	@Column(nullable = false, name = "days")
    String days;
	
	@Column(nullable = false, name = "year")
    String year;
	
	@Column(nullable = false, name = "term")
    String term;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}
	
	
	
	
}
