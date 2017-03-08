package model.commands.turtle;

import model.parser.Argument;

public class SetHeadingCommand extends TurtleCommand {

	public SetHeadingCommand() {
		super();
	}
	
	@Override
	public int numParameters() {
		return 1;
	}


	@Override
	public Argument execute() {
		return new Argument(getController().getTurtleManager().setHeading(getParameter(0).getDouble()));
	}
}
