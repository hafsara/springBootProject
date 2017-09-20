package com.example.demo.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String lastName;
	private String firstName;
	@ManyToMany
	private Set<Book> books =new HashSet<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Author(String lastName, String firstName, Set<Book> books) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.books = books;
	}
	public Author(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	

}
