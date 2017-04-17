package com.school.service;

import com.school.db.dao.PlanDao;
import com.school.db.dao.PlanServiceRateDao;
import com.school.db.domain.Plan;
import com.school.db.domain.PlanServiceRate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 10:24 AM
 */
@Service
public class PlanServiceImpl implements PlanService
{
	private static final Logger LOGGER = LoggerFactory.getLogger(PlanServiceImpl.class);

	@Autowired
	PlanDao planDao;

	@Autowired
	PlanServiceRateDao planServiceRateDao;

	public long savePlan(Plan plan)
	{
		return planDao.save(plan);
	}

	public void deletePlan(long id)
	{
		planDao.delete(id);
	}

	public long savePlanServiceRate(PlanServiceRate planServiceRate)
	{
		return planServiceRateDao.save(planServiceRate);
	}

	public void deletePlanServiceRate(long planId, long serviceId)
	{
		planServiceRateDao.delete(planId, serviceId);
	}
}
