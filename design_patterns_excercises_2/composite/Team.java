package design_patterns_excercises_2.composite;

import java.util.ArrayList;
import java.util.List;

public class Team extends Resource {

  private List<Resource> resources = new ArrayList<>();

  public void add(Resource resource) {
    resources.add(resource);
  }

  public void deploy() {
    for (var resource : resources) resource.deploy();
  }
}
