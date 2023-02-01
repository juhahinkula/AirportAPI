package com.airport.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AirportRepository extends CrudRepository<Airport, Long> {
  Page<Airport> findAll(Pageable pagealble);
  
  List<Airport> findById(String id);

  List<Airport> findByName(String name);

  List<Airport> findByCountryCode(String countryCode);

  List<Airport> findByIataCode(String iataCode);

  List<Airport> findByIcaoCode(String icaoCode);

  List<Airport> findByType(String countryType);

}	
