package com.lionelrivas.d;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentClient paymentClient;

    @Autowired
    public PaymentService(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    public String authorizePayment() {
        return paymentClient.authorizePayment();
    }
}
