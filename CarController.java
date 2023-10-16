package com.Naveen.BestChoice.controller;

import com.Naveen.BestChoice.DTO.CarsDto;
import com.Naveen.BestChoice.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carSer;

    @GetMapping("/homepage")
    public String homePage() {
        return "home.jsp";
    }

    @GetMapping("/justhome")
    public String homePa() {
        return "just11.jsp";
    }

    @GetMapping("/homeCars")
    public String homeCar(@ModelAttribute("carDto") CarsDto carDto) {
        System.out.println("This is running...");
        return "saveDetails";
    }

    @PostMapping("/saveData")
    public String saveData(@ModelAttribute("carDto") CarsDto carsDto) {
        carSer.saveData(carsDto);
        return "redirect:/cars/showByBrand?brand=" + carsDto.getBrand();
    }

    @GetMapping("/showByBrand")
    public String showCar(@RequestParam("brand") String brand, Model model) {
        List<CarsDto> getCar = carSer.getcarsByName(brand);
        model.addAttribute("cars", getCar);
        return "carList"; // Assuming "carList.html" is the corresponding Thymeleaf template
    }

    @DeleteMapping("/delete/{id}")
    public String deleteData(@PathVariable int id) {
        carSer.deleteById(id);
        return "redirect:/cars/showByBrand";
    }
}
