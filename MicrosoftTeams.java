
public class MicrosoftTeams {
	
	Command command;
	
	public void addCommand(Command command) {

		this.command=command;
		
	}
	
	public void plusButton() {
		
		command.execute();
		
	}
}