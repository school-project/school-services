package com.school.controller;

import com.school.db.domain.Role;
import com.school.service.RoleService;
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
 * Date: 4/17/2017 10:08 AM
 */
@Controller
@RequestMapping(value = "/")
public class RoleController
{
	private static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);
	@Autowired
	RoleService roleService;

	@RequestMapping(value = "/createRole", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity saveRole(@RequestBody Role role)
	{
		LOGGER.debug("Start saving role with data:" + role);

		roleService.saveRole(role);
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/removeRole/{id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity deleteRole(@PathVariable long id)
	{
		LOGGER.debug("Start deleting role with id:" + id);

		roleService.deleteRole(id);
		return new ResponseEntity(HttpStatus.OK);
	}
}
