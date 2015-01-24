package com.practicalunittesting.chapter3;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class Client {

  @Getter
  private final List<Address> addresses = Lists.newArrayList();

  public void addAddress(final Address address) {
    this.addresses.add(address);
  }
}
