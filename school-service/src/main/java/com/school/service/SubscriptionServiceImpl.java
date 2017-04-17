package com.school.service;

import com.school.db.dao.SubscriptionDao;
import com.school.db.domain.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 3:26 PM
 */
@Service
public class SubscriptionServiceImpl implements SubscriptionService
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceServiceImpl.class);

	@Autowired
	SubscriptionDao subscriptionDao;

	public long saveSubscription(Subscription subscription)
	{
		return subscriptionDao.save(subscription);
	}

	public int updateSubscriptionStatus(long subscriptionId, String status)
	{
		return subscriptionDao.updateSubscriptionStatus(subscriptionId, status);
	}

	public List<Subscription> viewSubscription(long accountId, long customerId)
	{
		return subscriptionDao.viewSubscription(accountId, customerId);
	}
}
