package com.app.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.DTOs.authRequestDTO;
import com.app.DTOs.authResponseDTO;
import com.app.Entities.Author;
import com.app.Repository.AuthorRepoIF;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorServiceIF {

	@Autowired
	private AuthorRepoIF authorRepoInstance;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public Author insertnewAuthor(Author newAuthor) {
		
		return authorRepoInstance.save(newAuthor);
	}

	@Override
	public List<Author> getAllAuthors() {
		
		List<Author> authorList = authorRepoInstance.findAll();
		
		return authorList;
	}

	@Override
	public String deleteAuthor(Integer authorID) {
		
		String status = "Author Deletion Failed Miserably, Boss ! ";
		
		if(authorRepoInstance.existsById(authorID)) {
			
		authorRepoInstance.deleteById(authorID);
		status = "Author Deleted Succesfully, Boss ! ";
		
		}
		return status;
	}

	@Override
	public Author updateAuthor(Author author) {
		
		Author updatedAuthor = authorRepoInstance.save(author);
		
		return updatedAuthor;
	}

	@Override
	public authResponseDTO authenticateAuthor(authRequestDTO areqDTO) {
		
		Author foundAuthor = authorRepoInstance.findByAuthorNameAndEmail(areqDTO.getAuthorName(),areqDTO.getEmail());
			
		authResponseDTO mappedDTO = mapper.map(foundAuthor, authResponseDTO.class);
			
		return mappedDTO;
	}
	
	
	
	

}
