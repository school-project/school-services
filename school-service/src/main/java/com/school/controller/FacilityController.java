package com.school.controller;

import com.school.db.domain.Facility;
import com.school.service.FacilityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Ivan.Luo
 * Date: 4/11/2017 12:50 PM
 */
@Controller
@RequestMapping(value = "/")
public class FacilityController
{
	private static final Logger LOGGER = LoggerFactory.getLogger(FacilityController.class);
	@Autowired
	FacilityService facilityService;

	@RequestMapping(value = "/createFacility", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity saveFacility(@RequestBody Facility facility)
	{
		LOGGER.debug("Start saving facility with data:" + facility);

		facilityService.saveFacility(facility);
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/removeFacility/{id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity deleteFacility(@PathVariable long id)
	{
		LOGGER.debug("Start deleting facility with id:" + id);

		facilityService.deleteFacility(id);
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/getFacility", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity getFacility()
	{
		LOGGER.debug("Start getting visible facility.");

		List<Facility> facilities = facilityService.getVisibleFacility();
		LOGGER.debug("Retrieved facilities: " + facilities);
		return new ResponseEntity(facilities, HttpStatus.OK);
	}
}
