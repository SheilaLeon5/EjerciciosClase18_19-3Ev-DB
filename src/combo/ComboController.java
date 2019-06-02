package combo;

import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import control.BaseDatos;
import control.Ejercicios;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import modelo.Equipo;
import modelo.Jugador;
import modelo.dao.AccesoDatos;

public class ComboController implements Initializable {
	@FXML
	private ComboBox<Equipo> miCombo;
	
	@FXML
	private ListView<Jugador>  lv_jugadores;

	

	@Override
	//Breve Explicaci�n: Este m�todo se inicializa solo sin necesidad de a�adir onAction en ComboBox
	
	public void initialize(java.net.URL location, ResourceBundle resources) {

		// ----- MOSTRAR INFORMACI�N EN EL COMBOBOX  (Muestra los Equipos)----- 22/05/2019
		/*
		 * OPCI�N 1 (Fallos)
		ObservableList<Equipo> teamsList = FXCollections.observableArrayList(Ejercicios.crearListaEquipos2("ficheros/equipos.txt"));
		miCombo.setItems(teamsList);
			 
		 * OPCI�N 2
		 miCombo.getItems().addAll(Ejercicios.crearListaEquipos("ficheros/equipos.txt"));
		 
		 * OPCI�N 3 (Desde BD)
		miCombo.getItems().addAll(AccesoDatos.getListTeamsObjects("liga", "equipos"));

		 */
		miCombo.getItems().addAll(AccesoDatos.getListTeamsObjects("liga", "equipos"));
	}
	
	
	
	
	public void cargaJugadoresSegunIdEquipo() {
		int idEquipo = miCombo.getValue().getIdEquipo();
		System.out.println("Ha seleccionado el equipo... " + idEquipo);
		lv_jugadores.getItems().clear();
		lv_jugadores.getItems().addAll((AccesoDatos.getPlayersByTeams("Liga", "jugadores", idEquipo)));
		
	}
	
	
	// ----- MOSTRAR UNA LISTA DE JUGADORES SEG�N EL EQUIPO SELECCIONADO en comboBox---- 22/05/2019

	
	
	
	//https://www.javatpoint.com/java-jpasswordfield
	//miCombo.getItems().clear();

}
