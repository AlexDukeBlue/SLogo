package model.commands;

import controller.Controller;
import view.visualization.Turtle;

public class ShowQueryCommand extends LogicCommand {

	public ShowQueryCommand(int numParameters, String name) {
		super(numParameters, name);
	}
	
	public double execute(double[] parameters, Turtle myTurtle, Controller view){
		return super.booleanToInt(myTurtle.isVisible());
	}
}
