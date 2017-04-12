package com.school.service;

import com.school.db.dao.FacilityDao;
import com.school.db.domain.Facility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ivan.Luo
 * Date: 4/11/2017 12:52 PM
 */
@Service
public class FacilityServiceImpl implements FacilityService
{
	private static final Logger LOGGER = LoggerFactory.getLogger(FacilityServiceImpl.class);

	@Autowired
	FacilityDao facilityDao;
	public long saveFacility(Facility facility)
	{
		return facilityDao.save(facility);
	}

	public List<Facility> getVisibleFacility()
	{
		return facilityDao.getVisibleFacility();
	}

	public void deleteFacility(long id)
	{
		facilityDao.delete(id);
	}
}
