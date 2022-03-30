package com.lionelrivas.d;

import com.lionelrivas.PaymentClientFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentClientFactory paymentClientFactory;

    @Autowired
    public PaymentService(PaymentClientFactory factory) {
        this.paymentClientFactory = factory;
    }

    public String authorizePayment(String gateway) {
        return paymentClientFactory.getPaymentClient(gateway).authorizePayment();
    }
}
