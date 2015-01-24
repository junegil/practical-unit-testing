package com.practicalunittesting.chapter3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClientTest {

  private Address addressA = new Address("streetA");
  private Address addressB = new Address("streetB");
  private Client client;

  @Before
  public void setUp() {
    client = new Client();
  }

  @Test
  public void afterCreationShouldHaveNoAddress() {
    assertEquals(0, client.getAddresses().size());
  }

  @Test
  public void shouldAllowToAddAddress() {
    client.addAddress(addressA);

    assertEquals(1, client.getAddresses().size());
    assertTrue(client.getAddresses().contains(addressA));
  }

  @Test
  public void shouldAllowToAddManyAddress() {
    client.addAddress(addressA);
    client.addAddress(addressB);

    assertEquals(2, client.getAddresses().size());
    assertTrue(client.getAddresses().contains(addressA));
    assertTrue(client.getAddresses().contains(addressB));
  }
}
