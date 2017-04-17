package com.school.db.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 10:45 AM
 */
@Entity
@Table(name = "SERVICE")
public class Service implements Serializable
{

	@Id
	@Column(name = "SERVICE_ID")
	@GeneratedValue
	private long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "RATE")
	private double rate;

	@Column(name = "UOM")
	private String uom;

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

	public double getRate()
	{
		return rate;
	}

	public void setRate(double rate)
	{
		this.rate = rate;
	}

	public String getUom()
	{
		return uom;
	}

	public void setUom(String uom)
	{
		this.uom = uom;
	}

	@Override
	public String toString()
	{
		return "Service{" +
				"id=" + id +
				", name='" + name + '\'' +
				", rate=" + rate +
				", uom='" + uom + '\'' +
				'}';
	}
}
