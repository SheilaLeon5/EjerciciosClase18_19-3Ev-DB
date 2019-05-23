package combo;

import control.Ejercicios;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import modelo.Equipo;

public class ComboMain extends Application {

	public void start(Stage stage) throws Exception {
//
	    FXMLLoader loader = new FXMLLoader(getClass().getResource("combo.fxml"));
	    Parent root = loader.load();
	    ComboController myController = loader.getController();
	    
	    Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
	    
	    
	    
	    // Llamada de los m�todos del Controller
	    /*
	     * Explicaci�n: 
	     * 		Se utiliza la llamada al m�todo cuando NO implementamos 'Initializable'.
	     * 		Por ejemplo el c�digo que nos permite ver los equipos en el ComboBox 
	     * 		estar�a en un m�todo y ese nombre del m�todo a su vez en un OnAction del 
	     * 		comboBox y adem�s en el main haciendo la llamada.
	     * 
	     * 		myController.muestraIdEquipo();
	     */


	}
	  public static void main(String[] args) {
		  launch(args);  
	  }

	
}
