package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.parkingcontrol.models.ParkingSpotModel;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
  public boolean existsByCarLicensePlate(String carLicensePlate);

  public boolean existsByParkingSpotNumber(String parkingSpotNumber);

  public boolean existsByApartmentAndBlock(String apartment, String block);
}
