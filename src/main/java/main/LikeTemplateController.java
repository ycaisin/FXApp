package main;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LikeTemplateController {
	
	@FXML
	private Button btnLike;
	
	public void showCountOfLikes() {
		btnLike.setText(String.format("%3d Like", FXApp.counter++));
	}
}
