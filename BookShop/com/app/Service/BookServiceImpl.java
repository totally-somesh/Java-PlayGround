package com.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Entities.Book;
import com.app.Exceptions.ResourceNotFoundException;
import com.app.Repository.BookRepoIF;

@Service
@Transactional
public class BookServiceImpl implements BookServiceIF {

	@Autowired
	private BookRepoIF bookRepoInstance;
	
	
	
	@Override
	public Book insertNewBook(Book newBook) {
		
		return bookRepoInstance.save(newBook);
	}

	@Override
	public List<Book> getAllBooks() {
		
		List<Book> bookList = bookRepoInstance.findAll();
		
		return bookList;
	}

	@Override
	public String deleteBook(Integer bookID) {
		
		
		String msg = "Book Deletion Failed Miserably, Boss !";
		if(bookRepoInstance.existsById(bookID)) {
	
		bookRepoInstance.deleteById(bookID);
		msg = "Book Deleted Succefully, Boss !";
		
		}
		return msg;
	}

	@Override
	public Book updateBookPriceAndQuantityAndAuthorID(Book b) {
		return bookRepoInstance.save(b);
	}
	
	
	
	
	

	
	
	
}
