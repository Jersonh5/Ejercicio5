package com.example.demo.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {
    private Long id;
    private String model;
    private Integer year;
    private Double price;
    private String imageUrl;
    private LocationDto location; 
    private Boolean rented;
}