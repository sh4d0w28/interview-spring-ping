package com.example.ping;

import com.example.ping.model.CreateTransferRequest;
import com.example.ping.model.CreateTransferResponse;
import com.example.ping.model.GetTransferResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/transfers")
public class TransferController {

  @PostMapping
  public CreateTransferResponse createTransfer(@RequestBody CreateTransferRequest request) {
    // TODO: Implement transfer creation.
    return null;
  }

  @GetMapping("/{transfer_id}")
  public GetTransferResponse getTransfer(@PathVariable("transfer_id") String transferId) {
    // TODO: Implement transfer lookup.
    return null;
  }
}
