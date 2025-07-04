package javafx.a1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainFx extends Application {
	
	
	private FlowPane fp;
	private TextField text;
	private Label textLabel;
	private SuperBtn btn;
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage st) throws Exception {
		this.text = new TextField("Text");
		this.textLabel = new Label("Notitzen");
		this.btn = new SuperBtn(text, textLabel);
		
		HBox inputGroup = new HBox(5, text, btn);
		VBox vBox = new VBox(5, inputGroup, textLabel);
		
		
		this.fp = new FlowPane(vBox);
		
		
		fp.setHgap(20);
		fp.setVgap(20);
		
		Scene sc = new Scene(fp, 500, 300);
		st.setScene(sc);
		st.show();

	}

}
