package model.commands;

import controller.Controller;
import view.visualization.Turtle;

public interface CommandInterface {

	public String toString();

	public int numParameters();
	
	public double execute(double[] parameters, Turtle myTurtle, Controller view);
}
