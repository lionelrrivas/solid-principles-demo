package com.lionelrivas.d;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = {PaymentService.class, PayPalClient.class, ApplePayClient.class})
@ActiveProfiles("applepay")
@ExtendWith(SpringExtension.class)
class PaymentServiceTest {

    @Autowired
    PaymentService paymentService;

    @Test
    void authorizePayment() {
        assertEquals( "ApplePay authorization", paymentService.authorizePayment());
    }
}