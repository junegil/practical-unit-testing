package com.practicalunittesting;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class Money {

  @Getter
  private final int amount;

  @Getter
  private final String currency;

  public Money(int amount, String currency) {
    if (amount < 0) {
      throw new IllegalArgumentException(
        "illegal amount: [" + amount + "]");
    }
    if (currency == null || currency.isEmpty()) {
      throw new IllegalArgumentException(
        "illegal currency: [" + currency + "]");
    }
    this.amount = amount;
    this.currency = currency;
  }
}
