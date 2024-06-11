package com.example.demo.mappers;

import com.example.demo.dtos.RentalDto;
import com.example.demo.entities.Rental;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RentalMapper {
    @Mapping(target = "id", source = "rental.id")
    @Mapping(target = "user", source = "rental.user")
    @Mapping(target = "car", source = "rental.car")
    @Mapping(target = "startDate", source = "rental.startDate")
    @Mapping(target = "endDate", source = "rental.endDate")
    @Mapping(target = "totalPaid", source = "rental.totalPaid")
    RentalDto rentalToRentalDto(Rental rental);
}