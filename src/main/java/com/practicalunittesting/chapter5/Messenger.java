package com.practicalunittesting.chapter5;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Messenger {
  private MailServer mailServer;
  private TemplateEngine templateEngine;

  public void sendMessage(Client client, Template template) {
    String msgContent = templateEngine.prepareMessage(template, client);
    mailServer.send(client.getEmail(), msgContent);
  }
}
