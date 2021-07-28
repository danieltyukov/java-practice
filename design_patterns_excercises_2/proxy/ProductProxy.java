package design_patterns_excercises_2.proxy;

public class ProductProxy extends Product {

  private DbContext context;

  public ProductProxy(int id, DbContext context) {
    super(id);
    this.context = context;
  }

  @Override
  public void setName(String name) {
    super.setName(name);

    context.markAsChanged(this);
  }
}
