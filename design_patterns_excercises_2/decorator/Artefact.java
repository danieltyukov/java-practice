package design_patterns_excercises_2.decorator;

public class Artefact implements AbstractArtefact {

  private String name;

  public Artefact(String name) {
    this.name = name;
  }

  @Override
  public String render() {
    return name;
  }
}
