package com.faquini.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.faquini.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
