package com.example.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PointsController {
	
	@Autowired
	private PointsService pointsService;
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomers() {
		return pointsService.getAllCustomers();
	}
	
	@RequestMapping("/orders")
	public List<Order> getAllOrders() {
		return pointsService.getAllOrders();
	}
	
	@RequestMapping("/orders/customers/{id}")
	public List<Order> getOrdersByCustomer(@PathVariable int id) {
		return pointsService.getOrdersByCustomer(id);
	}

}
