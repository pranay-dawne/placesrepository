package com.test.places.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "places")
public class Places {
	@Id
	@Column(name = "monument")
	private String monument;
	@Column(name = "location")
	private String location;
	@Column(name = "country")
	private String country;
	@Column(name = "year_")
	private Integer year;
	
	public Places() {}
	
	public Places(String monument, String location, String country, Integer year) {
		super();
		this.monument = monument;
		this.location = location;
		this.country = country;
		this.year = year;
	}
	public String getMonument() {
		return monument;
	}
	public void setMonument(String monument) {
		this.monument = monument;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	

}
