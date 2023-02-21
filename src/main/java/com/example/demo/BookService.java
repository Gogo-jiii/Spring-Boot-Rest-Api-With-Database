package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks() {
		return (List<Book>) bookRepository.findAll();
	}
	
	public Book getBookByID(int id) {
		return bookRepository.findById(id).get();
	}
	
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}
	
	public void deleteBook(Book book) {
		bookRepository.delete(book);
	}
	
	public void updateBook(Book book, int id) {
		book.setId(id);
		bookRepository.save(book);
	}
}
