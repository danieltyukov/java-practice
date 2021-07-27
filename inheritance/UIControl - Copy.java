package inheritance;

/* An abstract class is a class that is declared abstract —it may or 
may not include abstract methods. Abstract classes cannot be instantiated, 
but they can be subclassed. When an abstract class is subclassed, 
the subclass usually provides implementations for all of the abstract 
methods in its parent class. */

//we can now only extend but NOT initiate this class
public abstract class UIControl {

  private boolean isEnabled = true;

  //  public UIControl(boolean isEnabled) {
  //    this.isEnabled = isEnabled;
  //  }

  //because this is an abstract method it must be used when the class is extended
  //e.g in CheckBox file
  public abstract void render();

  public final void enable() {
    isEnabled = true;
  }

  public void disable() {
    isEnabled = false;
  }

  public boolean isEnabled() {
    return isEnabled;
  }
}
