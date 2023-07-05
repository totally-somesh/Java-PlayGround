package com.app.Service;

import java.util.List;

import com.app.Entities.Student;

public interface StudentServiceIF {
	
	List<Student> getAllStudents();
	
	Student insertNewStudent(Student newStudent);
	
	String deleteStudent(Integer id);

}
