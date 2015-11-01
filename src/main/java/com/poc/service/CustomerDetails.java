/**
 * 
 */
package com.poc.service;

import com.poc.beans.Customer;

/**
 * @author 210323
 * 
 */

public interface CustomerDetails {
	
	/**
	 * Retrieves Customer Details
	 * 
	 * @param custId
	 * @return customer
	 */
	public Customer retrieveCustomerDetails(String CustId);
	
	/**
	 * Greets customer
	 * 
	 * @param name
	 * @return greeting message
	 */
	public String greetCustomer(String name);

}
