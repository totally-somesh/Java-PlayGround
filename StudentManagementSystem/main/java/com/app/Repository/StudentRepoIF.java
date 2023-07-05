package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.Student;

public interface StudentRepoIF extends JpaRepository<Student, Integer>{

	
}
