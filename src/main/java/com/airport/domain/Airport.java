package com.airport.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Airport {
  @Id
  private long id;
  private String type, name, countryCode, region, municipality, icaoCode, iataCode;
  private Integer elevation;
  private Double lat, lng;

  public Airport() {}

  public Airport(long id, String type, String name, String countryCode, String region, String municipality, String icaoCode,
      String iataCode, int elevation, double lat, double lng) {
    this.id = id;
    this.type = type;
    this.name = name;
    this.countryCode = countryCode;
    this.region = region;
    this.municipality = municipality;
    this.icaoCode = icaoCode;
    this.iataCode = iataCode;
    this.elevation = elevation;
    this.lat = lat;
    this.lng = lng;
  }
  
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getMunicipality() {
    return municipality;
  }

  public void setMunicipality(String municipality) {
    this.municipality = municipality;
  }

  public String getIcaoCode() {
    return icaoCode;
  }

  public void setIcaoCode(String icaoCode) {
    this.icaoCode = icaoCode;
  }

  public String getIataCode() {
    return iataCode;
  }

  public void setIataCode(String iataCode) {
    this.iataCode = iataCode;
  }

  public double getLat() {
    return lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }

  public double getLng() {
    return lng;
  }

  public void setLng(double lng) {
    this.lng = lng;
  }

  public Integer getElevation() {
    return elevation;
  }

  public void setElevation(Integer elevation) {
    this.elevation = elevation;
  }

}
