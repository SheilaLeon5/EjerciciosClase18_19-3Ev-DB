package combo;

import control.Ejercicios;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import modelo.Equipo;

public class ComboEjemplo extends Application {

	public void start(Stage stage) throws Exception {
//
	    FXMLLoader loader = new FXMLLoader(getClass().getResource("combo.fxml"));
	    Parent root = loader.load();
	    ComboController myController = loader.getController();
	    
	    Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
	    
	    // Llamada de los m�todos del Controller
	    myController.cargarEquipos();

	}
	  public static void main(String[] args) {
		  launch(args);  
	  }

	
}
