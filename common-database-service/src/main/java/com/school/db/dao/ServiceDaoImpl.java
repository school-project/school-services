package com.school.db.dao;

import com.school.db.domain.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 10:47 AM
 */
@Repository
@Transactional
public class ServiceDaoImpl extends AbstractHibernateDao implements ServiceDao
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceDaoImpl.class);

	public long save(Service service)
	{
		LOGGER.debug("saving service to DB");
		Long id = (Long) getSession().save(service);
		LOGGER.debug("service is saved to DB with id=" + id);

		return id;
	}

	public int delete(long id)
	{
		LOGGER.debug("deleting service from DB");
		String query = "delete from Service s where s.id=:id";
		int records = getSession().createQuery(query)
				.setParameter("id", id).executeUpdate();
		LOGGER.debug(records + " record(s) deleted from DB.");

		return records;
	}
}
