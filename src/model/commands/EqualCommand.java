package model.commands;

import controller.Controller;
import view.visualization.Turtle;

public class EqualCommand extends LogicCommand {

	public EqualCommand(int numParameters, String name) {
		super(numParameters, name);
	}

	@Override
	public double execute(int[] parameters, Turtle myTurtle, Controller view) {
		return super.checker(parameters[0] == parameters[1]);
	}
}
