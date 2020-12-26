package com.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.server.entities.Product;
 
public interface ProductRepository extends  JpaRepository<Product, Long>{
	
}
