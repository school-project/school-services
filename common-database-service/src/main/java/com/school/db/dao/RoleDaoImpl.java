package com.school.db.dao;

import com.school.db.domain.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 9:49 AM
 */

@Repository
@Transactional
public class RoleDaoImpl extends AbstractHibernateDao implements RoleDao
{
	private static final Logger LOGGER = LoggerFactory.getLogger(RoleDaoImpl.class);

	public long save(Role role)
	{
		LOGGER.debug("saving role to DB");
		Long id = (Long) getSession().save(role);
		LOGGER.debug("role is saved to DB with id=" + id);

		return id;
	}

	public int delete(long id)
	{
		LOGGER.debug("deleting role from DB");
		String query = "delete from Role r where r.id=:id";
		int records = getSession().createQuery(query)
				.setParameter("id", id).executeUpdate();
		LOGGER.debug(records + " record(s) deleted from DB.");

		return records;
	}
}
