package com.damlabin.BookApp.ressources;

import com.damlabin.BookApp.domain.Books;
import com.damlabin.BookApp.services.BooksServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RestController
@RequestMapping("/api")
public class BooksController {
	

	private final BooksServices booksServices;

	public BooksController(BooksServices booksServices) {
		this.booksServices = booksServices;
	}

	@PostMapping("/books")
	public Books createBooks(@RequestBody Books book) {

		return booksServices.save(book);
	}
	
	@GetMapping("/getAllBooks")
	public List<Books> getAllBooks(){
		return booksServices.findAll();
	}

	@GetMapping("/book/{id}")
	public Books getBookById(@PathVariable Long id){
		return booksServices.findBookById(id);
	}

}
