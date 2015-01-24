package com.practicalunittesting;

import lombok.Data;
import lombok.NonNull;

@Data
public class Address {

  @NonNull
  private String address;
}
