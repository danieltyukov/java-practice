package design_patterns_2.adapter;

public class VividFilter implements Filter {

  @Override
  public void apply(Image image) {
    System.out.println("Applying Vivid Filter");
  }
}
