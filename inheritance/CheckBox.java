package inheritance;

//With final classes we can not extend it but only initiate it
public final class CheckBox extends UIControl {

  @Override
  public void render() {
    System.out.println("Render CheckBox");
  }
}
