package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.Book;

public interface BookRepoIF extends JpaRepository<Book, Integer>{
	
}
