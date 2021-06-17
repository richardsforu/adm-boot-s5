package com.cts.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

}
