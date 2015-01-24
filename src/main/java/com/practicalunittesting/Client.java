package com.practicalunittesting;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class Client {

  @Getter
  private final List<Address> addresses = new ArrayList<>();

  public void addAddress(final Address address) {
    this.addresses.add(address);
  }
}
