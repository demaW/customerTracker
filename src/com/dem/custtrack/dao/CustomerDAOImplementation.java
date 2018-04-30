package com.dem.custtrack.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dem.custtrack.entity.Customer;

@Repository
public class CustomerDAOImplementation implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		List<Customer> customers;
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> query =  session.createQuery("from Customer order by lastName", Customer.class);
		customers = query.getResultList();
		return customers;
	}

	@Override
	public void saveCustomer(Customer cusomer) {
		Session session = sessionFactory.getCurrentSession();
		session.save(cusomer);
	}

}
