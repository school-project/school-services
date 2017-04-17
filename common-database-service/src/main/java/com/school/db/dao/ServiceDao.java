package com.school.db.dao;

import com.school.db.domain.Service;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 10:47 AM
 */
public interface ServiceDao
{
	long save(Service Service);

	int delete(long id);
}
