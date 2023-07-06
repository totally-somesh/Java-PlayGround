package com.app.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.DTOs.authRequestDTO;
import com.app.DTOs.authResponseDTO;
import com.app.Entities.Author;
import com.app.Service.AuthorServiceIF;

@RestController
@RequestMapping("/authors")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthorController {

	@Autowired
	private AuthorServiceIF authorServiceInstance;
	
	@PostMapping("/newauthor")
	public Author addNewAuthor(@RequestBody Author newAuthor) {
		
		return authorServiceInstance.insertnewAuthor(newAuthor);	
	}
	
	@GetMapping
	public List<Author> getAuthorList(){
		
		List<Author> authorList = authorServiceInstance.getAllAuthors();
		
		return authorList;
	}
	
	@DeleteMapping("/deleteauthor/{authorID}")
	public String deleteAuthorByID(@PathVariable Integer authorID) {
		
		String deletionStatus = authorServiceInstance.deleteAuthor(authorID);
		
		return deletionStatus;	
	}
	
	@PutMapping("/updateauthor")
	public Author updateAuthorDetails(@RequestBody Author author) {
		
		Author updateAuthor = authorServiceInstance.updateAuthor(author);
		
		return updateAuthor;
	}
	
	@PostMapping("/authenticate")
	public authResponseDTO authenticateAuthor(@RequestBody authRequestDTO areqDTO) {
		
		authResponseDTO mappedDTO = authorServiceInstance.authenticateAuthor(areqDTO);
		
		return mappedDTO;
	}
	
}
