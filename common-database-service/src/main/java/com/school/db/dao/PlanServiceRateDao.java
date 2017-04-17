package com.school.db.dao;

import com.school.db.domain.PlanServiceRate;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 11:20 AM
 */
public interface PlanServiceRateDao
{
	long save(PlanServiceRate planServiceRate);

	int delete(long planId, long serviceId);
}
