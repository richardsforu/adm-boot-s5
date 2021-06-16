package com.cts.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{

}
