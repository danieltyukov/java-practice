package design_patterns_excercises.iterator;

public interface Iterator {
  boolean hasNext();
  Product current();
  void next();
}
