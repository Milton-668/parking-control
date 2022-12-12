package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repository.ParkingSportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ParkingSpotService {

    private final ParkingSportRepository parkingSportRepository;

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpot) {
        return parkingSportRepository.save(parkingSpot);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSportRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String spotNumber) {
        return parkingSportRepository.existsByParkingSpotNumber(spotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSportRepository.existsByApartmentAndBlock(apartment, block);
    }


}
