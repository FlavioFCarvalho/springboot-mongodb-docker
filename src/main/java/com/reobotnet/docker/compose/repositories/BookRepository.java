package com.reobotnet.docker.compose.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.reobotnet.docker.compose.model.Book;

public interface BookRepository  extends MongoRepository<Book, Integer>{

}
