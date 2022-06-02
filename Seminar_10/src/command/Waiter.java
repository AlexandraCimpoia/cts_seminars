package command;

import java.util.ArrayList;

public class Waiter {
	
	private ArrayList<iCommand> commandList = new ArrayList<iCommand>();

	public void noteCommands(iCommand c) {
		commandList.add(c);
	}
	
	public void sendCommands() {
		for(iCommand c: commandList) {
			c.process();
		}
		commandList.clear();
	}
}
