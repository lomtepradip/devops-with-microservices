package com.devopswithmicroservices.flightservices.controller;

import com.devopswithmicroservices.flightservices.model.Flight;
import com.devopswithmicroservices.flightservices.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    FlightRepository repo;

    @GetMapping("/flights")
    public List<Flight> getFlights() {
        return repo.findAll();

    }

}
