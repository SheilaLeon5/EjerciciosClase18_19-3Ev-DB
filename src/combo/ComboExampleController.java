package combo;

import java.net.URL;
import java.util.ResourceBundle;

import control.Ejercicios;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;
import modelo.Equipo;

public class ComboExampleController  {
	@FXML
	private ComboBox<Equipo> miCombo;

	
	public void cargaEquipos() {
		miCombo.getItems().clear();
		miCombo.getItems().addAll(Ejercicios.crearListaEquipos("ficheros/equipos.txt"));  // He tenido que poner el metodo est�tico
		
	}
	
	public void muestraEquipo() {
		
		
	}
}
