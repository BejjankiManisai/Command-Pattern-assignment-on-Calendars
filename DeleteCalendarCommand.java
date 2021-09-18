
public class DeleteCalendarCommand implements Command {
	
	Calendar calendar;
	
	public DeleteCalendarCommand(Calendar calendar) {
		
		this.calendar=calendar;
		
	}
	
	public void execute() {
		calendar.deleteEvent();
	}
}
