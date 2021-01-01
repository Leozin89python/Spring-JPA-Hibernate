package com.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.server.entities.OrderItem;

public interface OrderItemRepository extends  JpaRepository<OrderItem, Long>{
	
}
