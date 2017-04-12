package com.school.db.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Ivan.Luo
 * Date: 4/11/2017 11:06 AM
 */
@Entity
@Table(name = "FACILITY")
public class Facility implements Serializable
{
	@Id
	@Column(name = "FACILITY_ID")
	@GeneratedValue
	private long id;

	@Column(name = "FACILITY_NAME")
	private String name;

	@Column(name = "FACILITY_TYPE")
	private String type;

	@Column(name = "PARKING_SLOTS")
	private String parkingSlots;

	@Column(name = "DISABLED_PROVISION")
	private String disabledProvision;

	@Column(name = "VISIBLE")
	private String visible;

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

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getParkingSlots()
	{
		return parkingSlots;
	}

	public void setParkingSlots(String parkingSlots)
	{
		this.parkingSlots = parkingSlots;
	}

	public String getDisabledProvision()
	{
		return disabledProvision;
	}

	public void setDisabledProvision(String disabledProvision)
	{
		this.disabledProvision = disabledProvision;
	}

	public String getVisible()
	{
		return visible;
	}

	public void setVisible(String visible)
	{
		this.visible = visible;
	}

	@Override
	public String toString()
	{
		return "Facility{" +
				"id=" + id +
				", name='" + name + '\'' +
				", type='" + type + '\'' +
				", parkingSlots='" + parkingSlots + '\'' +
				", disabledProvision='" + disabledProvision + '\'' +
				", visible='" + visible + '\'' +
				'}';
	}
}
