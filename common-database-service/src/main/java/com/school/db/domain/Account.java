package com.school.db.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Ivan.Luo
 * Date: 4/13/2017 10:47 AM
 */
@Entity
@Table(name = "ACCOUNT")
public class Account implements Serializable
{
	@Id
	@Column(name = "ACCOUNT_ID")
	@GeneratedValue
	private long id;

	@Column(name = "ACCOUNT_NAME")
	private String name;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Account{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
