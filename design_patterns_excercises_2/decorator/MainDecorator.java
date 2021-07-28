package design_patterns_excercises_2.decorator;

public class MainDecorator implements AbstractArtefact {

  private AbstractArtefact artefact;

  public MainDecorator(AbstractArtefact artefact) {
    this.artefact = artefact;
  }

  @Override
  public String render() {
    return artefact.render() + " [Main]";
  }
}
