package com.reobotnet.docker.compose;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import com.reobotnet.docker.compose.model.Book;
import com.reobotnet.docker.compose.repositories.BookRepository;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/books")
public class SpringbootMongodbDockerApplication {

	@Autowired
	private BookRepository repository;

	@PostMapping
	public Book saveBook(@RequestBody Book book){
		return repository.save(book);
	}

	@GetMapping
	public List<Book> getBooks(){
		return repository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbDockerApplication.class, args);
	}

}
