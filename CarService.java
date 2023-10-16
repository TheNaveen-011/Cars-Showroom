package com.Naveen.BestChoice.Service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Naveen.BestChoice.DAO.CarDAOImpl;
import com.Naveen.BestChoice.DAO.CarRepository;
import com.Naveen.BestChoice.DTO.CarsDto;

@Service
public class CarService {

	@Autowired
	private CarRepository carDao;
	
	public CarsDto saveData(CarsDto carDto) {
		return carDao.save(carDto);
		
	}
	
	public List<CarsDto> getcarsByName(String name) {
		List<CarsDto> byModel = carDao.getBybrand(name);
		
		return byModel;
	}
	
	public String deleteById(int id) {
		
		Optional<CarsDto> byId = carDao.findById(id);
		if(byId == null) {
			return id+" Not present or Data not There";
		}
		
		carDao.deleteById(id);
		
		return byId+"  Success fully deleted";
	}
	
	public List<CarsDto> findAll(){
		return carDao.findAll();
	}
	
//	public List<CarsDto> getByPriceLessThan(Long price){
//		return carDao.getByPriceLessThan(price);
//	}
//	
//	
//	public List<CarsDto> getByPriceMoreThan(Long price) {
//		
//		return carDao.getByPriceMoreThan(price);
//	}
	
	
}
