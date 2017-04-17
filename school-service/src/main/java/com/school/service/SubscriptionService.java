package com.school.service;

import com.school.db.domain.Subscription;

import java.util.List;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 3:25 PM
 */
public interface SubscriptionService
{
	long saveSubscription(Subscription subscription);

	int updateSubscriptionStatus(long subscriptionId, String status);

	List<Subscription> viewSubscription(long accountId, long customerId);
}
