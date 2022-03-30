package com.lionelrivas.d;

import com.lionelrivas.PaymentClientFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(classes = {PaymentService.class, ApplePayClient.class, PayPalClient.class, PaymentClientFactory.class})
class PaymentServiceTest {

    @Autowired
    PaymentService paymentService;

    @Test
    void authorizePayment() {
        assertEquals( "ApplePay authorization", paymentService.authorizePayment("apple-pay"));
        assertEquals( "PayPal authorization", paymentService.authorizePayment("paypal"));
    }
}