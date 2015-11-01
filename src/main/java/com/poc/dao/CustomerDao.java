/**
 * 
 */
package com.poc.dao;

import com.poc.beans.Customer;

/**
 * @author 210323
 *
 */
public interface CustomerDao {
	
	 /**
	 * Retrieves basic customer details from static data store
	 * 
	 * @param custId
	 * @return Customer Information
	 */
	public Customer getCustomerBasicInformation(String custId);

}
