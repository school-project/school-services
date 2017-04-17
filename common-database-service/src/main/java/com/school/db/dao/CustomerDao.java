package com.school.db.dao;

import com.school.db.domain.Customer;

/**
 * Created by Ivan.Luo
 * Date: 4/13/2017 10:57 AM
 */
public interface CustomerDao
{
	long save(Customer customer);

	int delete(long id);
}
