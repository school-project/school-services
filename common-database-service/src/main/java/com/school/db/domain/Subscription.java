package com.school.db.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 3:09 PM
 */
@Entity
@Table(name = "SUBSCRIPTION")
public class Subscription implements Serializable
{
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private long id;

	@Column(name = "PLAN_ID")
	long planId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SUBSCRIPTION_START_DATE")
	Date subscriptionStartDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BILL_CYCLE_DATE")
	Date billCycleDate;

	@Column(name = "ORDER_ID")
	String orderId;

	@Column(name = "STATUS")
	String status;

	@Column(name = "ACCOUNT_ID")
	long accountId;

	@Column(name = "CUSTOMER_ID")
	long customerId;

	@Override
	public String toString()
	{
		return "Subscription{" +
				"id=" + id +
				", planId=" + planId +
				", subscriptionStartDate=" + subscriptionStartDate +
				", billCycleDate=" + billCycleDate +
				", orderId='" + orderId + '\'' +
				", status='" + status + '\'' +
				", accountId=" + accountId +
				", customerId=" + customerId +
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

	public long getPlanId()
	{
		return planId;
	}

	public void setPlanId(long planId)
	{
		this.planId = planId;
	}

	public Date getSubscriptionStartDate()
	{
		return subscriptionStartDate;
	}

	public void setSubscriptionStartDate(Date subscriptionStartDate)
	{
		this.subscriptionStartDate = subscriptionStartDate;
	}

	public Date getBillCycleDate()
	{
		return billCycleDate;
	}

	public void setBillCycleDate(Date billCycleDate)
	{
		this.billCycleDate = billCycleDate;
	}

	public String getOrderId()
	{
		return orderId;
	}

	public void setOrderId(String orderId)
	{
		this.orderId = orderId;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public long getAccountId()
	{
		return accountId;
	}

	public void setAccountId(long accountId)
	{
		this.accountId = accountId;
	}

	public long getCustomerId()
	{
		return customerId;
	}

	public void setCustomerId(long customerId)
	{
		this.customerId = customerId;
	}
}
