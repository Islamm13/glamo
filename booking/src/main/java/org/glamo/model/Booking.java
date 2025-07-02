package org.glamo.model;

import jakarta.persistence.*;
import lombok.*;
import org.glamo.domain.BookingStatus;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long salonId;


    private Long customerId;

    @Column(nullable = false)
    private LocalDateTime startTime;

    @Column(nullable = false)
    private LocalDateTime endTime;

    @ElementCollection
    private Set<Long> serviceIds;

    @Column(nullable = false)
    private BookingStatus status;

    private int totalPrice;


}
