package com.example.ping.model;

import java.math.BigDecimal;

public record CreateTransferRequest(
    String from,
    String to,
    BigDecimal amount,
    String currency) {
}
