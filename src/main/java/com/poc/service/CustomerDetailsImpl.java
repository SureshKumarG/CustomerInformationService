package com.poc.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.poc.beans.Customer;
import com.poc.dao.CustomerDaoImpl;

@WebService(targetNamespace = "http://service.poc.com/", portName = "CustomerDetailsImplPort", serviceName = "CustomerDetailsImplService")
public class CustomerDetailsImpl implements CustomerDetails{

	CustomerDaoImpl customerDaoImpl;
	
	/**
	 * Retrieves Customer Details
	 * 
	 * @param custId
	 * @return customer
	 */
	@WebMethod(operationName = "retrieveCustomerDetails", action = "urn:RetrieveCustomerDetails")
	public Customer retrieveCustomerDetails(String custId) {
		
		return customerDaoImpl.getCustomerBasicInformation(custId);		
	}

	/**
	 * Greets customer
	 * 
	 * @param name
	 * @return greeting message
	 */
	@WebMethod(operationName = "greetCustomer", action = "urn:GreetCustomer")
	public String greetCustomer(String name) {
		
		return "Hello...!!! "+name;
	}

}
