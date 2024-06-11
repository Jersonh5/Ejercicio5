package com.example.demo.services;

import java.util.List;
import com.example.demo.dtos.LocationDto;

public interface LocationService {
    List<LocationDto> getAllLocations();
}