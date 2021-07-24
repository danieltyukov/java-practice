package design_patterns.iterator;

public interface Iterator {
  boolean hasNext();
  String current();
  void next();
}
