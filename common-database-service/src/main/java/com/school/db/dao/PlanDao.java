package com.school.db.dao;

import com.school.db.domain.Plan;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 10:19 AM
 */
public interface PlanDao
{
	long save(Plan plan);

	int delete(long id);
}
