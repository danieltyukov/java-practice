package design_patterns_excercises_2.adapter;

import design_patterns_excercises_2.adapter.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {

  private GmailClient client = new GmailClient();

  @Override
  public void downloadEmails() {
    client.connect();
    client.getEmails();
    client.disconnect();
  }
}
