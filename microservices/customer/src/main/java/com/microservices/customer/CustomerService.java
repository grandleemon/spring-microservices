package com.microservices.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
  public void registrationCustomer(CustomerRegistrationRequest request) {
    Customer customer = Customer.builder()
        .firstName(request.firstName())
        .lastname(request.lastName())
        .email(request.email())
        .build();
  }
}
