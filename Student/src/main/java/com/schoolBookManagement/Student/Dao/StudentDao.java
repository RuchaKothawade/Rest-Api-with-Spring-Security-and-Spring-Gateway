package com.schoolBookManagement.Student.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.schoolBookManagement.Student.Entities.Book;

public interface StudentDao extends JpaRepository<Book, Long> {

}
