package com.saample.springDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/paymentintiation/v1")
public class PaymentInitiation {
	
	@GetMapping("/beneficiary")
	public String beneficiaryValidation() {
		return "Validated";
	}

}
