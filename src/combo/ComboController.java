package combo;

import control.BaseDatos;
import control.Ejercicios;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import modelo.Equipo;
import modelo.dao.AccesoDatos;

public class ComboController {
	@FXML
	private ComboBox<Equipo> miCombo;

	
	
	// ----------------------- MOSTRAR INFORMACI�N EN EL COMBOBOX  (Muestra los Equipos)----- 22/05/2019
	public void cargarEquipos() {			
		/*
		 * OPCI�N 1 (Fallos)
		ObservableList<Equipo> teamsList = FXCollections.observableArrayList(Ejercicios.crearListaEquipos2("ficheros/equipos.txt"));
		miCombo.setItems(teamsList);
			 
		 * OPCI�N 2
		 miCombo.getItems().addAll(Ejercicios.crearListaEquipos("ficheros/equipos.txt"));
		 
		 * OPCI�N 3 ( Desde BD)
		miCombo.getItems().addAll(AccesoDatos.getListTeamsObjects("liga", "equipos"));

		 */
		miCombo.getItems().addAll(AccesoDatos.getListTeamsObjects("liga", "equipos"));
		//miCombo.getItems().clear();			
	}
	

	
/*
	public void muestraEquipo() {
		System.out.println("Ha seleccionado un equipo...");
		System.out.println(miCombo.getValue().getIdEquipo());
	}
*/	

}
