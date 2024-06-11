package com.example.demo.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentalDto {
    private Long id;
    private UserDto user;
    private CarDto car;
    private String startDate;
    private String endDate;
    private Double totalPaid;
}
