package com.schoolBookManagement.Student.Entities;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Book {

	@Id
	private long Id;
	private String Title;
	private String Author;
	private String Description;
	public long getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Book(long id, String title, String author, String description) {
		super();
		Id = id;
		Title = title;
		Author = author;
		Description = description;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [Id=" + Id + ", Title=" + Title + ", Author=" + Author + ", Description=" + Description + "]";
	}
	
}

