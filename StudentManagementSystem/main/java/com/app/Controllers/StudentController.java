package com.app.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entities.Student;
import com.app.Service.StudentServiceIF;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

	@Autowired
	private StudentServiceIF studentServiceInstance;

	@GetMapping
	public List<Student> getStudentList() {

		return studentServiceInstance.getAllStudents();
	}

	@PostMapping("/newstudent")
	public Student addNewStudent(@RequestBody Student newStudent) {

		Student insertedStudent = studentServiceInstance.insertNewStudent(newStudent);

		return insertedStudent;
	}

	@DeleteMapping("/deletestudent/{sid}")
	public String deleteStudentById(@PathVariable Integer sid) {

		String deletionStatus = studentServiceInstance.deleteStudent(sid);

		return deletionStatus;
	}

}
