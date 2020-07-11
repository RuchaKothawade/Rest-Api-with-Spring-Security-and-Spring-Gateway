
package com.schoolBookManagement.Teacher.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.schoolBookManagement.Teacher.Entities.User;

public interface UserDao extends JpaRepository<User,Long> {

}
