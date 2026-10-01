package com.example.ping.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

public record CreateTransferResponse(
    @JsonProperty("transfer_id") String transferId,
    Status status,
    @JsonProperty("from_balance") BigDecimal fromBalance,
    @JsonProperty("to_balance") BigDecimal toBalance) {

  public enum Status {
    SUCCESS,
    PENDING,
    ERROR
  }
}
