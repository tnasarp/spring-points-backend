package com.example.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PointsService {
	
	private List<Order> orders = new ArrayList<> (Arrays.asList(
			new Order(1, "18/03/2023", 120, 1),
			new Order(2, "19/03/2023", 74, 2),
			new Order(3, "07/04/2023", 4802, 1)
			));

	private List<Customer> customers = new ArrayList<> (Arrays.asList(
			new Customer(1, "Osama"),
			new Customer(2, "Vishesh"),
			new Customer(3, "Dujana")
			));
	
	public List<Order> getAllOrders() {
		return orders;
	}
	
	public List<Customer> getAllCustomers() {
		return customers;
	}

	public List<Order> getOrdersByCustomer(int id) {
		List<Order> o = new ArrayList<> ();
		for(int i=0; i< orders.size(); i++) {
			Order order = orders.get(i);
			if(order.getCustomerId() == id) {
				o.add(order);
			}
		}
		return o;
	}
}
