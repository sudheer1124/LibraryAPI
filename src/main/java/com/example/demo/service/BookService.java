package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	public BookRepository bookRepository;
	
	public Book addBook(Book book) {
		
		return bookRepository.save(book);
	}
	
	public void deleteBook(Long id) {
		
		bookRepository.deleteById(id);
		
	}
}
