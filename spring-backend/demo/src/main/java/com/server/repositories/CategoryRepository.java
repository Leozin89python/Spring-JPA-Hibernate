package com.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.server.entities.Category;
 
public interface CategoryRepository extends  JpaRepository<Category, Long>{
	
}
