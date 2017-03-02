package model.commands.math;

import controller.Controller;
import view.visualization.Turtle;

public class PowCommand extends MathCommand {
	
	public PowCommand() {
		super();
	}

	@Override
	public double execute(double[] parameters, Turtle myTurtle, Controller view) {
		return Math.pow(parameters[0], parameters[1]);
	}
	
	@Override
	public int numParameters() {
		return 2;
	}

	@Override
	public double getReturnValue() {
		return Math.pow(this.getParameterList().get(0), this.getParameterList().get(1));
	}
}