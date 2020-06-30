package com.service;

import java.util.List;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.model.City;
import com.model.Country;
import com.model.Department;
import com.model.Hobbies;
import com.model.Language;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<Department> getDepartment() {

		List deptList = new ArrayList();

		deptList.add(new com.model.Department(1, "IT"));
		deptList.add(new com.model.Department(2, "Finance"));
		deptList.add(new com.model.Department(3, "Security"));

		return deptList;
	}

	@Override
	public List<City> getCity() {
		List cityList = new ArrayList();

		cityList.add(new City(1, "Yuma"));
		cityList.add(new City(2, "Phoenix"));
		cityList.add(new City(3, "Flagstaff"));

		return cityList;
	}

	@Override
	public List<Country> getCountry() {
		List countryList = new ArrayList();

		countryList.add(new com.model.Country(1, "US"));
		countryList.add(new com.model.Country(2, "MEX"));
		countryList.add(new com.model.Country(3, "CAN"));

		return countryList;
	}
	
	@Override
	public List<Language> getLanguage() {

		List lanList = new ArrayList();

		lanList.add(new com.model.Language("english", "english"));
		lanList.add(new com.model.Language("french", "french"));
		lanList.add(new com.model.Language("spanish", "spanish"));

		return lanList;
	}

	@Override
	public List<Hobbies> getHobbies() {
		List hobbyList = new ArrayList();

		hobbyList.add(new com.model.Language("garden", "garden"));
		hobbyList.add(new com.model.Language("read", "read"));
		hobbyList.add(new com.model.Language("woodwork", "woodwork"));

		return hobbyList;
	}

}
