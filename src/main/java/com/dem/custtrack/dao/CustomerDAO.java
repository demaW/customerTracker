package com.dem.custtrack.dao;

import java.util.List;

import com.dem.custtrack.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer cusomer);

	public Customer getCustomer(int customerId);

	public void deleteCustomer(int customerId);
}
