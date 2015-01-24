package com.practicalunittesting;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class MoneyTest {

  private static final Object[] getMoney() {
    return $(
      $(10, "USD"),
      $(20, "EUR")
    );
  }

  @Test
  @Parameters(method = "getMoney")
  public void constructorShouldSetAmountAndCurrency(int amount, String currency) {
    Money money = new Money(10, "USD");

    assertEquals(10, money.getAmount());
    assertEquals("USD", money.getCurrency());
  }
}
