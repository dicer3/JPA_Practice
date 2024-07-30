package com.example.jpaprac.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpaprac.entities.Book;
import com.example.jpaprac.repository.BookRepository;

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;
    // private static List<Book> list = new ArrayList<>();

    // static{
    //     list.add(new Book(12,"Java Complete Roadmap","XYZ"));
    //     list.add(new Book(13,"Java Complete Roadmap","XYZ"));
    //     list.add(new Book(14,"Java Complete Roadmap","XYZ"));
    // }

    public List<Book> getAllBooks(){
        List<Book> list = (List<Book>)this.bookRepository.findAll();
        return list;
    }

    public Book getBookById(int id){
        Book book = bookRepository.findById(id).orElse(null);
        return book;
    }

    public Book addBook(Book b){
        Book result = bookRepository.save(b);
        return result;
    }

    public void deleteBook(int bid){
       bookRepository.deleteById(bid);
    }

    public void updateBook(Book book, int bId){
        book.setId(bId);
        bookRepository.save(book);
    }
}
