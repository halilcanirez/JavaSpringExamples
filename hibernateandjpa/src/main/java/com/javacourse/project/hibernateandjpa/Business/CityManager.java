package com.javacourse.project.hibernateandjpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateandjpa.DataAccsess.ICityDal;
import com.javacourse.project.hibernateandjpa.Entities.City;

@Service
public class CityManager implements ICityService {
	
	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal = cityDal;
	}

	@Override
	@Transactional
	public List<City> getAll() {
		// TODO Auto-generated method stub
		return cityDal.getAll();
	}

	@Override
	@Transactional
	public void add(City newCity) {
		// yada eklenecek şehir kiritelere uygunmu diye kontrol edilir
		// Busines katmanında mesela şehir eklenecekse bu şehir veri tabanında daha önceden varmıydı diye kontroledlirl
		this.cityDal.add(newCity);
		
	}

	@Override
	@Transactional
	public void update(City searchCity) {
		this.cityDal.update(searchCity);
	}

	@Override
	@Transactional
	public void delete(City searchCity) {
		this.cityDal.delete(searchCity);
	}

	@Override
	@Transactional
	public City getbyid(int id) {
		return this.cityDal.getbyid(id);
	}
		
}
