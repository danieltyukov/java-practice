package classes;

//public is a access modifier if toher classes can have access to this one or not
public class TextBox {

  public String text = ""; // field

  public void setText(String text) {
    this.text = text;
  } // method

  public void clear() {
    text = "";
  } // method2.0
}
