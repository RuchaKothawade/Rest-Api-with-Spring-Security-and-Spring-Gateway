package com.schoolBookManagement.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.schoolBookManagement.Student.Entities.Book;
import com.schoolBookManagement.Student.Service.StudentService;

@RestController

public class StudentController {
	@Autowired
	private StudentService bs;
	
	@GetMapping("/books")
	public List<Book>  getBooks()
	{
		return this.bs.getBooks();
	}
	 @GetMapping("/books/{bookId}")
	 public Book getBook(@PathVariable String bookId  )
	 {
		 return this.bs.getBooks(Long.parseLong(bookId));
	 }

}
