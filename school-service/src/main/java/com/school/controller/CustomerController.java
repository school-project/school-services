package com.school.controller;

import com.school.db.domain.AccountCustomerLink;
import com.school.db.domain.Customer;
import com.school.service.CustomerService;
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
 * Date: 4/13/2017 11:08 AM
 */
@Controller
@RequestMapping(value = "/")
public class CustomerController
{
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/createCustomer", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity saveCustomer(@RequestBody Customer customer)
	{
		LOGGER.debug("Start saving customer with data:" + customer);

		customerService.saveCustomer(customer);
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/removeCustomer/{id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity deleteCustomer(@PathVariable long id)
	{
		LOGGER.debug("Start deleting customer with id:" + id);

		customerService.deleteCustomer(id);
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/linkCustomerToAccount", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity linkCustomerToAccount(@RequestBody AccountCustomerLink accountCustomerLink)
	{
		LOGGER.debug("Start saving accountCustomerLink with data:" + accountCustomerLink);

		customerService.LinkCustomerToAccount(accountCustomerLink);
		return new ResponseEntity(HttpStatus.OK);
	}
}
