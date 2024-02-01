package com.spring.course.SpringCourse.respositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.course.SpringCourse.enitity.Course;
@Repository
public interface CourserRepository extends JpaRepository<Course, Long> {

}
