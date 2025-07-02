package org.glamo.service;



import org.glamo.domain.BookingStatus;
import org.glamo.model.Booking;
import org.glamo.model.SalonReport;
import org.glamo.payload.dto.SalonDTO;
import org.glamo.payload.dto.ServiceOfferingDTO;
import org.glamo.payload.dto.UserDTO;
import org.glamo.payload.request.BookingRequest;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface BookingService {


    Booking createBooking(
            BookingRequest booking,
            UserDTO user,
            SalonDTO salon,
            Set<ServiceOfferingDTO> serviceOfferingSet) throws Exception;


    List<Booking> getBookingsByCustomer(Long customerId);


    List<Booking> getBookingsBySalon(Long salonId);


    Booking getBookingById(Long bookingId);



    Booking updateBookingStatus(Long bookingId, BookingStatus status) throws Exception;

    SalonReport getSalonReport(Long salonId);

    List<Booking> getBookingsByDate(LocalDate date,Long salonId);
}
