
public class CreateCalendarCommand implements Command {
	
	Calendar calendar;
	
	public CreateCalendarCommand(Calendar calendar) {
		
		this.calendar=calendar;
	}

	public void execute() {
		calendar.createEvent1();
	}
}
