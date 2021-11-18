package com.lionelrivas.d;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("paypal")
public class PayPalClient implements PaymentClient {

    @Override
    public String authorizePayment() {
        return "PayPal authorization";
    }
}
