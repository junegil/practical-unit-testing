package com.practicalunittesting.chapter3;

import lombok.Data;
import lombok.NonNull;

@Data
public class Address {

  @NonNull
  private String address;
}
