package com.damlabin.BookApp.services;


import com.damlabin.BookApp.domain.Books;

import java.util.List;

public interface BooksServices {

	Books save(Books book);
	
	List<Books> findAll();
	
	Books findOne(Long id);

	Books findBookById(Long bookId);
	
	void deleteById(Long id);
}
