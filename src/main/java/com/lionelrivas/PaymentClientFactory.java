package com.lionelrivas;

import com.lionelrivas.d.PaymentClient;
import com.lionelrivas.exception.ClientNotFoundException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class PaymentClientFactory {

    private final Map<String, PaymentClient> CLIENT_MAP;

    public PaymentClientFactory(List<PaymentClient> clients) {
        this.CLIENT_MAP = clients.stream()
                .collect(Collectors.toMap(client -> client.getClass().getDeclaredAnnotation(Qualifier.class).value(), Function.identity()));
    }

    public PaymentClient getPaymentClient(String name) {
        if (StringUtils.isEmpty(name) || !CLIENT_MAP.containsKey(name)) {
            throw new ClientNotFoundException("No client found for " + name);
        }
        return CLIENT_MAP.get(name);
    }
}
