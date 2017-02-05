package com.jatkuva.elena.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Book {
	private Long id;
	private String title;
	private String author;
	private int year;
	private String isbn;
	private Double price;
	public Book(Long id, String title, String author, int year, String isbn, Double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
	}
	public Book() {
		super();
	}
	
}
