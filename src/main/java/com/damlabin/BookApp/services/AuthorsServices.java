package com.damlabin.BookApp.services;


import com.damlabin.BookApp.domain.Authors;

import java.util.List;

public interface AuthorsServices {

	Authors save(Authors author);
	
	List<Authors> findAll();
	
	Authors findOne(Long id);
	
	void delete(Long id);
	
}
