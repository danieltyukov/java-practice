package design_patterns_2.adapter;

import design_patterns_2.adapter.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter {

  @Override
  public void apply(Image image) {
    init();
    render(image);
  }
}
