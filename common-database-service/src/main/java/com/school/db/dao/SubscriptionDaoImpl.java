package com.school.db.dao;

import com.school.db.domain.Subscription;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 3:16 PM
 */
@Repository
@Transactional
public class SubscriptionDaoImpl extends AbstractHibernateDao implements SubscriptionDao
{
	private static final Logger LOGGER = LoggerFactory.getLogger(SubscriptionDaoImpl.class);
	public long save(Subscription subscription)
	{
		LOGGER.debug("saving subscription to DB");
		Long id = (Long) getSession().save(subscription);
		LOGGER.debug("subscription is saved to DB with id=" + id);

		return id;
	}

	public int updateSubscriptionStatus(long subscriptionId, String status)
	{
		LOGGER.debug("updating subscription to DB by subscriptionId:" + subscriptionId);
		String query = "update Subscription s set s.status=:status where s.id=:subscriptionId";
		int records =
				getSession().createQuery(query).setParameter("subscriptionId", subscriptionId).setParameter("status", status)
						.executeUpdate();
		LOGGER.debug(records + " record(s) updated from DB.");

		return records;
	}

	public List<Subscription> viewSubscription(long accountId, long customerId)
	{
		Criteria criteria = getSession().createCriteria(Subscription.class);
		criteria.add(Restrictions.eq("accountId",accountId));
		criteria.add(Restrictions.eq("customerId", customerId));

		return criteria.list();
	}
}
