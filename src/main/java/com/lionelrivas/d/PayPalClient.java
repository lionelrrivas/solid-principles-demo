package com.lionelrivas.d;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier(value = "paypal")
public class PayPalClient implements PaymentClient {

    @Override
    public String authorizePayment() {
        return "PayPal authorization";
    }
}
