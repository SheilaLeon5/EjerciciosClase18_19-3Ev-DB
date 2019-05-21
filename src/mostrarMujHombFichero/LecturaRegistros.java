package mostrarMujHombFichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaRegistros {
	int mujer = 0;
	int hombre = 0;
	public void darNumPersonasSegunSexo(String rutaFicheroClase) {
		try {
			BufferedReader fichero;
			fichero = new BufferedReader(new FileReader(rutaFicheroClase));
			String registro ;
			while ((registro =fichero.readLine() ) != null) {
				String[] campos = registro.split("#");
				String sexo = campos[4];
				
				if (sexo.compareToIgnoreCase("M")== 0) {
					mujer++;
				}else {
					hombre++;
				}
				
			}
			System.out.println("Numero total de mujeres:   " + mujer + "   Numero total de hombres: " + hombre );	
			fichero.close();
			System.out.println("Fin de la lectura del fichero");
			
		} catch (FileNotFoundException excepcion) {
			System.out.println("fichero no encontrado");

		} catch (IOException e) {
			System.out.println("IO Excepcion");
		}
	}
	
	public static void main (String[]args) {
		LecturaRegistros ejercicio = new LecturaRegistros();
		ejercicio.darNumPersonasSegunSexo("ficheros/clase.txt");
	}
	
}
