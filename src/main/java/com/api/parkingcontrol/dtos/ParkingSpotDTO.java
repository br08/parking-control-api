package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ParkingSpotDTO {

  @NotBlank
  private String parkingSpotNumber;

  @NotBlank
  @Size(max = 7)
  private String carLicensePlate;

  @NotBlank
  private String carBrand;

  @NotBlank
  private String carModel;

  @NotBlank
  private String carColor;

  @NotBlank
  private String ownerName;

  @NotBlank
  private String apartment;

  @NotBlank
  private String block;

  public String getParkingSpotNumber() {
    return parkingSpotNumber;
  }

  public void setParkingSpotNumber(String parkingSpotNumber) {
    this.parkingSpotNumber = parkingSpotNumber;
  }

  public String getCarLicensePlate() {
    return carLicensePlate;
  }

  public void setCarLicensePlate(String carLicensePlate) {
    this.carLicensePlate = carLicensePlate;
  }

  public String getCarBrand() {
    return carBrand;
  }

  public void setCarBrand(String carBrand) {
    this.carBrand = carBrand;
  }

  public String getCarModel() {
    return carModel;
  }

  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }

  public String getCarColor() {
    return carColor;
  }

  public void setCarColor(String carColor) {
    this.carColor = carColor;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public String getApartment() {
    return apartment;
  }

  public void setApartment(String apartment) {
    this.apartment = apartment;
  }

  public String getBlock() {
    return block;
  }

  public void setBlock(String block) {
    this.block = block;
  }
}
