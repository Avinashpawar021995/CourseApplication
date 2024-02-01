package com.spring.course.SpringCourse.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.course.SpringCourse.enitity.Course;

public interface CourseService {

	List<Course> getCourse();

	Course getCourses(Long id);

	Course addCourse(Course course);

	Course updateCource(Course course);

	void deteleCources(long id);

}
