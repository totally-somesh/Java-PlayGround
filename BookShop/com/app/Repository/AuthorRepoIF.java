package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.Author;

public interface AuthorRepoIF extends JpaRepository<Author, Integer>{

	Author findByAuthorNameAndEmail(String authorName, String email);
	
}
