package org.glamo.payload.dto;

import lombok.Data;
import org.glamo.domain.BookingStatus;

import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BookingDTO {

    private Long id;

    private Long salonId;

    private SalonDTO salon;

    private Long customerId;

    private UserDTO customer;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private Set<Long> servicesIds;

    private Set<ServiceOfferingDTO> services;

    private BookingStatus status;

    private int totalPrice;
}
