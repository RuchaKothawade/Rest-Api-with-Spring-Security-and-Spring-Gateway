package com.schoolBookManagement.Student.ServiceImplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolBookManagement.Student.Dao.StudentDao;
import com.schoolBookManagement.Student.Entities.Book;
import com.schoolBookManagement.Student.Service.StudentService;


@Service
public class BookServiceImplement implements StudentService {

	@Autowired
	private StudentDao sd;

	@Override
	public Book getBooks(long bookId) {
		// TODO Auto-generated method stub
		return sd.getOne(bookId);
	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return sd.findAll();
	}
	
		


}
