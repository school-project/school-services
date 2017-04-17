package com.school.db.dao;

import com.school.db.domain.Plan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 10:20 AM
 */
@Repository
@Transactional
public class PlanDaoImpl extends AbstractHibernateDao implements PlanDao
{
	private static final Logger LOGGER = LoggerFactory.getLogger(PlanDaoImpl.class);
	public long save(Plan plan)
	{
		LOGGER.debug("saving plan to DB");
		Long id = (Long) getSession().save(plan);
		LOGGER.debug("plan is saved to DB with id=" + id);

		return id;
	}

	public int delete(long id)
	{
		LOGGER.debug("deleting plan from DB");
		String query = "delete from Plan r where r.id=:id";
		int records = getSession().createQuery(query)
				.setParameter("id", id).executeUpdate();
		LOGGER.debug(records + " record(s) deleted from DB.");

		return records;
	}
}
