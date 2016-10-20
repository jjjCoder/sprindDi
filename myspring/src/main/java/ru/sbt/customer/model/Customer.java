package ru.sbt.customer.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
public class Customer {
    @Value("#{'test'.toUpperCase()}")
    private String name;

    @Value("#{priceService.getPrice()}")
    private BigDecimal amount;

    public String getName() {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
