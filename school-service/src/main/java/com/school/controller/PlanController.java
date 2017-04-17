package com.school.controller;

import com.school.db.domain.Plan;
import com.school.db.domain.PlanServiceRate;
import com.school.service.PlanService;
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

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 10:26 AM
 */
@Controller
@RequestMapping(value = "/")
public class PlanController
{
	private static final Logger LOGGER = LoggerFactory.getLogger(PlanController.class);
	@Autowired
	PlanService planService;

	@RequestMapping(value = "/createPlan", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity savePlan(@RequestBody Plan plan)
	{
		LOGGER.debug("Start saving plan with data:" + plan);

		planService.savePlan(plan);
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/removePlan/{id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity deletePlan(@PathVariable long id)
	{
		LOGGER.debug("Start deleting plan with id:" + id);

		planService.deletePlan(id);
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/createPlanServiceRate", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public ResponseEntity savePlanServiceRate(@RequestBody PlanServiceRate planServiceRate)
	{
		LOGGER.debug("Start saving planServiceRate with data:" + planServiceRate);

		planService.savePlanServiceRate(planServiceRate);
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/removePlanServiceRate", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseBody
	public ResponseEntity deletePlanServiceRate(@RequestParam long planId, @RequestParam long serviceId)
	{
		LOGGER.debug("Start deleting planServiceRate with planId:{}, serviceId:{}", new Object[] { planId, serviceId });

		planService.deletePlanServiceRate(planId, serviceId);
		return new ResponseEntity(HttpStatus.OK);
	}
}
