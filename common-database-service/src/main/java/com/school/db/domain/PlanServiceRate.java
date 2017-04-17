package com.school.db.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 11:16 AM
 */
@Entity
@Table(name = "PLAN_SERVICE_RATE")
public class PlanServiceRate implements Serializable
{
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private long id;

	@Column(name = "PLAN_ID")
	long planId;

	@Column(name = "PLAN_PERIOD")
	String planPeriod;

	@Column(name = "SERVICE_ID")
	long serviceId;

	@Column(name = "RATE")
	double rate;

	@Column(name = "INCLUDED_AMOUNT")
	int includedAmount;

	@Column(name = "OVERUSAGE_CHARGE")
	double overusageCharge;

	@Column(name = "CHARGE_CYCLE")
	double chargeCycle;

	public long getPlanId()
	{
		return planId;
	}

	public void setPlanId(long planId)
	{
		this.planId = planId;
	}

	public String getPlanPeriod()
	{
		return planPeriod;
	}

	public void setPlanPeriod(String planPeriod)
	{
		this.planPeriod = planPeriod;
	}

	public long getServiceId()
	{
		return serviceId;
	}

	public void setServiceId(long serviceId)
	{
		this.serviceId = serviceId;
	}

	public double getRate()
	{
		return rate;
	}

	public void setRate(double rate)
	{
		this.rate = rate;
	}

	public int getIncludedAmount()
	{
		return includedAmount;
	}

	public void setIncludedAmount(int includedAmount)
	{
		this.includedAmount = includedAmount;
	}

	public double getOverusageCharge()
	{
		return overusageCharge;
	}

	public void setOverusageCharge(double overusageCharge)
	{
		this.overusageCharge = overusageCharge;
	}

	public double getChargeCycle()
	{
		return chargeCycle;
	}

	public void setChargeCycle(double chargeCycle)
	{
		this.chargeCycle = chargeCycle;
	}

	@Override
	public String toString()
	{
		return "PlanServiceRate{" +
				"planId=" + planId +
				", planPeriod='" + planPeriod + '\'' +
				", serviceId=" + serviceId +
				", rate=" + rate +
				", includedAmount=" + includedAmount +
				", overusageCharge=" + overusageCharge +
				", chargeCycle=" + chargeCycle +
				'}';
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}
}
