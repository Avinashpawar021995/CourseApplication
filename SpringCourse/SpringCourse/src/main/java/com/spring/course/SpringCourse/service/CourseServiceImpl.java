package com.spring.course.SpringCourse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.course.SpringCourse.enitity.Course;
import com.spring.course.SpringCourse.respositry.CourserRepository;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired 
 private CourserRepository courserRepository;
	public CourseServiceImpl(CourserRepository courserRepository) {
		this.courserRepository = courserRepository;
	}

	@Override
	public List<Course> getCourse() {
		
		return  courserRepository.findAll() ;
	}

	@Override
	public Course getCourses(Long id) {
		return courserRepository.findById(id).orElseThrow();
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return courserRepository.save(course);
	}

	@Override
	public Course updateCource(Course course) {
		// TODO Auto-generated method stub
		return courserRepository.save(course);
	}

	@Override
	public void deteleCources(long id) {
		// TODO Auto-generated method stub
	  Course course= courserRepository.findById(id).orElseThrow();	
	     courserRepository.delete(course);
	}

}
