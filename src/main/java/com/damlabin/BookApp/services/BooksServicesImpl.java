package com.damlabin.BookApp.services;


import com.damlabin.BookApp.domain.Books;
import com.damlabin.BookApp.repository.BooksRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServicesImpl implements BooksServices {

	private final BooksRepository bookrepository;
	
	public BooksServicesImpl(BooksRepository bookrepository) {
		this.bookrepository = bookrepository;
	}
	
	@Override
	public Books save(Books book) {
		// TODO Auto-generated method stub
		return bookrepository.save(book);
	}

	@Override
	public List<Books> findAll() {
		// TODO Auto-generated method stub
		return bookrepository.findAll();
	}

	@Override
	public Books findOne(Long id) {
		// TODO Auto-generated method stub
		return bookrepository.getOne(id);
	}

	@Override
	public Books findBookById(Long bookId) {
		// TODO Auto-generated method stub
		return bookrepository.findBooksById(bookId);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		bookrepository.deleteById(id);
	}

	
}
