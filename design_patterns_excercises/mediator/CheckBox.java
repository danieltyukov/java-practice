package design_patterns_excercises.mediator;

public class CheckBox extends UIControl {

  private boolean isChecked;

  public boolean isChecked() {
    return isChecked;
  }

  public void setChecked(boolean checked) {
    isChecked = checked;
    notifyEventHandlers();
  }
}
