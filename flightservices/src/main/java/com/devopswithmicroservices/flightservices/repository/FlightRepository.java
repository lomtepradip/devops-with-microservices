package com.devopswithmicroservices.flightservices.repository;

import com.devopswithmicroservices.flightservices.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,Long> {
}
