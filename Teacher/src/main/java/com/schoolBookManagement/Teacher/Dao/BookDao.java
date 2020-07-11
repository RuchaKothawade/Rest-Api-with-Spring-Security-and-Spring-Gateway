package com.schoolBookManagement.Teacher.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolBookManagement.Teacher.Entities.Book;

public interface BookDao extends JpaRepository<Book, Long> {

}
