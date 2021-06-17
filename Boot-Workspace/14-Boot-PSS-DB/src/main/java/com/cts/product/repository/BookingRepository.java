package com.cts.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.BookingRecord;

public interface BookingRepository extends JpaRepository<BookingRecord, Integer> {

}
