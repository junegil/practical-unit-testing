package com.practicalunittesting.chapter3;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;

@RunWith(JUnitParamsRunner.class)
public class MoneyIAETest {

  private static final int VALID_AMOUNT = 5;
  private static final String VALID_CURRENCY = "USD";

  private Object[] getInvalidAmount() {
    return $(
      -12387,
      -5,
      -1
    );
  }

  @Test(expected = IllegalArgumentException.class)
  @Parameters(method = "getInvalidAmount")
  public void constructorShouldThrowIAEForInvalidAmount(int invalidAmount) throws Exception {
    new Money(invalidAmount, VALID_CURRENCY);
  }

  private Object[] getInvalidCurrency() {
    return $(
      null,
      ""
    );
  }

  @Test(expected = IllegalArgumentException.class)
  @Parameters(method = "getInvalidCurrency")
  public void constructorShouldThrowIAEForInvalidCurrency(String invalidCurrency) throws Exception {
    new Money(VALID_AMOUNT, invalidCurrency);
  }
}
