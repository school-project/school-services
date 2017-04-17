package com.school.service;

import com.school.db.dao.AccountCustomerLinkDao;
import com.school.db.dao.CustomerDao;
import com.school.db.domain.AccountCustomerLink;
import com.school.db.domain.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ivan.Luo
 * Date: 4/13/2017 11:05 AM
 */
@Service
public class CustomerServiceImpl implements CustomerService
{
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	CustomerDao customerDao;

	@Autowired
	AccountCustomerLinkDao accountCustomerLinkDao;
	public long saveCustomer(Customer customer)
	{
		return customerDao.save(customer);
	}

	public void deleteCustomer(long id)
	{
		customerDao.delete(id);
	}

	public long LinkCustomerToAccount(AccountCustomerLink accountCustomerLink)
	{
		return accountCustomerLinkDao.save(accountCustomerLink);
	}

}
