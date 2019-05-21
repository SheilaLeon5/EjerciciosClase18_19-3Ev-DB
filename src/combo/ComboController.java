package combo;

import control.BaseDatos;
import control.Ejercicios;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import modelo.Equipo;
import modelo.dao.AccesoDatos;

public class ComboController {
	@FXML
	private ComboBox<Equipo> miCombo;
	
/*	public void cargaEquipos() {
		//miCombo.getItems().clear();
		miCombo.getItems().addAll(Ejercicios.crearListaEquipos("ficheros/equipos.txt"));
		
		//miCombo.getItems().addAll(AccesoDatos.getAllTeams());
		
	}
	
*/
	
	public void muestraEquipo() {
		System.out.println("Ha seleccionado un equipo...");
		System.out.println(miCombo.getValue().getIdEquipo());
	}
	

}
