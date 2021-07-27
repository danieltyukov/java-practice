package design_patterns_excercises.command;

public class UndoCommand implements Command {

  private History history;

  public UndoCommand(History history) {
    this.history = history;
  }

  @Override
  public void execute() {
    if (history.size() > 0) history.pop().undo();
  }
}
