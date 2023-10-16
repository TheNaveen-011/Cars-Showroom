package com.Naveen.BestChoice.DTO;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CarsDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sn;
	private String brand;
	private String model;
	private Integer year;
	private Long noofKM;
	private Long price;
	private String fuel;
	
	public CarsDto() {
		// TODO Auto-generated constructor stub
	}
	
	public CarsDto(String brand, String model, int year, long noofKM, long price, String fuel) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.noofKM = noofKM;
		this.price = price;
		this.fuel = fuel;
	}
	

	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Long getNoofKM() {
		return noofKM;
	}

	public void setNoofKM(Long noofKM) {
		this.noofKM = noofKM;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "CarsDto [sn=" + sn + ", brand=" + brand + ", model=" + model + ", year=" + year + ", noofKM=" + noofKM
				+ ", price=" + price + ", fuel=" + fuel + "]";
	}
	
	
	
}
