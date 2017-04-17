package com.school.service;

import com.school.db.dao.ServiceDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 10:53 AM
 */
@Service
public class ServiceServiceImpl implements ServiceService
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceServiceImpl.class);

	@Autowired
	ServiceDao serviceDao;
	public long saveService(com.school.db.domain.Service service)
	{
		return serviceDao.save(service);
	}

	public void deleteService(long id)
	{
		serviceDao.delete(id);
	}
}
