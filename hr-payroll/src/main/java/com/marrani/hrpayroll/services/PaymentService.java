package com.marrani.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.marrani.hrpayroll.model.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}

}
