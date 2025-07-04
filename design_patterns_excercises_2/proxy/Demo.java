package design_patterns_excercises_2.proxy;

public class Demo {

  public static void show() {
    var dbContext = new DbContext();
    var product = dbContext.getProduct(1);
    product.setName("Updated Name");
    dbContext.saveChanges();

    product.setName("Another name");
    dbContext.saveChanges();
  }
}
