package com.school.db.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 4:13 PM
 */
@Entity
@Table(name = "ACCOUNT_CUSTOMER_LINK")
public class AccountCustomerLink implements Serializable
{
	@Id
	@Column(name = "UNIQUE_ID")
	@GeneratedValue
	private long id;

	@Column(name = "ACCOUNT_ID")
	private long accountId;

	@Column(name = "CUSTOMER_ID")
	private long customerId;

	@Override
	public String toString()
	{
		return "AccountCustomerLink{" +
				"id=" + id +
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
