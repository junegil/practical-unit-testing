package com.practicalunittesting.chapter5;

import lombok.Data;
import lombok.NonNull;

@Data
public class Client {

  @NonNull
  private String email;
}
