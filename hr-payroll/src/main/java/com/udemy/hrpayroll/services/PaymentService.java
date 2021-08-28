package com.udemy.hrpayroll.services;

import com.udemy.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 250.0, days);
    }

}
