package com.example.demo.services;

import java.util.List;
import com.example.demo.dtos.LocationDto;
import com.example.demo.mappers.LocationMapper;
import com.example.demo.repositories.LocationRepository;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {
    private final LocationRepository locationRepository;
    private final LocationMapper locationMapper;

    public LocationServiceImpl(LocationRepository locationRepository, LocationMapper locationMapper) {
        this.locationRepository = locationRepository;
        this.locationMapper = locationMapper;
    }

    @Override
    public List<LocationDto> getAllLocations() {
        return locationRepository.findAll()
                .stream()
                .map(l -> locationMapper.locationToLocationDto(l))
                .toList();
    }

}
