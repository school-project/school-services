package com.school.db.dao;

import com.school.db.domain.Subscription;

import java.util.List;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 3:13 PM
 */
public interface SubscriptionDao
{
	long save(Subscription subscription);

	int updateSubscriptionStatus(long subscriptionId, String status);

	List<Subscription> viewSubscription(long accountId, long customerId);
}
