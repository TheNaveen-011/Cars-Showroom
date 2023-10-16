package com.Naveen.BestChoice.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Naveen.BestChoice.DTO.CarsDto;


public class CarDAOImpl {
	@Autowired
	CarRepository carRepos;
	
	public String save(CarsDto carDto) {
		CarsDto save = carRepos.save(carDto);
		
		return "This Data Successfully Saved"+save; 
	}

}
