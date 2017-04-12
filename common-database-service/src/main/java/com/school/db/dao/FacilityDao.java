package com.school.db.dao;

import com.school.db.domain.Facility;

import java.util.List;

/**
 * Created by Ivan.Luo
 * Date: 4/11/2017 11:06 AM
 */
public interface FacilityDao
{
	long save(Facility facility);

	int delete(long id);

	List<Facility> getVisibleFacility();
}
