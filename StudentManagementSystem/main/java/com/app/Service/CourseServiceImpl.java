package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Entities.Course;
import com.app.Exceptions.ResourceNotFoundException;
import com.app.Repository.CourseRepoIF;


@Service
@Transactional
public class CourseServiceImpl implements CourseServiceIF {

	@Autowired
	private CourseRepoIF courseRepoInstance;
	
	
	@Override
	public Course insertNewCourse(Course newCourse) {
		
		return courseRepoInstance.save(newCourse);
	}


	@Override
	public List<Course> getAllCourses() {
		
		List<Course> allCourses = courseRepoInstance.findAll();
		
		return allCourses;
	}


	@Override
	public Course updateCourseFees(Integer cid, Integer cfees) {
	
		
		Course course = courseRepoInstance.findById(cid)
				.orElseThrow(() -> new ResourceNotFoundException
						("Invalid Course ID ! Course Not Found !"));
		course.setFees(cfees);
		return course;
	}
	
	

}
