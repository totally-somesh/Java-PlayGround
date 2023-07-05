package com.app.Service;

import java.util.List;

import com.app.DTOs.CourseResponseDTO;
import com.app.Entities.Course;

public interface CourseServiceIF {
	
	List<Course> getAllCourses();
	
	Course insertNewCourse(Course newCourse);
	
	Course updateCourseFees(Integer cid, Integer cfees);
	

}
