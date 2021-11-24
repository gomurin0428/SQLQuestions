package application;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;

public class MainController {
	
	@FXML private WebView webView;
	
	@FXML private Button button;

	public void handle(Event arg0) {
		
		webView.getEngine().load("https://www.google.co.jp/");
		
	}
}
