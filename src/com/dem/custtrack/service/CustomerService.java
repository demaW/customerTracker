package com.dem.custtrack.service;

import java.util.List;

import com.dem.custtrack.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);
}
