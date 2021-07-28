package design_patterns_2.facade;

public class Message {

  private String content;

  public Message(String content) {
    this.content = content;
  }

  public void extra() {
    System.out.println(content);
  }
}
