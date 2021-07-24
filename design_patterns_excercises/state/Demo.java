package design_patterns_excercises.state;

public class Demo {

  public static void show() {
    var service = new DirectionService(new Walking());
    service.getEta();
    service.getDirection();
  }
}
