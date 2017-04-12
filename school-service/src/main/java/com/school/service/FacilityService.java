package com.school.service;

import com.school.db.domain.Facility;

import java.util.List;

/**
 * Created by Ivan.Luo
 * Date: 4/11/2017 12:52 PM
 */
public interface FacilityService
{
	long saveFacility(Facility facility);

	List<Facility> getVisibleFacility();

	void deleteFacility(long id);
}
