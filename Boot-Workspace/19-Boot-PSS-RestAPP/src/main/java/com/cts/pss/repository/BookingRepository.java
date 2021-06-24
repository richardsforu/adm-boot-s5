package com.cts.pss.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.pss.entity.BookingRecord;

public interface BookingRepository extends JpaRepository<BookingRecord, Integer> {
	
	List<BookingRecord> findByPassenger_MobileNumber(long mobileNumber);

}
