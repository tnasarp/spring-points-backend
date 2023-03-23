package com.example.assignment;

public class Order {

	private int id;
	private String timestamp;
	private int amount;
	private int points;
	private int customerId;
	
	public Order() {
		
	}
	
	public Order(int id, String timestamp, int amount, int customerId) {
		super();
		this.id = id;
		this.timestamp = timestamp;
		this.amount = amount;
		this.customerId = customerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPoints() {
		if (amount < 50) {
			points += 0;
	      } else if(amount >= 50 && amount < 100) {
	    	  points += amount - 50;
	      } else if(amount > 100) {
	    	  points += 50 + (amount - 100) * 2;
	      }
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
}
