package com.damlabin.BookApp.ressources;

import com.damlabin.BookApp.domain.Authors;
import com.damlabin.BookApp.services.AuthorsServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RestController
@RequestMapping("/api")
public class AuthorsController {

	private final AuthorsServices authorsServices;

	public AuthorsController(AuthorsServices authorsServices) {
		this.authorsServices = authorsServices;
	}


	@PostMapping("/authors")
	public Authors createAuthors(@RequestBody Authors author) {
		return authorsServices.save(author);
	}
	
	@GetMapping("/getAllAuthors")
	public List<Authors> getAllAuthors(){
		List<Authors> result = authorsServices.findAll();
		return result;
	}
}
