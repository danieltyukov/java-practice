package design_patterns_excercises.visitor;

public class FormatSegment extends Segment {

  @Override
  public void applyFilter(AudioFilter filter) {
    filter.apply(this);
  }
}
