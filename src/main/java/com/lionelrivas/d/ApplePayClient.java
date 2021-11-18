package com.lionelrivas.d;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("applepay")
public class ApplePayClient implements PaymentClient {

    @Override
    public String authorizePayment() {
        return "ApplePay authorization";
    }
}
