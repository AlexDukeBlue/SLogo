package model.commands.logic;

import controller.Controller;
import parser.Argument;
import view.visualization.Turtle;

public class PenQueryCommand extends LogicCommand {

	public PenQueryCommand() {
		super();
	}
	
	public double execute(double[] parameters, Turtle myTurtle, Controller view){
		return super.booleanToInt(myTurtle.isPenDown());
	}
	
	@Override
	public int numParameters() {
		return 0;
	}

	@Override
	public Argument getReturnValue() {
		return super.booleanToInt(this.getController().getTurtle().isPenDown());
	}
}
