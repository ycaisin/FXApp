package main;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class TemplateController {
	
	@FXML
	TextField inputName;
	
	public void doSomething(){
		System.out.println(inputName.getText());
	}
}
