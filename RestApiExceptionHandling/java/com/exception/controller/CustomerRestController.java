package com.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

	@GetMapping("/Customer/{customerId}")
	public String getCustomer(@PathVariable Integer customerId) {
		String lvReturn = "RAM";
		try {
			if (customerId >= 100) {
				lvReturn = "jhon";
			}else {
				lvReturn = "na";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lvReturn;
	}
}
