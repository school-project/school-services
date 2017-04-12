package com.school.db.dao;

import com.school.db.domain.Facility;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ivan.Luo
 * Date: 4/11/2017 11:06 AM
 */
@Repository
@Transactional
public class FacilityDaoImpl extends AbstractHibernateDao implements FacilityDao
{
	private static final Logger LOGGER = LoggerFactory.getLogger(FacilityDaoImpl.class);

	public long save(Facility facility)
	{
		LOGGER.debug("saving facility to DB");

		Long id = (Long) getSession().save(facility);
		LOGGER.debug("facility is saved to DB with id=" + id);
		return id;
	}

	public int delete(long id)
	{
		LOGGER.debug("deleting facility from DB");
		String query = "delete from Facility f where f.id=:id";
		int result = getSession().createQuery(query)
				.setParameter("id", id).executeUpdate();
		LOGGER.debug(result + " record(s) deleted from DB.");
		return result;
	}

	public List<Facility> getVisibleFacility()
	{
		Criteria criteria = getSession().createCriteria(Facility.class);
		criteria.add(Restrictions.eq("visible", "YES"));

		return criteria.list();
	}
}
