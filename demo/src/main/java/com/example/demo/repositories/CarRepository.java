package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Car;
import com.example.demo.entities.Location;


public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByLocationId(Long locationId);

}