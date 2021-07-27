package interfaces;

//an interface can have multiple parents but a class can not.
public interface UIWidget extends Draggable, Resizable {
  void render();
}
