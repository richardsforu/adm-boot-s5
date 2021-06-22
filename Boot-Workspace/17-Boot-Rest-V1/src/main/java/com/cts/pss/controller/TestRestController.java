package com.cts.pss.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
public class TestRestController {

	@GetMapping
	public String f1() {
		return "GET MAPPING FROM TestRestController...";
	}
	
	/*
	 * 1. URL Name
	 * 2. Property/attribute Name
	 */
	
	
	@GetMapping("/byId")
	public String f6() {
		return "GET MAPPING FROM TestRestController V1";
	}
	
	@GetMapping("/{id}")
	public String f7(@PathVariable int id) {
		return "GET MAPPING FROM TestRestController V2 :: ID "+id;
	}


	@PostMapping
	public String f2() {
		return "POST MAPPING FROM TestRestController...";
	}

	@PutMapping
	public String f3() {
		return "PUT MAPPING FROM TestRestController...";
	}

	@DeleteMapping
	public String f4() {
		return "DELETE MAPPING FROM TestRestController...";
	}
	
	@PatchMapping
	public String f5() {
		return "PATCH MAPPING FROM TestRestController...";
	}

}
