package com.example.demo.controllers;

import com.example.demo.dtos.CarDto;
import com.example.demo.services.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public ResponseEntity<List<CarDto>> getAllCars() {
        List<CarDto> cars = carService.getAllCars();
        return ResponseEntity.ok(cars);
    }

    @GetMapping("/byLocation/{locationId}")
    public ResponseEntity<List<CarDto>> getCarsByLocation(@PathVariable Long locationId) {
        List<CarDto> cars = carService.getCarsByLocation(locationId);
        return ResponseEntity.ok(cars);
    }
}
