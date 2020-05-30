package com.damlabin.BookApp.services;


import com.damlabin.BookApp.domain.Authors;
import com.damlabin.BookApp.repository.AuthorsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsServicesImpl implements AuthorsServices {

	private final AuthorsRepository authorsrepository;
	
	public AuthorsServicesImpl(AuthorsRepository authorsrepository) {
		this.authorsrepository = authorsrepository;
	}
	
	@Override//permet de donner un corps a une fonction
	public Authors save(Authors author) {
		// TODO Auto-generated method stub
		return authorsrepository.save(author);
	}

	@Override
	public List<Authors> findAll() {
		// TODO Auto-generated method stub
		return authorsrepository.findAll();
	}

	@Override
	public Authors findOne(Long id) {
		// TODO Auto-generated method stub
		return authorsrepository.getOne(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		authorsrepository.deleteById(id);
	}

}
