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

import com.app.Entities.Book;
import com.app.Service.BookServiceIF;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {
	
	@Autowired
	private BookServiceIF bookServiceInstance;
	
	@PostMapping("/newbook")
	public String addNewBook(@RequestBody Book newBook) {
		
		Book insertedBook = bookServiceInstance.insertNewBook(newBook);
		
		String status = insertedBook.getBookName() + " Added Succesfully, Boss !";
		
		return status;		
	}
	
	@GetMapping
	public List<Book> getBookList(){
		
		List<Book> bookList = bookServiceInstance.getAllBooks();
		
		return bookList;
	}
	
	@DeleteMapping("/deletebook/{bookID}")
	public String deleteBookByID(@PathVariable Integer bookID) {
		
		String status = bookServiceInstance.deleteBook(bookID);
		
		return status;		
	}
	
	@PutMapping("/updatebook")
	public Book updateBook(@RequestBody Book b) {
		return bookServiceInstance.updateBookPriceAndQuantityAndAuthorID(b);
	}
	
	
	
	
	
	
	
}
