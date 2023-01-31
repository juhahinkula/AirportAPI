package com.airport.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.airport.domain.Airport;
import com.airport.domain.AirportRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class AirportController {
  @Autowired
  private AirportRepository repository;
  
  @GetMapping("/airports")
  public ResponseEntity<Map<String, Object>> getAirports(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "100") int size) {
	try {
		List<Airport> airports = new ArrayList<Airport>();
	    Pageable paging = PageRequest.of(page, size);
	    
	    Page<Airport> pagePorts = repository.findAll(paging);
	    
	    airports = pagePorts.getContent();
	    
	    Map<String, Object> response = new HashMap<>();
	    response.put("airports", airports);
	    response.put("currentPage", pagePorts.getNumber());
	    response.put("totalItems", pagePorts.getTotalElements());
	    response.put("totalPages", pagePorts.getTotalPages());

	    return new ResponseEntity<>(response, HttpStatus.OK);
	}
	catch(Exception e) {
	    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);		
	}
  }
  
  @GetMapping("/airports/id")
  public Optional<Airport> getAirportsById(@RequestParam Long id) {
    return repository.findById(id);
  }

  @GetMapping("/airports/name")
  public Iterable<Airport> getAirportsByName(@RequestParam String name) {
    return repository.findByName(name);
  }

  @GetMapping("/airports/country")
  public Iterable<Airport> getAirportsByCountry(@RequestParam String code) {
    return repository.findByCountryCode(code);
  }

  @GetMapping("/airports/iata")
  public Iterable<Airport> getAirportsByIataCode(@RequestParam String code) {
    return repository.findByIataCode(code);
  }

  @GetMapping("/airports/gps")
  public Iterable<Airport> getAirportsByGpsCode(@RequestParam String code) {
    return repository.findByGpsCode(code);
  }

  @GetMapping("/airports/type")
  public Iterable<Airport> getAirportsByType(@RequestParam String type) {
    return repository.findByType(type);
  }

}
