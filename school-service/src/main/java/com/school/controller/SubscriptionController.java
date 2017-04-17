package com.school.controller;

import com.school.db.domain.Subscription;
import com.school.service.SubscriptionService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 3:28 PM
 */
@Controller
@RequestMapping(value = "/")
public class SubscriptionController
{
	private static final Logger LOGGER = LoggerFactory.getLogger(SubscriptionController.class);

	private static final String CANCEL_STATUS = "CANCEL";

	@Autowired
	SubscriptionService subscriptionService;

	@RequestMapping(value = "/createSubscription", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity saveSubscription(@RequestBody Subscription subscription)
	{
		LOGGER.debug("Start saving subscription with data:" + subscription);

		subscriptionService.saveSubscription(subscription);
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/cancelSubscription/{id}", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity cancelSubscription(@PathVariable long id)
	{
		LOGGER.debug("Start cancelling subscription with id:" + id);

		subscriptionService.updateSubscriptionStatus(id, CANCEL_STATUS);
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/updateSubscriptionStatus/{id}", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity cancelSubscription(@PathVariable long id, @RequestBody Map bodyMap)
	{
		String status = (String)bodyMap.get("status");
		LOGGER.debug("Start updating subscription with id:{}, status:{}", new Object[] { id, status });

		subscriptionService.updateSubscriptionStatus(id, status);
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/viewSubscription", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<List<Subscription>> viewSubscription(@RequestParam long accountId,
			@RequestParam long customerId)
	{
		LOGGER.debug("Start getting subscription with accountId:{}, customerId:{}.",
				new Object[] { accountId, customerId });

		List<Subscription> subscriptions = subscriptionService.viewSubscription(accountId, customerId);
		LOGGER.debug("Retrieved subscriptions: " + subscriptions);
		return new ResponseEntity(subscriptions, HttpStatus.OK);
	}
}
