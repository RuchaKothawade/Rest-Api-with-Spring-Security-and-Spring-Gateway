package com.schoolBookManagement.Student.Service;

import java.util.List;

import com.schoolBookManagement.Student.Entities.Book;


public interface StudentService {

	public Book getBooks(long bookId);

	public List<Book> getBooks();
	
		
		
		

}
