package com.Naveen.BestChoice.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Naveen.BestChoice.DTO.CarsDto;


public interface CarRepository  extends JpaRepository<CarsDto,Integer> {
	
	List<CarsDto> getBybrand(String name);
//	List<CarsDto> getByPriceLessThan(Long price);
//	List<CarsDto> getByPriceMoreThan(Long price);

}
