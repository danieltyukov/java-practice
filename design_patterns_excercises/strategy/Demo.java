package design_patterns_excercises.strategy;

public class Demo {

  public static void show() {
    var client = new ChatClient(new DES());
    client.send("Hello World");
  }
}
