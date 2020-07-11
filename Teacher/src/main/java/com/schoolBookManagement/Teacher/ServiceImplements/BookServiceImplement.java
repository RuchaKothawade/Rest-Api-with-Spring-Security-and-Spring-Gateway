package com.schoolBookManagement.Teacher.ServiceImplements;

import java.util.List;

import org.springframework.stereotype.Service;

import com.schoolBookManagement.Teacher.Dao.BookDao;
import com.schoolBookManagement.Teacher.Entities.Book;
import com.schoolBookManagement.Teacher.Services.BookService;

@Service
public class BookServiceImplement implements BookService {

	private BookDao bd;
	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bd.findAll();
	}

	@Override
	public Book getBook(long bookId) {
		// TODO Auto-generated method stub
		return bd.getOne(bookId);
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return bd.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return bd.save(book);
	}

	@Override
	public void deleteBook(long bookId) {
		
		bd.deleteById(bookId);
		
		
	}

}
