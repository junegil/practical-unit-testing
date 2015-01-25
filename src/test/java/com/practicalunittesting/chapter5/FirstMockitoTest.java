package com.practicalunittesting.chapter5;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class FirstMockitoTest {
  private Car myFerrari = mock(Car.class);

  @Test
  public void testIfCarIsACar() {
    assertTrue(myFerrari instanceof Car);
  }
}
