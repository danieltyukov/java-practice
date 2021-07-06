package inheritance;

public class Main {

  public static void main(String[] args) {
    //UIControl array to get one of each render objects
    //this is polymorphism as we insert different objects inside this array
    UIControl[] controls = { new TextBox(), new CheckBox() };
    for (var control : controls) control.render();
  }
}
/* The super keyword is a reference to the base or parent class. 
We can use it to access the members (fields and methods) or call the 
constructors of the base class. In contrast, the this keyword returns 
a reference to the current object.  */
