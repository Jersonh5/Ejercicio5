package com.example.demo.services;

import com.example.demo.dtos.CarDto;
import com.example.demo.mappers.CarMapper;
import com.example.demo.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public CarServiceImpl(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    @Override
    public List<CarDto> getAllCars() {
        return carRepository.findAll().stream()
                .map(m -> carMapper.carToCarDto(m))
                .collect(Collectors.toList());
    }

    @Override
    public List<CarDto> getCarsByLocation(Long locationId) {
        return carRepository.findByLocationId(locationId).stream()
                .map(m -> carMapper.carToCarDto(m))
                .collect(Collectors.toList());
    }
}
