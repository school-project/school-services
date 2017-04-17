package com.school.db.dao;

import com.school.db.domain.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ivan.Luo
 * Date: 4/13/2017 10:57 AM
 */
@Repository
@Transactional
public class CustomerDaoImpl extends AbstractHibernateDao implements CustomerDao
{
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerDaoImpl.class);
	public long save(Customer customer)
	{
		LOGGER.debug("saving customer to DB");
		Long id = (Long) getSession().save(customer);
		LOGGER.debug("customer is saved to DB with id=" + id);

		return id;
	}

	public int delete(long id)
	{
		LOGGER.debug("deleting customer from DB");
		String query = "delete from Customer c where c.id=:id";
		int records = getSession().createQuery(query)
				.setParameter("id", id).executeUpdate();
		LOGGER.debug(records + " record(s) deleted from DB.");

		return records;
	}
}
