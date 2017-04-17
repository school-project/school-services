package com.school.service;

import com.school.db.domain.AccountCustomerLink;
import com.school.db.domain.Customer;

/**
 * Created by Ivan.Luo
 * Date: 4/13/2017 11:04 AM
 */
public interface CustomerService
{
	long saveCustomer(Customer customer);

	void deleteCustomer(long id);

	long LinkCustomerToAccount(AccountCustomerLink accountCustomerLink);
}
