package com.practicalunittesting.chapter5.race;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class RaceResultsServiceTest {

  private RaceResultsService raceResults = new RaceResultsService();
  private Client clientA = mock(Client.class, "clientA");
  private Client clientB = mock(Client.class, "clientB");
  private Message message = mock(Message.class);

  @Test
  public void subscribedClientShouldReceiveMessage() {
    raceResults.addSubscriber(clientA);
    raceResults.send(message);

    verify(clientA).receive(message);
  }

  @Test
  public void messageShouldBeSentToAllSubscribedClients() {
    raceResults.addSubscriber(clientA);
    raceResults.addSubscriber(clientB);
    raceResults.send(message);

    verify(clientA).receive(message);
    verify(clientB).receive(message);
  }

  @Test
  public void notSubscribedClientShouldNotReceiveMessage() {
    raceResults.send(message);

    verify(clientA, never()).receive(message);
    verify(clientB, never()).receive(message);
  }

  @Test
  public void unsubscribedClientShouldNotReceiveMessage() {
    raceResults.addSubscriber(clientA);
    raceResults.removeSubscriber(clientA);

    raceResults.send(message);

    verify(clientA, never()).receive(message);
  }
}
