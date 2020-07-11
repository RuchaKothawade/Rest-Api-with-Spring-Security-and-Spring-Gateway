package com.schoolBookManagement.Teacher.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.schoolBookManagement.Teacher.Entities.Book;
import com.schoolBookManagement.Teacher.Entities.User;
import com.schoolBookManagement.Teacher.Services.BookService;
import com.schoolBookManagement.Teacher.Services.UserService;

@RestController

public class TeacherController {

@Autowired

private BookService bs;
@Autowired
private UserService us;

@GetMapping("/books")
public List<Book> getBooks()
{

	return this.bs.getBooks();
}

@GetMapping("/books/{bookId}")
public Book getBook(@PathVariable  String bookId)
{
	return this.bs.getBook(Long.parseLong(bookId));
}

@PostMapping("/addbook")
public Book addBook(@RequestBody Book book)
{
	
	return this.bs.addBook(book);
	
}

@PutMapping("/updatebook")
public Book updateCourse(@RequestBody  Book book)
{
	return this.bs.updateBook(book);
}

@DeleteMapping("/deletebooks/{bookId}")
public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String bookId)
{
	try {
		this.bs.deleteBook(Long.parseLong( bookId));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	catch(Exception e)
	{
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

@GetMapping("/users")
public List<User> getUsers()
{

	return this.us.getUsers();
}

@GetMapping("/usersby/{userId}")
public User getUser(@PathVariable  String userId)
{
	return this.us.getUser(Long.parseLong(userId));
}

@PostMapping(path="/addusers",consumes = "text/plain")
public User addUser(@RequestBody User user)
{
	
	return this.us.addUser(user);
	
}





	
}
