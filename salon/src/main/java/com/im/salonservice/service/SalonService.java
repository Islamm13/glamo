package com.im.salonservice.service;



import com.im.salonservice.modal.Salon;
import com.im.salonservice.payload.dto.SalonDTO;
import com.im.salonservice.payload.dto.UserDTO;

import java.util.List;

public interface SalonService {


    Salon createSalon(SalonDTO salon, UserDTO user);

    Salon updateSalon(Long salonId, Salon salon) throws Exception;

    List<Salon> getAllSalons();

    Salon getSalonById(Long salonId);

    Salon getSalonByOwnerId(Long ownerId);

    List<Salon> searchSalonByCity(String city);
}
