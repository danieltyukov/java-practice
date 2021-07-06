package inheritance;

public class Main {

  public static void main(String[] args) {
    //UIControl array to get one of each render objects
    //this is polymorphism as we insert different objects inside this array
    UIControl[] controls = { new TextBox(), new CheckBox() };
    for (var control : controls) control.render();
  }
}
