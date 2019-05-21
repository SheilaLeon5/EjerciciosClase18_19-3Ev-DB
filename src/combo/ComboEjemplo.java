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
	   // ComboBox<Equipo> combo_box = new ComboBox<Equipo>();
	    //combo_box.getItems().addAll(Ejercicios.crearListaEquipos2("ficheros/equipos.txt"));
	    
	    Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();

	}
	  public static void main(String[] args) {
		  launch(args);  
	  }

	
}
