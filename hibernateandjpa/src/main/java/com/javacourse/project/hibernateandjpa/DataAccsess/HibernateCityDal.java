package com.javacourse.project.hibernateandjpa.DataAccsess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateandjpa.Entities.*;
//JPA Standartı 

@Repository
public class HibernateCityDal implements ICityDal{
	
	private EntityManager entityManager;
	
	@Autowired    // Spring frameworkden implete ettik
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
		
	}
	
	// AOP Ascept Orianted Programing 
	@Override
	@Transactional // spring den implete
	public List<City> getAll() {
		Session session= entityManager.unwrap(Session.class); // hibernate den implte ettik
		String queryString="from City";
	    List<City> cities = session.createQuery(queryString,City.class).getResultList();
		return cities;
	}

	@Override
	@Transactional
	public void add(City newCity) {
		Session session= entityManager.unwrap(Session.class); // hibernate den implte ettik
		session.saveOrUpdate(newCity);
		
		
	}

	@Override
	public void update(City searchCity) {
		Session session= entityManager.unwrap(Session.class); // hibernate den implte ettik
		session.saveOrUpdate(searchCity);
	}

	@Override
	public void delete(City searchCity) {
		Session session= entityManager.unwrap(Session.class); // hibernate den implte ettik
		City citytodelete = session.get(City.class,searchCity.getId());
		session.delete(citytodelete);
	}
	public City getbyid(int id) {
		Session session= entityManager.unwrap(Session.class); // hibernate den implte ettik
	    City city = session.get(City.class,id);
		return city;
	}
	
		
}
