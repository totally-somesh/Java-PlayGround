package com.app.Controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.DTOs.CourseRequestDTO;
import com.app.DTOs.CourseResponseDTO;
import com.app.Entities.Course;
import com.app.Service.CourseServiceIF;

@RestController
@RequestMapping("/courses")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {
	
	
	@Autowired
	private CourseServiceIF courseServiceInstance;
	
	@Autowired
	private ModelMapper mapper;
	
	@GetMapping
	public List<Course> listOfAllCourse() {
		
		
		List<Course> allCourses = courseServiceInstance.getAllCourses();
		
		return allCourses;
	}	
	
	@PostMapping("/newcourse")
	public Course launchNewCourse(@RequestBody Course newCourse) {
		
		Course courseToBeInserted = courseServiceInstance.insertNewCourse(newCourse);
		
		return courseToBeInserted;
		
	}
	
	@PutMapping("/updatecourse")
	public CourseResponseDTO updateCourseFee(@RequestBody CourseRequestDTO creqDTO) {
		
		Course updateCourse = courseServiceInstance.updateCourseFees(creqDTO.getId(), creqDTO.getFees());
		
		CourseResponseDTO mappedCourseDTO = mapper.map(updateCourse, CourseResponseDTO.class);
		
		return mappedCourseDTO;
		
	}
}
