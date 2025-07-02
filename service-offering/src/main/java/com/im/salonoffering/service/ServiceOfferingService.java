package com.im.salonoffering.service;

import com.im.salonoffering.modal.ServiceOffering;
import com.im.salonoffering.payload.dto.CategoryDTO;
import com.im.salonoffering.payload.dto.SalonDTO;
import com.im.salonoffering.payload.dto.ServiceDTO;

import java.util.Set;

public interface ServiceOfferingService {


    ServiceOffering createService(
            ServiceDTO service,
            SalonDTO salon,
            CategoryDTO category
    );

    com.im.salonoffering.modal.ServiceOffering updateService(
            Long serviceId,
            ServiceOffering service
    ) throws Exception;

    Set<ServiceOffering> getAllServicesBySalonId(Long salonId,Long categoryId);

    com.im.salonoffering.modal.ServiceOffering getServiceById(Long serviceId);

    Set<ServiceOffering> getServicesByIds(Set<Long> ids);
}
