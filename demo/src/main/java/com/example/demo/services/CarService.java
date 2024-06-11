package com.example.demo.services;

import com.example.demo.dtos.CarDto;

import java.util.List;

public interface CarService {
    List<CarDto> getAllCars();
    List<CarDto> getCarsByLocation(Long locationId);
}
