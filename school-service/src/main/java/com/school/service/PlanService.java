package com.school.service;

import com.school.db.domain.Plan;
import com.school.db.domain.PlanServiceRate;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 10:23 AM
 */
public interface PlanService
{
	long savePlan(Plan plan);

	void deletePlan(long id);

	long savePlanServiceRate(PlanServiceRate planServiceRate);

	void deletePlanServiceRate(long planId, long serviceId);
}
