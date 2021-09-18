
public class CreateEventsCalendarCommand implements Command {

	EventsCalendar eventsCalendar;
	
	public CreateEventsCalendarCommand(EventsCalendar eventsCalendar) {
		
		this.eventsCalendar=eventsCalendar;
		
	}
	
	@Override
	
	public void execute() {
		
		// TODO Auto-generated method stub
		
		eventsCalendar.create();
		
		eventsCalendar.addEvent(07);
		
		eventsCalendar.addAppointment(10);
		
	}

}
