package com.lionelrivas.d;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {PaymentService.class, PayPalClient.class, ApplePayClient.class})
@ActiveProfiles("applepay")
//@ExtendWith(SpringExtension.class)
class PaymentServiceTest {

    @Autowired
    PaymentService paymentService;

    @Test
    void authorizePayment() {
        assertEquals( "ApplePay authorization", paymentService.authorizePayment());
    }
}