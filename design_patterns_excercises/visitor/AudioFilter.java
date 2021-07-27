package design_patterns_excercises.visitor;

public interface AudioFilter {
  void apply(FormatSegment formatSegment);
  void apply(FactSegment factSegment);
}
