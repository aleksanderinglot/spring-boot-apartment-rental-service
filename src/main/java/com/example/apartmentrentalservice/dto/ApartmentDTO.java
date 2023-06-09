package com.example.apartmentrentalservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApartmentDTO {

    private Long id;
    private String name;
    private String address;
    private int numberOfRooms;
    private double price;
}
