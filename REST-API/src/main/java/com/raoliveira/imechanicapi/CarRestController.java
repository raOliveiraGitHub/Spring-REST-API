package com.raoliveira.imechanicapi;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * raOliveira.pt | 16/10/2021
 * Computer Science Engineering
 **/

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/")
public class CarRestController {

    private final CarService carService;
    private final CarRepository carRepository;

    // get all cars
    @GetMapping("/api/getModels")
    public List<Cars> findAll() {
        return carService.findAll();
    }

    // get models by brand
    @GetMapping("/api/getModels/{brand}")
    public List<String> findByName(@PathVariable("brand") String brand) {
        return carRepository.findByName(brand);
    }

    // get models by brand and fuel
    @GetMapping("/api/getModels/{brand}/{fuel}")
    public List<String> findByNameAndByFuel(@PathVariable("brand") String brand,
                                    @PathVariable("fuel") String fuel) {
        return carRepository.findByNameAndByFuel(brand, fuel);
    }

    // get models by brand and fuel and year
    @GetMapping("/api/getModels/{brand}/{fuel}/{year}")
    public List<String> findByNameAndByFuelAndByYear(@PathVariable("brand") String brand,
                                    @PathVariable("fuel") String fuel,
                                    @PathVariable("year") String year) {
        return carRepository.findByNameAndByFuelAndByYear(brand, fuel, year);
    }


}