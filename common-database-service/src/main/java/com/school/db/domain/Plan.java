package com.school.db.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 10:18 AM
 */
@Entity
@Table(name = "PLAN")
public class Plan implements Serializable
{
	@Id
	@Column(name = "PLAN_ID")
	@GeneratedValue
	private long id;

	@Column(name = "PLAN_NAME")
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
		return "Plan{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
