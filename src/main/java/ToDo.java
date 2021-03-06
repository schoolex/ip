/** ToDo Class Represents a ToDo task that contains a description */
public class ToDo extends Task {

  /**
   * Constructor that takes in the task description
   *
   * @param description task description
   */
  public ToDo(String description) {
    super(description);
  }

  /**
   * Return task type
   *
   * @return "T"
   */
  public String getType() {
    return "T";
  }

  @Override
  public String toString() {
    return "[T]" + super.toString();
  }
}
