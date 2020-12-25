package com.server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.server.entities.User;

public interface UserRepository extends  JpaRepository<User, Long>{
	
}
