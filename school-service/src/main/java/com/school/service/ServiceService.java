package com.school.service;

import com.school.db.domain.Service;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 10:50 AM
 */
public interface ServiceService
{
	long saveService(Service service);

	void deleteService(long id);
}
