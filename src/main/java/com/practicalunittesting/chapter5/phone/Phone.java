package com.practicalunittesting.chapter5.phone;

import lombok.Getter;

public class Phone {

  private final String number;

  @Getter
  private final boolean mobile;

  public Phone(String number) {
    this.number = number;
    this.mobile = number.startsWith("+") && number.endsWith("9");
  }
}
