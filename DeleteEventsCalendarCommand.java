
public class DeleteEventsCalendarCommand implements Command {

	EventsCalendar eventsCalendar;
	
	public DeleteEventsCalendarCommand(EventsCalendar eventsCalendar) {
		
		this.eventsCalendar=eventsCalendar;
		
	}
	
	@Override
	
	public void execute() {

		// TODO Auto-generated method stub
	
		eventsCalendar.delete();
	}

}
