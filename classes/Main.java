package classes;

public class Main {

  // Classes consists of fields and objects

  public static void main(String[] args) {
    // referencing the the classes and using its objects
    var textBox1 = new TextBox();
    textBox1.setText("Box 1");
    System.out.println(textBox1.text.toUpperCase());

    var textBox2 = new TextBox();
    textBox2.setText("Box 2");
    System.out.println(textBox2.text);
  }
}
