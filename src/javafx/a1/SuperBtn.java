package javafx.a1;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SuperBtn extends Button {
	
	public SuperBtn(TextField txtField, Label label) {
		super("Click Me!");
		setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				if(txtField.getText() != "")
					label.setText(label.getText()+"\n"+txtField.getText());
					txtField.setText("");
				
			}
		});
	}
}
