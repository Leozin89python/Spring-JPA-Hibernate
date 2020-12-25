package com.server.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.Services.OrderService;
import com.server.entities.Order;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
		
		@Autowired
		private OrderService service;
	
		@GetMapping
		public ResponseEntity<List <Order>> findall(){
			List<Order> list = service.findAll();
			return ResponseEntity.ok().body(list);
		}
		
		@GetMapping(value = "/{id}")
		public ResponseEntity<Order> findByid(@PathVariable Long id){
			Order obj = service.findById(id);
			return ResponseEntity.ok().body(obj);
		}
		
}