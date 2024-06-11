package com.example.demo.mappers;

import com.example.demo.dtos.LocationDto;
import com.example.demo.entities.Location;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LocationMapper {
    @Mapping(target = "id", source = "location.id")
    @Mapping(target = "name", source = "location.name")
    LocationDto locationToLocationDto(Location location);
}
