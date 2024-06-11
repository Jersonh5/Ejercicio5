package com.example.demo.mappers;

import com.example.demo.dtos.CarDto;
import com.example.demo.entities.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;



@Mapper(componentModel = "spring")
public interface CarMapper {
    @Mapping(target = "id", source = "car.id")
    @Mapping(target = "model", source = "car.model")
    @Mapping(target = "year", source = "car.year")
    @Mapping(target = "price", source = "car.price")
    @Mapping(target = "imageUrl", source = "car.imageUrl")
    @Mapping(target = "location", source = "car.location")
    @Mapping(target = "rented", source = "car.rented")
    CarDto carToCarDto(Car car);
}
