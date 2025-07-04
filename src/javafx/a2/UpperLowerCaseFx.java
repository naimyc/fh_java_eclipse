package javafx.a2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
//import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UpperLowerCaseFx extends Application {
//	private RadioButton upperBtn, lowerBtn;
	private TextField txtField;
	private FlowPane fp;
	private ComboBox<String> lowerUpperBtn;
	private String message = "Hello World!";
	
	
	public static void main(String[] args) {
		launch(args);
	}
	

	@Override
	public void start(Stage st) throws Exception {
		
		txtField = new TextField(message);
//		upperBtn = new RadioButton("To UpperCase");
//		lowerBtn = new RadioButton("To LowerCase");
		
		lowerUpperBtn = new ComboBox<String>();
		lowerUpperBtn.getItems().add("To UpperCase");
		lowerUpperBtn.getItems().add("To LowerCase");
		lowerUpperBtn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				String text = txtField.getText();
				if(lowerUpperBtn.getSelectionModel().getSelectedItem().equals("To UpperCase"))
					text = text.toUpperCase();
				else
					text = text.toLowerCase();
				
				txtField.setText(text);
			}
		});

		
		
		/*
		lowerBtn.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				
				if(upperBtn.isSelected())
					upperBtn.setSelected(false);

				String text = txtField.getText().toLowerCase();
				txtField.setText(text);
			}
		});
		upperBtn.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				
				if(lowerBtn.isSelected())
					lowerBtn.setSelected(false);
				
				String text = txtField.getText().toUpperCase();
				txtField.setText(text);
			}
		});
			*/
		txtField.textProperty();
		/*.addListener(
				(obs, oldTxt, newTxt)-> {
			
			if(upperBtn.isSelected()) {
				txtField.setText(newTxt.toUpperCase());
			if (!newTxt.equals(newTxt.toUpperCase())) 
					txtField.setText(newTxt.toUpperCase());
			}
			if(lowerBtn.isSelected())
				txtField.setText(newTxt.toLowerCase());
	
		}
		*/
		
		VBox v_box = new VBox(5, lowerUpperBtn);
		HBox h_box = new HBox(5, txtField, v_box);
		
		
		fp = new FlowPane(h_box);
		
		
		Scene sc = new Scene(fp, 500, 300);
		
		st.setScene(sc);
		st.show();
		
	}

}
