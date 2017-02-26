package model.commands;

import controller.Controller;
import view.Turtle;

public class LessCommand extends LogicCommand {

	public LessCommand(int numParameters, String name) {
		super(numParameters, name);
	}

	@Override
	protected int calcValue(int[] parameters, Turtle myTurtle, Controller view) {
		return super.checker(parameters[0] == parameters[1]);
	}
}
