package com.service;

import java.util.List;

import com.model.City;
import com.model.Country;
import com.model.Department;
import com.model.Hobbies;
import com.model.Language;

public interface UserService {
	
	public List<Department> getDepartment();
	
	public List<City> getCity();
	
	public List<Country> getCountry();
	
	public List<Language> getLanguage();
	
	public List<Hobbies> getHobbies();

}
