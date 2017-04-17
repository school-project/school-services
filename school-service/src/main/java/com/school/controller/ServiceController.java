package com.school.controller;

import com.school.db.domain.Service;
import com.school.service.ServiceService;
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

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 10:55 AM
 */
@Controller
@RequestMapping(value = "/")
public class ServiceController
{
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceController.class);
	@Autowired
	ServiceService serviceService;

	@RequestMapping(value = "/createService", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity saveService(@RequestBody Service service)
	{
		LOGGER.debug("Start saving service with data:" + service);

		serviceService.saveService(service);
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/removeService/{id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity deleteService(@PathVariable long id)
	{
		LOGGER.debug("Start deleting service with id:" + id);

		serviceService.deleteService(id);
		return new ResponseEntity(HttpStatus.OK);
	}
}
