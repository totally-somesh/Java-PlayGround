package com.app.Service;

import java.util.List;

import com.app.DTOs.authRequestDTO;
import com.app.DTOs.authResponseDTO;
import com.app.Entities.Author;

public interface AuthorServiceIF {
	
	Author insertnewAuthor(Author newAuthor);
	
	List<Author> getAllAuthors();
	
	String deleteAuthor(Integer authorID);
	
	Author updateAuthor(Author author);
	
	authResponseDTO authenticateAuthor(authRequestDTO areqDTO);
}
