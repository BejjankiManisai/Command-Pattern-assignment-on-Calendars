import java.rmi.Remote;

public class User {
	
	public static void main(String[] args) {
		
		MicrosoftTeams microsoft = new MicrosoftTeams();//microsoft command is not dependent on either EventsCalendar or Calendar
		
		EventsCalendar eventsCalendar= new EventsCalendar();
		Calendar Calendar= new Calendar();
		
		microsoft.addCommand(new CreateCalendarCommand(Calendar));
		
		microsoft.plusButton();
		
		
		microsoft.addCommand(new CreateEventsCalendarCommand(eventsCalendar));
		
		microsoft.plusButton();
		
		
		microsoft.addCommand(new DeleteCalendarCommand(Calendar));
		
		microsoft.plusButton();
		
		microsoft.addCommand(new DeleteEventsCalendarCommand(eventsCalendar));
		
		microsoft.plusButton();
	}

}
