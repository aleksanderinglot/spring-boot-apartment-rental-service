package com.example.apartmentrentalservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDTO {

    private Long id;
    private Long apartmentId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String guestName;
    private String guestEmail;
}
