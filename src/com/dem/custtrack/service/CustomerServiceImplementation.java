package com.dem.custtrack.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dem.custtrack.dao.CustomerDAO;
import com.dem.custtrack.entity.Customer;

@Service
public class CustomerServiceImplementation implements CustomerService {

	@Autowired
	CustomerDAO customerDAO;
	
	@Transactional
	@Override
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Transactional
	@Override
	public void saveCustomer(Customer customer) {
		customerDAO.saveCustomer(customer);
	}

	@Transactional
	@Override
	public Customer getCustomer(int customerId) {
		return customerDAO.getCustomer(customerId);
	}
	
	@Transactional
	@Override
	public void deleteCustomer(int customerId) {
		customerDAO.deleteCustomer(customerId);
	}

}
