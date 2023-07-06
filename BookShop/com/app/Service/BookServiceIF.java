package com.app.Service;

import java.util.List;

import com.app.Entities.Book;

public interface BookServiceIF {

	Book insertNewBook(Book newBook) ;
	
	List<Book> getAllBooks();
	
	String deleteBook(Integer bookID);
	
	Book updateBookPriceAndQuantityAndAuthorID(Book b);
}
