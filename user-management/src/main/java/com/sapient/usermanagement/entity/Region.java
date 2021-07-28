package com.sapient.usermanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = " region ")
public class Region {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer regionId;
	private String address;
	private String city;
	private String state;
	private String country;
	private Float tax;
	
	public Region() {
		
	}

	public Region(Integer regionId, String address, String city, String state, String country, Float tax) {
		super();
		this.regionId = regionId;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.tax = tax;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Float getTax() {
		return tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}
	
}
