package model.commands.logic;

import controller.Controller;
import view.visualization.Turtle;

public class AndCommand extends LogicCommand {	
	
	public AndCommand() {
		super();
	}

	@Override
	public int numParameters() {
		return 2;
	}

	@Override
	public double getReturnValue() {
		return super.booleanToInt(this.getParameterList().get(0) != 0 &&
								  this.getParameterList().get(1) != 0);
	}
}
