package com.school.db.dao;

import com.school.db.domain.PlanServiceRate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 11:21 AM
 */
@Repository
@Transactional
public class PlanServiceRateDaoImpl extends AbstractHibernateDao implements PlanServiceRateDao
{
	private static final Logger LOGGER = LoggerFactory.getLogger(PlanServiceRateDaoImpl.class);

	public long save(PlanServiceRate planServiceRate)
	{
		LOGGER.debug("saving planServiceRate to DB");
		Long id = (Long) getSession().save(planServiceRate);
		LOGGER.debug("planServiceRate is saved to DB with id=" + id);

		return id;
	}

	public int delete(long planId, long serviceId)
	{
		LOGGER.debug("deleting service from DB");
		String query = "delete from PlanServiceRate psr where psr.planId=:planId and psr.serviceId=:serviceId";
		int records =
				getSession().createQuery(query).setParameter("planId", planId).setParameter("serviceId", serviceId)
						.executeUpdate();
		LOGGER.debug(records + " record(s) deleted from DB.");

		return records;
	}
}
