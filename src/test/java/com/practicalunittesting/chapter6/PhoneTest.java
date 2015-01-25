package com.practicalunittesting.chapter6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class PhoneTest {
  Phone phone = new Phone();

  @Test
  public void shouldThrowIAEForEmptyNumber() {
    try {
      phone.setNumber(null);
      fail("Should have thrown IllegalArgumentException");
    } catch (IllegalArgumentException iae) {
      assertEquals("number can not be null or empty", iae.getMessage());
    }
  }

  @Test
  public void shouldThrowIAEForPlusPrefixedNumber() {
    try {
      phone.setNumber("+123");
      fail("Should have thrown IllegalArgumentException");
    } catch (IllegalArgumentException iae) {
      assertEquals("plus sign prefix not allowed, number: [+123]", iae.getMessage());
    }
  }
}
