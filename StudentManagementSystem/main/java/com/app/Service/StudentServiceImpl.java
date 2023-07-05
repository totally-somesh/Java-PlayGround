package com.app.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entities.Student;
import com.app.Exceptions.ResourceNotFoundException;
import com.app.Repository.StudentRepoIF;

@Service
@Transactional
public class StudentServiceImpl implements StudentServiceIF {

	@Autowired
	private StudentRepoIF studentRepoInstance;

	@Override
	public List<Student> getAllStudents() {

		List<Student> allStudents = studentRepoInstance.findAll();

		return allStudents;
	}

	@Override
	public Student insertNewStudent(Student newStudent) {

		Student addedStudent = studentRepoInstance.save(newStudent);

		return addedStudent;
	}

	@Override
	public String deleteStudent(Integer id) {

		String msg = "Student Deletion Failed Miserably !";
		
		if (studentRepoInstance.existsById(id)) {

			studentRepoInstance.deleteById(id);
			msg = "Student Deleted Succesfully !";
		}

		return msg;
	}

}
