package com.javacourse.project.hibernateandjpa.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.project.hibernateandjpa.Business.ICityService;
import com.javacourse.project.hibernateandjpa.Entities.City;

@RestController
@RequestMapping("/api")
public class CityController {
	private ICityService cityService;

	@Autowired	
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@GetMapping("/cities")
	public List<City> get(){
		return cityService.getAll();
		 
	}
	
	@PostMapping("/add")
	public void add(@RequestBody City newcity){
		cityService.add(newcity);
		 
	}
	
	@PostMapping("/update")
	public void update(@RequestBody City newcity){
		cityService.update(newcity);
		 
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody City newcity){
		cityService.add(newcity);
		 
	}
	
	@GetMapping("/cities/{id}")                 // id aşağıda yukarıda aynı isimde olacak
	public City getbyid(@PathVariable int id){
		return cityService.getbyid(id);
	}
}
