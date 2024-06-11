package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private Integer year;
    private Double price;
    private String imageUrl;
    
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
    
    private Boolean rented;
}
