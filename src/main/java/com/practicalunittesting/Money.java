package com.practicalunittesting;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@EqualsAndHashCode
public class Money {
  @Getter
  private final int amount;

  @Getter
  private final String currency;
}
