package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.Course;

public interface CourseRepoIF extends JpaRepository<Course, Integer> {

	
	
	
}

//4. Update course fees
//i/p : course id n updated fees.
//eg URL : for a course id=10 n updated fees =25000
// http://host:port/courses/10/fees/25000
//method=PUT