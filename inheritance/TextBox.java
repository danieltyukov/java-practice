package inheritance;

//this class therefor inherits all the features from UIControl class
public class TextBox extends UIControl {

  private String text = "";

  //  public TextBox() {
  //    super(true);
  //  }

  //Indicates that a method declaration is intended to override a
  //method declaration in a supertype.
  @Override
  public void render() {
    System.out.println("Render TextBox");
  }

  @Override
  public String toString() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void clear() {
    text = "";
  }
}
