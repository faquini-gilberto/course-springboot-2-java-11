package com.faquini.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.faquini.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
