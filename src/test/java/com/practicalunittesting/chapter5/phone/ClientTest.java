package com.practicalunittesting.chapter5.phone;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ClientTest {
  static final Phone MOBILE_PHONE = new Phone("+123456789");
  static final Phone STATIONARY_PHONE = new Phone("123123123");

  Client client = new Client();

  @Test
  public void shouldReturnTrueIfClientHasMobile() {
    client.addPhone(MOBILE_PHONE);
    client.addPhone(STATIONARY_PHONE);
    assertTrue(client.hasMobile());
  }

  @Test
  public void shouldReturnFalseIfClientHasNoMobile() {
    client.addPhone(STATIONARY_PHONE);
    assertFalse(client.hasMobile());
  }
}
