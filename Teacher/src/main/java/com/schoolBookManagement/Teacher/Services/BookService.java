package com.schoolBookManagement.Teacher.Services;

import java.util.List;

import com.schoolBookManagement.Teacher.Entities.Book;

public interface BookService {
	//Book Management
		public List<Book>getBooks();
		public Book getBook(long bookId);
		public Book addBook(Book book);
		public Book updateBook(Book book);
		public void deleteBook(long bookId);
		

}
