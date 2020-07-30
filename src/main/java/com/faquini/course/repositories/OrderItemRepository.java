package com.faquini.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.faquini.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
