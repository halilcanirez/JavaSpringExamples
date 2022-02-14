package com.javacourse.project.hibernateandjpa.Business;

import java.util.List;

import com.javacourse.project.hibernateandjpa.Entities.City;

public interface ICityService {
	List<City> getAll();
	void add(City newCity);
	void update(City searchCity);
	void delete(City searchCity);
	City getbyid(int id);
}
