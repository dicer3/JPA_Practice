package com.example.jpaprac.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.jpaprac.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

   // public Book findById(int id);
}
