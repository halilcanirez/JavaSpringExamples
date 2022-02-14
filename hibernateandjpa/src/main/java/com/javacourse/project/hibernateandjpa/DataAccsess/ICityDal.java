package com.javacourse.project.hibernateandjpa.DataAccsess;
import com.javacourse.project.hibernateandjpa.Entities.City;

import java.util.List;
 
public interface ICityDal {
	List<City> getAll();
	void add(City newCity);
	void update(City searchCity);
	void delete(City searchCity);
	City getbyid(int id);
	

}
