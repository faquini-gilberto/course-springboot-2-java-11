package com.faquini.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.faquini.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
