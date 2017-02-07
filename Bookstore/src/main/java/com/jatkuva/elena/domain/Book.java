package com.jatkuva.elena.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
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


	public Book(String title, String author, int year, String isbn, Double price) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
	}

}
