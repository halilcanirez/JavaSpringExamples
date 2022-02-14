package com.javacourse.project.hibernateandjpa.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {
	public City(int id, String name, String countryCode, String district, String population) {
		super();
		this.id = id;
		this.name = name;
		CountryCode = countryCode;
		this.district = district;
		this.population = population;
	}
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="countrycode")
	private String CountryCode;
	@Column(name="District")
	private String district;
	@Column(name="Population")
	private String population;
	
	public City() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountrycode() {
		return CountryCode;
	}
	public void setCountrycode(String countrycode) {
		this.CountryCode = countrycode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}

}
