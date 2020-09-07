import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Deadline class Represents an Deadline task that contains a description along with the date and
 * time.
 */
public class Deadline extends Task {

    protected String deadline;

    /**
     * Constructor that takes in the deadline description and the date/time
     * @param description event description
     * @param deadline date/time of event
     */
    public Deadline(String description, String deadline) {
        super(description);
        this.deadline = deadline;
    }

    /**
     * Returns a modified string representation of the date/time
     * @return modfied string representation of the date/time
     */
    public String getTime() {
        try {
            Date d1 = new SimpleDateFormat("dd/mm/yyyy HHmm").parse(deadline);
            return new SimpleDateFormat("HH:mm, dd MMM yyyy").format(d1);
        } catch (ParseException e) {
            System.out.println("Invalid format");
            return "Invalid format";
        }
    }

    /**
     * Returns task type
     * @return "D"
     */
    public String getType() {
        return "D";
    }

    /**
     * Returns the string representation of the date/time
     * @return original string representation of date/time
     */
    public String getDeadline() { return deadline; }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + getTime() + ")";
    }
}