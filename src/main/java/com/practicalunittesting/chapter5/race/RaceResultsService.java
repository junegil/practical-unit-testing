package com.practicalunittesting.chapter5.race;

import com.google.common.collect.Sets;

import java.util.Collection;

public class RaceResultsService {

  private Collection<Client> clients = Sets.newHashSet();

  public void addSubscriber(Client client) {
    clients.add(client);
  }

  public void removeSubscriber(Client client) {
    clients.remove(client);
  }

  public void send(final Message message) {
    for (Client client : clients) {
      client.receive(message);
    }
  }
}
