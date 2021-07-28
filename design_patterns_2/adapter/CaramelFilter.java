package design_patterns_2.adapter;

import design_patterns_2.adapter.avaFilters.Caramel;

public class CaramelFilter implements Filter {

  private Caramel caramel;

  public CaramelFilter(Caramel caramel) {
    this.caramel = caramel;
  }

  @Override
  public void apply(Image image) {
    caramel.init();
    caramel.render(image);
  }
}
