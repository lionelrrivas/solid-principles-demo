package com.lionelrivas.d;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("apple-pay")
public class ApplePayClient implements PaymentClient {

    @Override
    public String authorizePayment() {
        return "ApplePay authorization";
    }
}
