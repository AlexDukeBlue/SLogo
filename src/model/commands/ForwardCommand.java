package model.commands;

import controller.Controller;
import utils.Point;
import view.visualization.Turtle;

public class ForwardCommand extends TurtleCommand {

	public ForwardCommand(int numParameters, String name) {
		super(numParameters, name);
	}

	public double execute(int[] parameters, Turtle myTurtle, Controller view) {
		Point loc = super.endLocation(parameters[0], myTurtle);
		view.moveTo(loc);
		return parameters[0];
	}
}
