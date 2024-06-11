package com.example.demo.services;

import com.example.demo.dtos.RentalDto;
import com.example.demo.mappers.RentalMapper;
import com.example.demo.repositories.RentalRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RentalServiceImpl implements RentalService {
    private final RentalRepository rentalRepository;
    private final RentalMapper rentalMapper;

    public RentalServiceImpl(RentalRepository rentalRepository, RentalMapper rentalMapper) {
        this.rentalRepository = rentalRepository;
        this.rentalMapper = rentalMapper;
    }

    @Override
    public List<RentalDto> getAllRentals() {
        return rentalRepository.findAll()
            .stream()
            .map(r -> rentalMapper.rentalToRentalDto(r))
            .toList();
    }
}