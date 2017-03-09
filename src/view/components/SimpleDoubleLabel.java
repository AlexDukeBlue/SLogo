package view.components;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.control.Label;

/**
 * @author Jay Doherty
 *
 */
public class SimpleDoubleLabel {

	Label propertyLabel;
	String propertyName;
	ReadOnlyDoubleProperty propertyValue;
	
	public SimpleDoubleLabel(String name, ReadOnlyDoubleProperty property) {
		propertyLabel = new Label();
		propertyName = name;
		propertyValue = property;
		propertyValue.addListener(e -> this.updateLabel());
		this.updateLabel();
	}
	
	public Label getView() {
		return propertyLabel;
	}
	
	private void updateLabel() {
		propertyLabel.setText(String.format("%s%.2f", propertyName, propertyValue.get()));
	}
}
