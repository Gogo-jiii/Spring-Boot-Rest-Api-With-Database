package com.example.demo;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int authorId;
	private String name;
	private String surname;
	
	@OneToOne(mappedBy = "author")
	@JsonBackReference
	private Book book;
	
	public Author() {
		super();
	}

	
	
	public Author(int authorId, String name, String surname, Book book) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.surname = surname;
		this.book = book;
	}


	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", name=" + name + ", surname=" + surname + ", book=" + book + "]";
	}

	
}
