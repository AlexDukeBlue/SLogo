/**
 * 
 */
package model.commands.control;

import java.util.List;

import model.commands.Command;
import model.parser.Argument;

/**
 * @author Elliott Bolzan
 *
 */
public class UserCommand extends Command {
	
	private String name;
	private List<String> variableNames;
	private String expression;

	/**
	 * 
	 */
	protected UserCommand(String name, List<String> variableNames, String expression) {
		this.name = name;
		this.variableNames = variableNames;
		this.expression = expression;
	}

	@Override
	protected int internalNumParameters() {
		return variableNames.size();
	}

	@Override
	protected Argument execute() {
		int i = 0;
		for (String variableName: variableNames) {
			double realValue = getParameter(i).getDouble();
			expression = expression.replaceAll(variableName, Double.toString(realValue));
			i++;
		}
		return getParser().parseInternal(expression.trim()).evaluate();
	}
	
	protected String getName() {
		return name;
	}

}