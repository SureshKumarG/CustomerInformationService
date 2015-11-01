package com.poc.dao;

import java.util.HashMap;
import java.util.Map;

import com.poc.beans.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	/**
	 * Retrieves basic customer details from static data store
	 * 
	 * @param custId
	 * @return Customer Information
	 */
	public Customer getCustomerBasicInformation(String custId) {
		
		    Customer customer1 = new Customer();
			customer1.setCustomerId("123");
			customer1.setFirstname("Ross");
			customer1.setLastName("Grabner");
			customer1.setEmail("Ross.Grabner@gmail.com");
			customer1.setAddress("3333, XYZ Street, LA");
			customer1.setState("California");
			customer1.setCountry("United States");
			customer1.setZipCode("96678");
					
			return customer1;
		
	}

}
