package control;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import org.omg.CORBA.DataInputStream;

import modelo.Equipo;
import modelo.Estudiante;
import modelo.Jugador;
import modelo.Partido;
import modelo.Persona;

/**
 * @author sheila
 *
 */
public class Ejercicios {



	
// ---------------  04/10/2018                      ACTIVIDAD: BUSCAR EN LA API -------------------------------

/*	public void pruebasAPI() {
		
		  1. imprime por consola el valor de 2^3
		  *		- Usa la clase estática Math y su método pow  (Cuando es estático no hace falta el new)
		  *
		  *2. Imprime un valor aleatorio entre 1 y 100
		  *		- Usa la clase java.util.Random y el método rnd
		  *3. En la cadena "LAS PALMAS DE GRAN CANARIA", imprime "GRAN"
		  *		-Usa el método substring de la clase java.lang.String
		  
		
		
		
		//1.
		System.out.println("1. " + Math.pow(2, 3));
		
		//2.
		Random rnd = new Random();
		System.out.println("2. " + rnd.nextInt(100));
		
		//3.
		System.out.println("3. " + "LAS PALMAS DE GRAN CANARIA".substring(14, 18));
	}
	
	
			//ACTIVIDAD: Mostrar por consola los números comprendidos entre dos enteros, a y b 
			
					//1Parte método:. prototipo o cabecera
					public void listaIntervaloEnteros(int primero, int ultimo){
						//2Parte método: cuerpo o implementación del método
						int i=primero;
						while(i < ultimo) 
							System.out.println(++i);
							i++;
							i=i+1; 
						for (int j = primero; j <= ultimo; j++) 
							System.out.println(j++);
						
						
							// true /false
						 boolean condicion = true;
						 if (condicion) {
							 // en caso de verdadero
						 }else {
							 // la otra opción, falso
						 }
					}
			
			// ---------------- ACTIVIDAD ----------------------------------------------------- 10/10/2018
			Dado una “cadena” (String) devolver el valor en forma de número entero correspondiente. 
			Ejempo String: “ab95f1”        
			
			String cadena ="ab95f1";
			public static int converString(String cadena) {
				int numeros = Integer.parseInt(cadena);
				return numeros;
			}
			
			
			
			// ---------------- ACTIVIDAD : Serie Fibonacci --------------------------------------- 11/10/2018
			
			public static void serieFibonacci(int cuantos){
				int num1 = 0;
				int num2 = 1;
				int total = 1;
				
				System.out.print(num1 + " ," + num2);
				for (int i = 1; i < cuantos; i++) {
					total = num1 + num2;
					System.out.print(" ," + total);
					num1 = num2;
					num2 = total;
				}
			}
			
			
			// -------------- ACTIVIDAD : Factorial  (1.-Deberes Casa)-------------------------------- 11/10/2018
			
			
			public static void factorial(int numFact) {
				int num1 = 1;
				if (numFact == 0 | numFact == 1) {
					System.out.println("El factorial de " + "'"+ numFact + "'" + " es :  1");
				}else {
					for (int i = 2 ; i <= numFact; i++) {
						num1 = num1 * i; 
					}
					System.out.println("El factorial de " + "'"+ numFact + "'" + " es :" + num1);
				}
			}
			
			
			
			// ------------ ACTIVIDAD : Devolver el número menor de tres (2.-Deberes Casa)----------- 11/10/2018
			

			public static int calNumMenor(int [] numeros) {
				int numPrim = numeros[0];
				
				for (int i = 1; i < numeros.length; i++) {
					
					if( numeros[i] < numPrim) {
						numPrim =  numeros[i];
					}
				}
				return numPrim;
			}
			

			
			// ---------- ACTIVIDAD : Devolver el número menor de tres - Con 'If' (HECHO CLASE)----------- 16/10/2018
			public static int calNumMenor(int x,int y, int z) {
				if (x < y)
					if (x < z)
						return x;
					else
						return z;
				else if (y < z)
					return y;
				else
					return z;

			}
			
			
			// ---------- ACTIVIDAD : Devolver el número menor de CUATRO - Con 'If' (Extensión actividad del 16/10/2018)----------- 17/10/2018

			public int calNumMenor(int w, int x, int y, int z) {
							
			if (w < x)
				if (w < y)
					if(w < z)
						return w;
					else
						return z;
				else if (y < z)
					return y;
				else
					return z;
			
			else 
				if (x < y)
					if (x < z)
						return x;
					else
						return z;
				else if(y < z)
					return y;
				else return z;
			}

			
		// ---------------- ACTIVIDAD : Devolver el número menor de CUATRO - Con 'If' ((Ejercicicio EXACTO AL ANTERIOR--HIZO PROFESOR))
		
			public  int calNumMenor(int x, int y, int z,int w) {
							if (x < y)
								if (x < z)
									if (x < w)
										return x;
									else
										return w;
								else if (z < w)
										return z;
									else
										return w;
							else
								if(y < z)
									if(y < w)
										return y;
									else
										return w;
								else
									if (z <w)
										return z;
							return w;
						}

			
			 -----------------ACTIVIDAD: Método 'Aleatório' + Array ------------(NO MARCADO EN CLASE )---------------16/10/2018
			  Crear un método llamado aleatorio , pasándole un elemento "n". Nos devuelva un array de enteros cada 
			  posición del array tiene su contenido que es su propia posición.
			 
			  Pasos:
			    - Declarar el array e Inicializarlo
			  	 - Recorrer el array (con un bucle)
			  	 - generar un entero y ponerlo en la posicion
			  	 - devolver array
			 
			
			public int[] aleatorio(int n){
				int [] resultado= new int[n];
				for (int i = 0; i < n; i++) {
					resultado[i] = i;
				}
				return resultado;
			}

	*/
			 //-----------------ACTIVIDAD: Método Aleatório + Array -------------------------------------------------16/10/2018
			 /* Crear un método "aleatorio" , pasándole un elemento "n". Nos devuelva un array de enteros aleatorio. (1-1000)
			 
			  Pasos:
			    - Declarar el array e Inicializarlo
			  	 - Recorrer el array (con un bucle)
			  	 - generar un entero y ponerlo en la posicion
			  	 - devolver array
			  */
			 					
/*			public  int[] generaAleatorio (int n) {
				Random rnd = new Random();
				int [] resultado= new int[n];   	//Declaración e Inicialización del array
				for (int i = 0; i < n; i++) {      //Recorrer el array. Siendo 'n' la variable que nos determina el tamaño del array 'resultado'	
					if (rnd.nextInt() == 0) {
						resultado[i] = 1 + rnd.nextInt(n);
					}else {
						resultado[i] = 1 + rnd.nextInt(n);
					}
				}
					return resultado;
			}*/

/*			
			
			
		// -----------ACTIVIDAD: IMPRIME POR CONSOLA n números enteros aleatorios entre 1-100  (ENUNCIADO NUEVO,SIMILAR ANTERIOR)-- 17/10/2018
			public void imprimeAleatorio(int n) {
				Random rnd = new Random();
				int numero=0;
				for(int i = 0; i<=n; i++) {
					numero = 1 + rnd.nextInt(100);
					System.out.println(i + 1 + ".-" + numero);
				}
			}
		
		
		//-----------ACTIVIDAD: Devolver un array con 'n' numeros aleatorios entre 'inferior' y 'superior' . Entre 100 y 500
						
			public int[] generarListaAleatorios (int n, int inferior, int superior) {
				Random rnd = new Random();
				int [] numero = new int[n];
				for(int i = 0; i<n; i++) {
					numero[i]= inferior + rnd.nextInt(superior-inferior + 1);
					System.out.println(i + ".- Numeros aletorios entre: " + inferior + "-"+ superior + ":" + Arrays.toString(numero));
				}
				return null;
			}
*/				
				
		//----------ACTIVIDAD: devolver la cantidad de veces que se repiten los números en 10 veces que se genera los números aleatorios. Rango numeros 1-6	-- 18/10/2018		
			//Versión Profesor
/*			public int[] generaEstadisticaAparicion (int n, int inferior, int superior) {
				int [] resultado; // Declaración en la tabla de símbolos
				resultado = new int[superior - inferior + 1]; //inicialización
				Random rnd = new Random();
				int numero=0;
				for(int i = 0; i<=n; i++) {
					numero = inferior +  rnd.nextInt(superior - inferior + 1);
					resultado[numero - 1]++;
				}
				return resultado;	
			}
			
			// Versión Sheila.
			public int[] generaEstadisticaAparicion (int n, int inferior, int superior) {
				int [] resultado;
				resultado = new int[superior + inferior];
				Random rnd = new Random();
				int numero;
				for(int i=1 ;i<= n; i++) {
					numero	= inferior + rnd.nextInt(superior);
					resultado[numero] = resultado[numero]+1;  //Suma 1 a la cantidad que haya en la posicion del array. Se puede sustituir por lo anterior al igual y finalizado por un ++
				}
				return resultado;
			}		
			
		//---------ACTIVIDAD: crearListaPersonas [Array] (Constructor Vacío) 24/10/2018
		 * 					crear un método que devuelva una lista de 'n' personas. 
		 *		 			Se crean las personas con el constructor Persona().
		 * 
*/			public Persona[] crearListaPersona (int n){
				Persona[] personas = new Persona[n];
				for(int i=0; i < n; i++)
					personas [i] = new Persona();	
					return personas;
			}

	
	  //											25/10/2018
	 // ---------ACTIVIDAD: Dado una String pasada por parámetros mostrar por pantalla caracter a caracter el String (Método CharAt)
	 public void muestraCaracter(String caracteres){
		 for (int i = 0; i < caracteres.length(); i++) {
			System.out.println(caracteres.charAt(i));
		}
	 }
	 
	 
	 
	/* ---------ACTIVIDAD: Dan dos cadenas de caracteres por parámetros que hay que comparar entre sí (CompareTo)
	public void comparaCadenaOrdenAlf(String cadena1, String cadena2){
		if (cadena2.compareTo(cadena1) == 0) {
			System.out.println("'" + cadena1 + "'" + " es igual léxicamente que "+ "'" + cadena2 + "'");
		}else {
			if (cadena2.compareTo(cadena1)<0) {
				System.out.println("'" + cadena2 + "'" + " es mayor léxicamente que "+ "'" + cadena1 + "'");
			}else {
				System.out.println("'" + cadena1 + "'" + " es mayor léxicamente que "+ "'" + cadena2 + "'");
			}
		}	
	}
	*/


	
	/* ---------ACTIVIDAD: Hacer un método que recorra y devuleva un acumulado de ventas por vendedor. 31/10/2018

	
	public float [] resumenVendedor(float[][] ventas) {
		float sumVendedor =0;
		float [] resultado = new float[ventas.length];  //Declaración array
		for (int i = 0; i < ventas.length; i++) {
			sumVendedor = 0;
			for (int j = 0; j < ventas[i].length; j++) {  //Especificamos i porque nos encontramos en la linea i
				sumVendedor += ventas[i][j];
			}
			resultado[i] = sumVendedor;
			System.out.println("Vendedor " + i + " ha ganado: " + sumVendedor + "€" );
		}
		return resultado;		
	}
	*/
	
	
	/* ---------ACTIVIDAD: Hacer un método que recorra y devuleva un resumen de cada mes ( recorrer por columnas). 31/10/2018
		Poner nombre de meses y vendedores (String[] meses{"enero","febrero"...} , String("pepe"...)
		
	public float[] resumenMes(float[][]meses){
		String [] nombreMeses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		float [] resultado = new float[12];
		
		for (int j = 0; j < meses[0].length; j++) {
			for (int i = 0; i < meses.length; i++) {
				resultado[j] += meses[i][j];
			}
			System.out.println(nombreMeses[j] + " " + resultado[j] + "€");
		}
		return resultado;
	}
	*/	 	

	
	/*
	//-------- Extension ACTIVIDAD ANTERIOR: Mostrar nombre de los vendedores-----06/11/2018
	public void mostrarVentasVendedor(){
		String [] nombresVendedor = {"JUAN CARLOS","ISABEL","MARTA"};
		float [][] ventasYear =
			{
				// hay tres filas (vendedores) y 12 columnas (meses)	
				{12.5f,13.5f,8.5f,5.0f,10.5f,9.5f,20.5f,10.5f,4.0f,6.5f,5.5f,6.05f},
				{12.5f,13.5f,5.5f,5.0f,10.5f,4.5f,20.5f,1.5f,3.0f,6.5f,5.5f,6.05f},
				{12.5f,18.5f,8.5f,5.0f,2.5f,9.5f,20.5f,10.5f,9.0f,6.5f,5.5f,6.05f}
			};		
		float [] ventas = resumenVendedor(ventasYear);   //Hemos usado dos metodos. Aquí usamos el método "resumenVendedor"
		for (int i = 0; i < ventas.length; i++) {
			System.out.println(nombresVendedor[i] + " :" + ventas[i]);
		}	
	}
	*/
	
	
	/*---------ACTIVIDAD: Dado un array de cadenas, devolver la lista como números.---------- 06/11/2018 
						En caso de que no pueda devolver el valor -1
						El array de salida tiene el MISMO numero de elementos que el de entrada
	
	
	public int [] convierteCadenas (String[] cadenas) {
		int[] resultado = new int[cadenas.length];
		for (int i = 0; i < cadenas.length; i++) {
			try {
				resultado[i] = Integer.parseInt(cadenas[i]);
				System.out.println("Lllega aquí");
			}
			catch(NumberFormatException ex){
					resultado[i]= -1;   //devuelve -1 si no es convertible
			}
		}
		System.out.println(Arrays.toString(resultado));
		return resultado;	
	}
	
	*/
	
	
	/*-------ACTIVIDAD: Realizar un reloj ------- 07/11/2018 
				
	public void  mostrarReloj(){
		//Recorrer horas
		for (int h = 0; h < 1; h++) {
			for (int m = 0; m < 60; m++) {
				for (int s = 0; s < 60; s++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {   // objeto 'e' o 'ex' excepción es lo mismo
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(h + ":" + m + ":" + s);
				}
			}
		}

	}
	*/
	
	//---- ACTIVIDAD: Mostrar si el número es primo --------- 08/11/2018 
	/*public boolean esPrimo(int numero) {
		for (int i = 2; i < numero; i++) { 
			if (numero%i == 0) {
				return false;
			}
		}
		return true;
	}*/
	
	
	
	//-----ACTIVIDAD: Listar los números primos del 1 hasta el 300 (usando tambíen el método  'esPrimo')---------------08/11/2018
	/*public void listarPrimos(int desde , int hasta) {
		for (int i = desde; i < hasta; i++) {
			if(esPrimo(i)) {
				System.out.print(i + ", ");
			}
		}
	}
	
	
	
	
	----ACTIVIDAD: Listar  los x números primeros -----------08/11/2018  (usando tambíen el método  'esPrimo')
	public void listarPrimos2(int desde, int cuantos) {
		int contador = 0;
		while(contador < cuantos) {
			if(esPrimo(++desde)) {
				System.out.print(desde + ", ");
				contador++;
			}
		}
	}
	*/
	
	/*----ACTIVIDAD: Meter en una lista los x números primos -----------08/11/2018  (usando tambíen el método  'esPrimo')
	
	public int[] listarPrimos3(int desde, int cuantos) {
		int[]resultado = new int[cuantos];
		int contador = 0;
		while(contador < resultado.length) {
			if(esPrimo(desde)) {
				resultado[contador]=desde;
				contador++;
			}
			
			desde++;
		}
		return resultado;
	}
	*/
	
	
	//---ACTIVIDAD: Pasar una lista de números desordenados y mostrarlos ordenados 14/11/2018

		public void ordenarArray(int[] numeros) {
			for (int i = 0; i < numeros.length -1; i++) {
				for (int j = i+1; j < numeros.length; j++) {
					if(numeros[i] > numeros[j]) {
						int numComparador = numeros[i];
						 numeros[i] = numeros[j];
						 numeros[j] = numComparador;
					}
				}
			}
		}			

		
			
	//---ACTIVIDAD: Ordenar un array de cadenas  14/11/2018
			/* 	
			 *  ¿Qué devuelve compareTo?
			 * devuelve <0, entonces la cadena que llama al método es primero lexicográficamente
			 * 	devuelve == 0 entonces las dos cadenas son lexicográficamente equivalentes
			 * 	devuelve> 0, entonces el parámetro pasado al método compareTo es lexicográficamente el primero.
			 */
/*	public void ordenarCadena(String[] cadenas ) {
		for (int i = 0; i < cadenas.length -1; i++) {
			for (int j = i+1; j < cadenas.length; j++) {
				if(cadenas[i].compareTo(cadenas[j]) > 0) {
					String cadenaMayor = cadenas[i];
					cadenas[i] = cadenas[j];
					cadenas[j] = cadenaMayor;
				}
			}
		}
	}
			
*/
			
			
	//---ACTIVIDAD: Usar el método "generarListaAleatorios" y ordenar los numeros	14/11/2018 	
			/*
			 *  explicación :El método generarListaAleatorios está creado en esta misma clase
			 *  pero con unos cambios es por ello que decidí copiar y pegar con las variaciones
			 *  justo encima del método que lo va a llamar para mayor claridad.
			 */
/*				public int[] generarListaAleatorios (int n, int inferior, int superior) {
					Random rnd = new Random();
					int [] numero = new int[n];
					for(int i = 0; i<n; i++) {
						numero[i]= inferior + rnd.nextInt(superior-inferior + 1);
					}
					return numero;
				}	

			
		public void ordenarArray() {
			int[] numeros =generarListaAleatorios(5, 1, 40);
			System.out.println(Arrays.toString(numeros) + " Números aleatórios");
			for (int i = 0; i < numeros.length -1; i++) {
				for (int j = i+1; j < numeros.length; j++) {
					if(numeros[i] > numeros[j]) {
						int numComparador = numeros[i];
						 numeros[i] = numeros[j];
						 numeros[j] = numComparador;
					}
				}
			}System.out.println(Arrays.toString(numeros) + " Números aleatorios ordenados");
		}


			
			
			
	//---ACTIVIDAD: (Recorrer matriz irregular )Sumar las columnas de un matriz heterogenea o irregular  14/11/2018  
			
			//¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡HACER ACTIVIDAD!!!!!!!
			
		//recorrer matriz irregular	
/*	public int[] sumaColumnasMatrizHeterogenea(int[][]matriz) {
		int numColMax=0;
		for (int i = 0; i < matriz.length; i++) {
			if(matriz[i].length > numColMax) {
				numColMax= matriz[i].length;
			}	
		}
		int [] resultado = new int[numColMax];
		for (int j = 0; j < numColMax; j++) {
			for (int i = 0; i < matriz.length; i++) {
				resultado[j] += matriz[i][j]; 
			}
		}
		return resultado;
		
	}
		*/
	
			

		//------------------------------ TRES  PEQUEÑOS RETOS -------------------------------------------20/11/2018	
			
			
	// ---ACTIVIDAD: Invertir elementos de una lista 20/11/2018
			public void invertirLista(int[] lista) {
				int numMover;
				for (int i = 0; i < lista.length / 2; i++) {
					numMover = lista[i];
					lista[i] = lista[lista.length -i -1];
					lista[lista.length -i -1] = numMover;
				}
				//System.out.println("Lista mezclada --> " + Arrays.toString(lista));
			}
			
			
			
	//--- ACTIVIDAD: Dadas dos listas PREVIAMENTE ORDENADAS, se pide obtener la lista MEZCLADA de ambas .(Mezclar listas) 20/11/2018		
			// En esta actividad hemos llamado al método "ordenarArray".
			public int[] mezclaListaOrdenadas(int[] l1, int[] l2) {
				ordenarArray(l1);
				ordenarArray(l2);
				
				// Une listas
				int[] listaUnificada = new int[l1.length+l2.length];

				for (int i = 0; i < l1.length; i++) {
					listaUnificada[i] = l1[i]; 
				}
				
				for (int j = 0; j < l2.length; j++) {
					listaUnificada[l1.length +j] = l2[j];
				}
				
			ordenarArray(listaUnificada);
			//System.out.println( "Lista unificada --> " + Arrays.toString(listaUnificada));
			//invertirLista(listaUnificada);
			return listaUnificada;	
			}
			
			
/*			
 * 				--- ACTIVIDAD DEL PROFESOR
 * 				public int[] mezclaListaOrdenadas(int[] l1, int[] l2) {

				int[] resultado = new int[l1.length + l2.length];
				int i = 0;
				int j = 0;
				int k = 0;

				while (k < l1.length + l2.length) {
					// while (i < l1.length || j < l2.length) {
					try {
						if (l1[i] < l2[j]) {
							resultado[k] = l1[i];
							i++;
						} else {
							resultado[k] = l2[j];
							j++;
						}
						k++;
					} catch (ArrayIndexOutOfBoundsException e) {
						if (i == l1.length) // fin de l1..
							l1[--i] = Integer.MAX_VALUE;
						else
							l2[--j] = Integer.MAX_VALUE;
					}
				}
				return resultado;

			}	*/		
			
	
			
	//--- ACTIVIDAD: Dada una cadena, obtener la cadena INVIRTIENDO sus caracteres(usar charAt() o toCharArray() 20/11/2018
			//Invertir caracteres de una cadena ( Extension - hacer método saber si es palíndromo)  
			
			
			/*public String invertirCaracteres(String cadena) {
				String cadenaAlReves = new String();
				
				for (int i = cadena.length()- 1; i >= 0; i--) {
					 cadenaAlReves += cadena.charAt(i);
				}
				
				System.out.println(cadenaAlReves);
				
				return cadenaAlReves;
			}*/
				
			
			
			
			
	// --- ACTIVIDAD: Ordenar cada array de la matriz (usando el método ordenarArray) 21/11/2018		
			
			public void ordenaFilaMatriz (int[][] matriz) {
				for (int i = 0; i < matriz.length; i++) {
					this.ordenarArray(matriz[i]);
					System.out.println(Arrays.toString(matriz[i]));
				}
			}
			
	// --- ACTIVIDAD: Una vez ordenado cada arrays de la matriz ahora hay que ORDENAR TODA la matriz comparando con los array  22/11/2018
			public int[] matrizToArrayOrdenado(int[][] matriz) {
				int [] resultado = new int[0];
				for (int i = 0; i < matriz.length; i++) {
					resultado  = mezclaListaOrdenadas(resultado, matriz[i]);
				}
				return resultado;
			}
			
			
	
	/* 	--------------------------------------- EJERCICIOS -----------------------------------------	28/11/2018 
		1) Declarar en la clase "Ejercicios" un array de personas
		2) En la clase "Persona" declara un array de "Persona" que representa los hijos biológicos que tiene			
	*/		
			
			//----------ACTIVIDAD: Mostrar nombre progenitor sus padres y sus hijos-------------------------
			private Persona [] personas;          //1.- Declarar en la clase "Ejercicios" un array de persona
			
/*			public void hijosPersona() {
				//personas[0].getHijosBiologicos(); //accedemos a una persona concreta y muestra sus hijos
				
				for (int i = 0; i < personas.length; i++) {
					Persona[] hijos = personas[i].getHijosBiologicos();
					Persona padre = personas[i].getPadre();
					Persona madre = personas[i].getMadre();
					
					System.out.println("El padre de "+ personas[i].getNombre() + ": " + padre.getNombre() + ". La madre de " + personas[i].getNombre() + ":" + madre.getNombre());
					System.out.println("Progenitor -> " + personas[i].getNombre());
					if (hijos != null) {
						for (int j = 0; j < hijos.length; j++) {
							System.out.println("Hij@s --> " + hijos[j].getNombre());
						}
					}
				}
				
			}*/
			
			
			public void crearEstudiante() {
				
				Estudiante estudiante = new Estudiante("43781230V", "Pedro Garcia", 153, "20190115", 'M',"ASIR","Segundo",'M');
		        
			}
			
		
			//--------ACTIVIDAD: CREAR LISTA DE CADENAS ----------------------   18/12/2018   
			public void introListas () {
				ArrayList<String> lista;  //Declaración
				lista = new ArrayList<String>();  // Inicialización
				
				//lista.size(); // Obtener el tamaño del elemento lista
				
				
				// Tenemos tres nombres de personas pero NO tenemos objetos
				lista.add("Carlos");
				lista.add("Maria");
				lista.add("Isabel");
			}
			
			
			//--------ACTIVIDAD: CREAR LISTA DE PERSONAS ----------------------   18/12/2018   
			public void introListaPersona () {
				ArrayList<Persona> lista;  //Declaración
				lista = new ArrayList<Persona>();  // Inicialización
				
				lista.add(new Persona());
				lista.add(new Persona("45351504F", "Carlos", 14 , "20190115", 'M'));
				lista.add(new Persona());
				
				// Otra forma de añadir objeto
				Persona persona1 = new Persona();
				lista.add(persona1);
				
				
				System.out.println(lista.get(1).getNombre());

			}
			
			//--------ACTIVIDAD: AÑADIR UNA LISTA EN MEDIO DE DOS ----------------------   18/12/2018   
			public void añadirNuevaListaPersona () {
				ArrayList<Persona> listaPersona;  //Declaración
				listaPersona = new ArrayList<Persona>();  // Inicialización
				
				listaPersona.add(new Persona());
				listaPersona.add(new Persona("45351504F", "Carlos", 14 , "20190115", 'M'));
				listaPersona.add(new Persona());
				
				listaPersona.add(1, new Persona("45378504F", "Paco", 14 , "20190115", 'M'));  // Mover 'Paco' posicion 1
				listaPersona.remove(0);  //Borrar el elemento de la primera posición
				
				System.out.println(listaPersona.get(1).getNombre());

			}
			
			
			//--------ACTIVIDAD:  ----------------------   08/1/2019
			/*
			 * Buscar en API JAVA:
			 * 		CLASES --> HashMap / ArrayList
			 * 			Ver Métodos: Constructors, put, add, get
			 */
			
			
			
			//-------HACIENDO PRUEBAS: AÑADIENDO DISTINTOS TIPOS DE DATOS LISTA ----------------------   08/01/2019   
			public void introduccionListas() {
				ArrayList<Object> listaGenerica = new ArrayList();
				listaGenerica = new ArrayList<Object>();  // Inicialización
				
				listaGenerica.add("Gran Canaria");
				listaGenerica.add(new Persona());
				listaGenerica.add(123);
				listaGenerica.add(Math.PI);
				listaGenerica.add(123.5f);
				listaGenerica.add(new Persona());
			
				for(Object elemento: listaGenerica) {
					System.out.println(elemento);
				}
				
				
			}
			
			//--------ACTIVIDAD: PRIMEROS PASOS MAPAS  ----------------------   09/1/2019
			/*			Declarar un mapa e inicializar (hashmap) 
			 * 			que almacena objetos de la clase Estudiante. 
			 * 			La clave es el nif.
			 */
			
			public void introMapas() {
				
				
				Estudiante estudiante1 = new Estudiante();
				Estudiante estudiante2 = new Estudiante("47474725y", "Pepa", 8, "20190115", 'F',"ASIR","Segundo",'M');
				HashMap<String, Estudiante> mapa = new HashMap<String ,Estudiante>();
				
				
				// Maneras de añadir objetos(estudiantes) al mapa
				mapa.put(estudiante1.getNif() , estudiante1);
				mapa.put(estudiante2.getNif() , new Estudiante("47474725y", "Pepa", 8, "20190115", 'F',"ASIR","Segundo",'M'));
				mapa.put("3" , new Estudiante("3", "Maria",135, "20190115", 'F',"ASIR","Segundo",'M'));
				mapa.put("001" , new Estudiante("001", "Isabel",135, "20190115", 'F',"ASIR","Segundo",'M'));
				//mapa.put("001" , null);  // Al ser una clave duplicada 'machaca' la anterior
				mapa.put("12345678F" , new Estudiante());
				//mapa.put("47474725y" , null);
				
				
				if (!mapa.containsKey("3")) {
					mapa.put("3", null);
				}
				
				
				
				//RECORRER UN MAPA (sin tener en cuenta orden)
				Set<String> clavesMapa = mapa.keySet();
				for(String clave : clavesMapa) {
					System.out.println(mapa.get(clave).getNombre());
				}
				
				System.out.println("fin mapa");
				
				
				
				// --- Consultas ---
				/**/
				System.out.println(mapa); // contenido del mapa
				//System.out.println(mapa.size()); // Tamaño del mapa
				//System.out.println (mapa.keySet ());  // Muestra el contenido de las claves (key)
				
			}
			
			//--------ACTIVIDAD: Leer un fichero ----------- 10/1/2019
			
/*			public void leerfichero(String rutafichero) {
			   try {	
				BufferedReader fichero;  //objeto de la clase BufferedReader : nos permitirá realizar ciertas acciones (leer,escribir..)	
				   FileReader f = new FileReader(rutafichero);
				   fichero = new BufferedReader(f);
				   
				   
				   String registro = fichero.readLine(); // leer linea por linea. Devuelve una string
				   while(registro != null){
					   System.out.println(registro);
					   registro = fichero.readLine();
				   }
				   fichero.close();
				   System.out.println("fin de la lectura");
				   
			   } catch (FileNotFoundException e) {
				   System.out.println("fichero no se encuentra");
			   } catch (IOException e) {			   
				   System.out.println("IO Excepcion");
			   	}
			}
			*/
			
			
			// --------------- OPCIÓN CORTA -----------
			public void leerFichero(String rutaFichero) {
				try {
					BufferedReader fichero;
					fichero = new BufferedReader(new FileReader(rutaFichero));
					String registro ;
					while ((registro =fichero.readLine() ) != null) {
						System.out.println(registro);
					}
					fichero.close();
					System.out.println("Fin de la lectura del fichero");
					
				} catch (FileNotFoundException excepcion) {
					System.out.println("fichero no encontrado");

				} catch (IOException e) {
					System.out.println("IO Excepcion");
				}		
			}
			 
			
			//--------ACTIVIDAD: Devuelve una lista de objetos de la clase Persona  ----------------------   15/01/2019
			
			public ArrayList<Persona> creaListaPersonasDesdeFichero(String rutaFichero, String separador) {
				try {
					BufferedReader fichero;
					fichero = new BufferedReader(new FileReader(rutaFichero));
					ArrayList<Persona> listaPersonas;   // Creamos un objeto de la clase ArrayList de Persona. (Existe objeto pero está a null) --Declaración
					listaPersonas = new ArrayList<Persona>(); // --- inicialización
					String registro ;
					Persona persona;
					while ((registro=fichero.readLine() ) != null) {
						String [] campos = registro.split(separador);  // romper cadena
						for (int i = 0; i < campos.length; i++) {
							System.out.print(campos[i] + " ,");
							System.out.println("");
							
							// crear objeto de la clase Persona
							// Añadirlo a la lista Persona
							//listaPersonas.add(new Persona(campos[0], campos[1], Integer.parseInt(campos[2]), campos[3], campos[4].charAt(0)));
						}
						persona = new Persona(campos[0], campos[1], Integer.parseInt(campos[2]), campos[3], campos[4].charAt(0));
						listaPersonas.add(persona);
					}
					fichero.close();
					System.out.println("Creada la lista de personas..");
					return listaPersonas;
					
				} catch (FileNotFoundException excepcion) {
					System.out.println("fichero no encontrado");

				} catch (IOException e) {
					System.out.println("IO Excepcion");
				}
				return null;		
			}
			
			
			
			
			
			// --------ACTIVIDAD: Comprobar partidos.txt ------------------------------------------------------- 22/01/2019
			
			public HashMap<String, Integer> comprobarPartidos(String rutaFichero) {
				try {
					
					HashMap<String, Integer> mapaEquipos = new HashMap<String, Integer>();  //Declaracion e inicializacion Mapa
					// Declaramos e inicializamos fichero partidos
					BufferedReader fichero;
					fichero = new BufferedReader(new FileReader(rutaFichero));
					
					String registro;
					int conta =0;
					int contador =0;
					while ((registro = fichero.readLine()) != null) {
						conta++;
						// Romper cadena para obtener los datos
						String [] campos = registro.split("#");
						
						
						// SABER EQUIPOS: añadir valores en mapa
						for (int i = 2; i<=4 ; i+=2) {
							if (!mapaEquipos.containsKey(campos[i])) {  //Si el equipo (key) no está en el mapa se guardará
								mapaEquipos.put(campos[i], 1);	
							}else {
								mapaEquipos.merge(campos[i], 1,Integer::sum);
							}
						}
					}
					
					Set<String> clavesMapa = mapaEquipos.keySet(); // Recorrer mapa
						for(String clave : clavesMapa) {
							System.out.println(contador++ + ".- " + mapaEquipos.get(clave));
						}	
					fichero.close();
					System.out.println("hay "+ conta + " partidos");
					System.out.println("Fin de la lectura del fichero");
					return mapaEquipos;

				} catch (FileNotFoundException excepcion) {
					System.out.println("fichero no encontrado");

				} catch (IOException e) {
					System.out.println("IO Excepcion");
				}
				return null;
			}
			
			
			
			
			
			/*// --------ACTIVIDAD: Obtener un ArrayList de todos los equipos  ------------------------------------------------------- 23/01/2019
			
			public ArrayList<Equipo> creaListaEquipos(String rutaFichero){
					try {
						BufferedReader fichero;
						fichero = new BufferedReader(new FileReader(rutaFichero));
						
						String registro ;
						Equipo equipo;
						
						ArrayList<Equipo> listaNombreEquipos;
						listaNombreEquipos = new ArrayList<Equipo>();
						
						
						while ((registro =fichero.readLine() ) != null) {
							String [] campos = registro.split("#");
							equipo = new Equipo(Integer.parseInt(campos[0]), campos[1], campos[2]);
							listaNombreEquipos.add(equipo);
						}
						
						System.out.println(listaNombreEquipos);
						
						fichero.close();
						System.out.println("Fin de la lectura del fichero");
						return listaNombreEquipos;
						
					} catch (FileNotFoundException excepcion) {
						System.out.println("fichero no encontrado");

					} catch (IOException e) {
						System.out.println("IO Excepcion");
					}
					return null;		

			}*/
			
			
			
			
			// --------ACTIVIDAD: Obtener un Hashmap de todos los equipos  ------------------------------------------------------- 23/01/2019
			public HashMap<String, Equipo> crearMapaEquipos(String rutaFichero){
				try {
					BufferedReader fichero;
					fichero = new BufferedReader(new FileReader(rutaFichero));
					
					String registro ;
					Equipo equipo = null;
					
					HashMap<String, Equipo> listaNombreEquipos = new HashMap<String, Equipo>();
					
					
					while ((registro =fichero.readLine() ) != null) {
						String [] campos = registro.split("#");
						equipo = new Equipo(Integer.parseInt(campos[0]), campos[1], campos[2]);
						listaNombreEquipos.put(campos[1],equipo);

					}
					
					//System.out.println(listaNombreEquipos);
					
					fichero.close();
					System.out.println("Fin de la lectura del fichero");
					return listaNombreEquipos;
					
				} catch (FileNotFoundException excepcion) {
					System.out.println("fichero no encontrado");

				} catch (IOException e) {
					System.out.println("IO Excepcion");
				}		
			return null;
		}
			
			
		
		
			// --------ACTIVIDAD: Detectar cuantos partidos se han jugado  ------------------------------------------------------- 23/01/2019	
				/*
				 *	Recorrer el fichero partido.txt hasta que se encuentre el partido NO JUGADO(donde no haya numeros en donde deberian estar los goles.
				 */
				
			public void mostrarNumeroPartidosJugados(String rutaPartidos) {
				try {
					BufferedReader fichero;
					fichero = new BufferedReader(new FileReader(rutaPartidos));
					String registro ;
					int contador =0;
					while ((registro =fichero.readLine() ) != null) {

						String [] campos = registro.split("#");
						if (!campos[3].equals("")){
							Integer.parseInt(campos[3]);
							contador++;
						}else {
							break;
						}
					}
					fichero.close();
					System.out.println(contador + " partidos jugados");
					System.out.println("Fin de la lectura del fichero");
					
				} catch (FileNotFoundException excepcion) {
					System.out.println("fichero no encontrado");

				} catch (IOException e) {
					System.out.println("IO Excepcion");
				}	
			}
			
			
			// --------ACTIVIDAD: Detectar cuantos partidos se han jugado (VERSION TRY/CATCH)  ------------------------------------------------------- 24/01/2019	
			/*
			 *	Recorrer el fichero partido.txt hasta que se encuentre el partido NO JUGADO(donde no haya numeros en donde deberian estar los goles.
			 */
			
			public void mostrarNumeroPartidosJugadosTry(String rutaPartidos) {
				
				BufferedReader fichero;
				int contador =0;
				try {
					fichero = new BufferedReader(new FileReader(rutaPartidos));
					String registro;

					while ((registro =fichero.readLine() ) != null) {
						String [] campos = registro.split("#");	
						try {
							Integer.parseInt(campos[3]);
							contador++;
						} catch (NumberFormatException e) {
							break;
						}		
					}
					fichero.close();
					System.out.println(contador + " partidos jugados");
					System.out.println("Fin de la lectura del fichero");
					
				} catch (FileNotFoundException excepcion) {
					System.out.println("fichero no encontrado");

				} catch (IOException e) {
					System.out.println("IO Excepcion");
				}
			}
			
			
			
			
			
			// --------ACTIVIDAD: Crear un método que devuelva Victorias, empates y derrotas por cada equipo  --------------------------------- 24/01/2019	
			// VERSION SHEILA1
/*			public HashMap<String, ArrayList<Integer>> resultadosEquipos(String rutaFichero) {
				try {

					HashMap<String, ArrayList<Integer>> mapaEquipos = new HashMap<String,ArrayList<Integer>>();  
					BufferedReader fichero = new BufferedReader(new FileReader(rutaFichero));
					
					String registro;
					int contador =0;
					int puntosL;
					int puntosV;
					
					while ((registro = fichero.readLine()) != null) {
						String [] campos = registro.split("#");
						if (campos[3].equals("")) {
							break;
						}
						
						//Declaracion e inicializacion ArrayList a 0,0,0 
						
						for (int i = 2; i <=4; i+=2) {
							if (!mapaEquipos.containsKey(campos[i])) { 
								mapaEquipos.put(campos[i], new ArrayList<Integer>(Arrays.asList(0,0,0))); //asList permite inicializar un arrayList
							}
						}
							
						// Saber  VICTORIA / EMPATE / DERROTA y recoger el valor
						
							ArrayList<Integer> equipoLocal = mapaEquipos.get(campos[2]); // devuelve valor de la clave
							ArrayList<Integer> equipoVisitante = mapaEquipos.get(campos[4]);
						
							// Gana equipoLocal
							if(campos[3].compareTo(campos[5]) >0) {
								puntosL = equipoLocal.get(0);
								equipoLocal.set(0, puntosL + 1);
								
								puntosV = equipoVisitante.get(2);
								equipoVisitante.set(2, puntosV + 1);
								
								
							// Gana equipoVisitante	
							}
							if (campos[3].compareTo(campos[5]) < 0) {
								puntosV = equipoVisitante.get(0);
								equipoVisitante.set(0, puntosV + 1);
								
								puntosL = equipoLocal.get(2);
								equipoLocal.set(2, puntosL + 1);
								
							}
							// Empate
							if(campos[3].equals(campos[5])){
								//Especificar la clave para añadir el nuevo valor del arrayList a cada una de ellas
								puntosL = equipoLocal.get(1);    // get: devuelve valor de la posicon 1 arrayList('empate') 
								equipoLocal.set(1,puntosL+1);       //(1 : indice posicion , 1: incrementa en uno)
								
								puntosV = equipoVisitante.get(1);
								equipoVisitante.set(1,puntosV+1);
							}
					}
					
					Set<String> clavesMapa = mapaEquipos.keySet(); // Devuelve las claves del mapa
					for(String clave : clavesMapa) {
						System.out.println(contador++ + ".- " +  clave + mapaEquipos.get(clave)); //  get: Devuelve el valor de la clave especificada
					}
					
					fichero.close();
					System.out.println("Fin de la lectura del fichero");
					return mapaEquipos;
					
						}catch (FileNotFoundException excepcion) {
							System.out.println("fichero no encontrado");
							}catch (IOException e){
								System.out.println("IO Excepcion");
							}
							return null;
			}
			*/

/*
			public HashMap<String, ArrayList<Integer>> resultadosEquipos(String rutaPartidos)
			// devuelve un mapa de equipos
			// por cada equipo hay una lista de contadores
			// que representan VICTORIAS, EMPATES Y DERROTAS.
			{
				try {
					int contador= 1;
					BufferedReader fichero;
					fichero = new BufferedReader(new FileReader(rutaPartidos));
					String registro;
					HashMap<String, ArrayList<Integer>> equipos = new HashMap<String, ArrayList<Integer>>();
					while ((registro = fichero.readLine()) != null) {
						String[] campos = registro.split("#");
						if (campos[3].equals("")) // ultimo partido jugado..
							break;
						String eL = campos[2];
						String gL = campos[3];
						String eV = campos[4];
						String gV = campos[5];

						// gracias Byron..!!
						// si no existe eL, eV lo añadimos al mapa..

						if (!equipos.containsKey(eL))
							equipos.put(eL, new ArrayList<Integer>(Arrays.asList(0, 0, 0)));

						if (!equipos.containsKey(eV))
							equipos.put(eV, new ArrayList<Integer>(Arrays.asList(0, 0, 0)));

						// cual fue el resultado ..?

						if (gL.compareTo(gV) > 0) {// gana Local
							equipos.get(eL).set(0, equipos.get(eL).get(0) + 1);
							equipos.get(eV).set(2, equipos.get(eV).get(2) + 1);

						} else if (gL.compareTo(gV) < 0) // gana Visitante
						{// gana Local
							equipos.get(eL).set(2, equipos.get(eL).get(2) + 1);
							equipos.get(eV).set(0, equipos.get(eV).get(0) + 1);
						} else { // empate

							equipos.get(eL).set(1, equipos.get(eL).get(1) + 1);
							equipos.get(eV).set(1, equipos.get(eV).get(1) + 1);
						}

					}
					fichero.close();
					System.out.println("Fin de la lectura del fichero");
					return equipos;

				} catch (FileNotFoundException excepcion) {
					System.out.println("fichero no encontrado");

				} catch (IOException e) {
					System.out.println("IO Excepcion");
				}
				return null;
		}*/
			
		

			// --------ACTIVIDAD: Crear un método que calcule los puntos de los Equipos  --------------------------------- 30/01/2019
			
			/*
			 *  Lo que haremos es pasarle como parámetro lo que devuelve el método 'resultadosEquipos'
			 */
			
			/* VERSION SHEILA1			
			public void muestraPuntosEquipos (HashMap<String, ArrayList<Integer>> resultados) {
				for (String clave : resultados.keySet()) {
					int resultadoLiga = resultados.get(clave).get(0)*3 + resultados.get(clave).get(1)*1;
					System.out.println(clave + "   --> " + resultadoLiga);
				}
				
			}*/
			
			
			public void muestraPuntosEquipos (HashMap<String, ArrayList<Integer>> resultados) {
			
				// recorrer el HashMap... 
				// obtenemos la lista de claves (K)			
				for (String clave : resultados.keySet()) {
					ArrayList<Integer> datos = resultados.get(clave);
					int puntos = datos.get(0)*3 + datos.get(1);
					//System.out.println(clave + " => " + puntos);
				}
			}
			
			
			// --------ACTIVIDAD: Mostrar en una ventana los equipos usados en el fichero Equipos - SWING--------------------------------- 30/01/2019
			
			public void pruebaSWING() {
				JFrame ventana;
				ventana = new JFrame("Mi primer SWING");
				JButton boton= new JButton("Pulsame!");
				JPanel panel = new JPanel();
				ventana.add(panel);
				
				
				ArrayList<Equipo> equipos = this.creaListaEquipos("ficheros/equipos.txt");
				Equipo[] arrayEquipos = equipos.toArray(new Equipo[equipos.size()]);
				
				JComboBox lista = new JComboBox(arrayEquipos);
				panel.add(lista);
				panel.add(boton);
				boton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.out.println("Me has pulsado");
					}
				});
				ventana.pack();
				ventana.setVisible(true);
			}

			
			
			
			
			// --------ACTIVIDAD: Devolver HashMap con la puntuacion de equipos  --------------------------------- 05/02/2019
			public HashMap<String, Integer> generaPuntosEquipos(HashMap<String, ArrayList<Integer>> mapaPartidosGEP){
				HashMap<String, Integer> resultado = new HashMap<String,Integer>();
				for (String clave : mapaPartidosGEP.keySet()) {
					ArrayList<Integer> datos = mapaPartidosGEP.get(clave);
					int puntos = datos.get(2)*3 + datos.get(3);  // Modificado para el método creaClasificacion
					resultado.put(clave, puntos);
					//System.out.println(clave + " -> "  +puntos);
				}
				return resultado;
			}
			
			
			
			// --------ACTIVIDAD: Ordenar HashMap   --------------------------------- 05/02/2019
			public void ordenarMapaPuntosEquipos(HashMap<String,Integer> mapaPuntosEquipos){
				
				Set<Entry<String, Integer>> set = mapaPuntosEquipos.entrySet();   // entrySet --> Vista conjunta del mapa
		        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>(){
		            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 ){
		            	return (o2.getValue()).compareTo( o1.getValue() );
		            }
		        } );
		        for(Map.Entry<String, Integer> entry:list){
		            System.out.println(entry.getKey()+" ==== "+entry.getValue());
		        }
			}
			
			
			
			// --------ACTIVIDAD: listado ordenado por equipos--------------------------------- 06/02/2019
			
			/*
			 * Obtener un arrayList ordenada por nombre LARGO, apartir de la lista obtenida en el método creaListaEquipos
			 */
			
			
			public ArrayList<Equipo> equiposListaOrdenadaNombre(String rutafichero){
				 ArrayList<Equipo> lista = creaListaEquipos("ficheros/equipos.txt");
				 lista.sort(new Comparator<Equipo>() {

					@Override
					public int compare(Equipo eq1, Equipo eq2) {
						return eq1.getNombre().compareToIgnoreCase(eq2.getNombre());
					}
				});
				 System.out.println(lista);
				return lista;
			}
	
			
			
			
			// --------ACTIVIDAD: listado ordenado por identificador--------------------------------- 06/02/2019
			
			/*
			 * Obtener un arrayList mediante el id, apartir de la lista obtenida en el método creaListaEquipos.
			 * Es decir nos mostrará nos nombres largos ordenados por id
			 */
			
			
			public ArrayList<Equipo> equiposListaOrdenadaIdentificador(String rutafichero){
				 ArrayList<Equipo> lista = creaListaEquipos("ficheros/equipos.txt");
/*				 lista.sort(new Comparator<Equipo>() {

					@Override
					public int compare(Equipo id2, Equipo id1) {
						if (id1.getIdEquipo() > id2.getIdEquipo()) {
							return 1;  // Devolvemos un número positivo
							
						}else if(id1.getIdEquipo() < id2.getIdEquipo()) {
							return -1;
						 }	
						else {
							return 0;
						}
					}
				});
*/
				 lista.sort(null);
				// System.out.println(lista);
				return lista;
			}



			
			
			// --------ACTIVIDAD: Crearemos la clasificacion con información extra de cada equipo --------------------------------- 07/02/2019
			/*
			 * Mostrar:
			 * - nombre largo
			 * - partidos jugados
			 * - goles a favor
			 * - goles en contra
			 * 
			 */
			public HashMap<String, ArrayList<Integer>> creaClasificacion(String rutaFichero) {
				try {

					HashMap<String, ArrayList<Integer>> mapaEquipos = new HashMap<String,ArrayList<Integer>>();  
					BufferedReader fichero = new BufferedReader(new FileReader(rutaFichero));

					// HashMap de otro método ( nos facilita el nombre corto/largo) 
					HashMap<String, Equipo> mapNombreEquipos = crearMapaEquipos("ficheros/equipos.txt");
					
					// HashMap<String, Integer>  de otro método 
					
					
					
					String registro;
					int contador =0;
					int puntosL;
					int puntosV;
					int partidosJ;
					int golesFavor;
					int golesContra = 0;
					
												
						while ((registro = fichero.readLine()) != null) {
							String [] campos = registro.split("#");
							if (campos[3].equals("")) {
								break;
							}
							
							//Declaracion e inicializacion ArrayList a 0,0,0 
							for (int i = 2; i <=4; i+=2) {
								if (!mapaEquipos.containsKey(mapNombreEquipos.get(campos[i]).getNombre())) { 
									Equipo nombreEquipoObjCompleto = mapNombreEquipos.get(campos[i]);
									String nombreEquipoComp = nombreEquipoObjCompleto.getNombre();  
									mapaEquipos.put(nombreEquipoComp, new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0)));
								}
							}
								
							// Saber  VICTORIA / EMPATE / DERROTA y recoger el valor
							
							ArrayList<Integer> equipoLocal = mapaEquipos.get(mapNombreEquipos.get(campos[2]).getNombre()); // devuelve valor de la clave
							ArrayList<Integer> equipoVisitante = mapaEquipos.get(mapNombreEquipos.get(campos[4]).getNombre());
								

								// Gana equipoLocal
							if(campos[3].compareTo(campos[5]) >0) {
								puntosL = equipoLocal.get(2);
								equipoLocal.set(2, puntosL + 1);
								partidosJ= equipoLocal.get(1);
								equipoLocal.set(1, partidosJ + 1);
								golesFavor = equipoLocal.get(5);
								equipoLocal.set(5, Integer.parseInt(campos[3]) + golesFavor);
								
								golesContra = equipoLocal.get(6);
								equipoLocal.set(6, golesContra + Integer.parseInt(campos[5]));
								
								
								
								
								
								puntosV = equipoVisitante.get(4);
								equipoVisitante.set(4, puntosV + 1);
								partidosJ= equipoVisitante.get(1);
								equipoVisitante.set(1, partidosJ + 1);
								golesFavor = equipoVisitante.get(5);
								equipoVisitante.set(5, Integer.parseInt(campos[5]) + golesFavor);
								
								golesContra = equipoVisitante.get(6);
								equipoVisitante.set(6, golesContra + Integer.parseInt(campos[3]));
							}
							
								// Gana equipoVisitante	
							if (campos[3].compareTo(campos[5]) < 0) {
								puntosV = equipoVisitante.get(2);
								equipoVisitante.set(2, puntosV + 1);
								partidosJ= equipoVisitante.get(1);
								equipoVisitante.set(1, partidosJ + 1);
								golesFavor = equipoVisitante.get(5);
								equipoVisitante.set(5, Integer.parseInt(campos[5]) + golesFavor);
								
								golesContra = equipoVisitante.get(6);
								equipoVisitante.set(6, golesContra + Integer.parseInt(campos[3]));
								
								

								puntosL = equipoLocal.get(4);
								equipoLocal.set(4, puntosL + 1);
								partidosJ= equipoLocal.get(1);
								equipoLocal.set(1, partidosJ + 1);
								golesFavor = equipoLocal.get(5);
								equipoLocal.set(5, Integer.parseInt(campos[3]) + golesFavor);
								
								golesContra = equipoLocal.get(6);
								equipoLocal.set(6, golesContra + Integer.parseInt(campos[5]));
							}
							
							// Empate
							if(campos[3].equals(campos[5])){
							//Especificar la clave para añadir el nuevo valor del arrayList a cada una de ellas

								puntosL = equipoLocal.get(3);    // get: devuelve valor de la posicon 1 arrayList('empate') 
								equipoLocal.set(3,puntosL+1);       //(1 : indice posicion , 1: incrementa en uno)
								partidosJ= equipoLocal.get(1);
								equipoLocal.set(1, partidosJ + 1);
								golesFavor = equipoLocal.get(5);
								equipoLocal.set(5, Integer.parseInt(campos[3]) + golesFavor);
								
								golesContra = equipoLocal.get(6);
								equipoLocal.set(6, golesContra + Integer.parseInt(campos[5]));
								
								

								puntosV = equipoVisitante.get(3);
								equipoVisitante.set(3,puntosV+1);
								partidosJ= equipoVisitante.get(1);
								equipoVisitante.set(1, partidosJ + 1);
								golesFavor = equipoVisitante.get(5);
								equipoVisitante.set(5, Integer.parseInt(campos[5]) + golesFavor);
								
								golesContra = equipoVisitante.get(6);
								equipoVisitante.set(6, golesContra + Integer.parseInt(campos[3]));
							}
						}

					Set<String> clavesMapa = mapaEquipos.keySet(); // Devuelve las claves del mapa
					for(String clave : mapaEquipos.keySet()) {
						ArrayList<Integer> datos = mapaEquipos.get(clave);
  						datos.set(0, datos.get(2)*3 + datos.get(3));
						//System.out.println(contador++ + ".- " +  clave + mapaEquipos.get(clave)); //  get: Devuelve el valor de la clave especificada
					}
					
					fichero.close();
					System.out.println("Fin de la lectura del fichero");
					return mapaEquipos;
					
				}catch (FileNotFoundException excepcion) {
					System.out.println("fichero no encontrado");
				}catch (IOException e){
					System.out.println("IO Excepcion");
				}
					return null;
			}	

		
			
			// --------ACTIVIDAD: Ordenar HashMap de clasificacion   --------------------------------- 12/02/2019
			public void ordenarMapaPuntosEquipos2(HashMap<String,ArrayList<Integer>> mapaPuntosEquipos){
				
				Set<Entry<String, ArrayList<Integer>>> set = mapaPuntosEquipos.entrySet();   // entrySet --> Vista conjunta del mapa
		        List<Entry<String, ArrayList<Integer>>> list = new ArrayList<Entry<String, ArrayList<Integer>>>(set);
		        Collections.sort( list, new Comparator<Map.Entry<String, ArrayList<Integer>>>(){
		            public int compare( Map.Entry<String, ArrayList<Integer>> o1, Map.Entry<String, ArrayList<Integer>> o2 ){
		            	//return (o2.getValue()).compareTo( o1.getValue() );
		            	return (o2.getValue().get(2).compareTo(o1.getValue().get(2)));
		            }
		        } );
		        for(Map.Entry<String, ArrayList<Integer>> entry:list){
		            System.out.println(entry.getKey()+" => "+entry.getValue());
		        }
			}	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			// --------ACTIVIDAD: Obtener un ArrayList de todos los equipos (MODIFICADO PARA EL MÉTODO: generaClasificacion  ------------------------------------------------------- 13/02/2019
			
			public ArrayList<Equipo> creaListaEquipos(String rutaFichero){
					try {
						BufferedReader fichero;
						fichero = new BufferedReader(new FileReader(rutaFichero));
						
						String registro ;
						Equipo equipo;
						
						ArrayList<Equipo> listaNombreEquipos;
						listaNombreEquipos = new ArrayList<Equipo>();
						
						
						while ((registro = fichero.readLine() ) != null) {
							String [] campos = registro.split("#");
							equipo = new Equipo(Integer.parseInt(campos[0]), campos[1], campos[2]);
							equipo.setPj(0);
							equipo.setGc(0);  // contenido es 0
							equipo.setGf(0);
							equipo.setPe(0);
							equipo.setPg(0);
							equipo.setPp(0);
							equipo.setPuntos(0);
							listaNombreEquipos.add(equipo);
						}
						
						//System.out.println(listaNombreEquipos);
						
						fichero.close();
						System.out.println("Fin de la lectura del fichero");
						return listaNombreEquipos;
						
					} catch (FileNotFoundException excepcion) {
						System.out.println("fichero no encontrado");

					} catch (IOException e) {
						System.out.println("IO Excepcion");
					}
					return null;		
			}
			
			public Partido creaPartido (String lineaFichero) {
				Partido partido = new Partido();
				String[] campos = lineaFichero.split("#");
				
				partido.setIdPartido(Integer.parseInt(campos[0]));
				partido.setJornada(Integer.parseInt(campos[1]));
				partido.setEquipoLocal(campos[2]);
				partido.setEquipoVisitante(campos[4]);
				
				
				try {
					partido.setGolesLocal(Integer.parseInt(campos[3]));
					partido.setGolesVisitante(Integer.parseInt(campos[5]));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					return null;
				}
				return partido;
			}
			
			public Equipo buscarEquipoEnLista(String nombreCorto, ArrayList<Equipo> equipos) {   
				Equipo resultado = null;
				for (Equipo equipo : equipos) {
					if(equipo.getNombreCorto().equals(nombreCorto)) {
						return equipo;
					}
				}
				System.out.println("Oooops.. algo falla");
				return null;
			}

			public void actualizaEquipos(Partido partido, ArrayList<Equipo> equipos) {
				String nCortoL = partido.getEquipoLocal();
				String nCortoV = partido.getEquipoVisitante();
				Equipo eL= buscarEquipoEnLista(nCortoL, equipos);
				Equipo eV=buscarEquipoEnLista(nCortoV, equipos);
				
				if (partido.getGolesLocal() > partido.getGolesVisitante()) {
					eL.setPuntos(eL.getPuntos() + 3);
					eL.setPg(eL.getPg() + 1);
					eV.setPp(eV.getPp() + 1);


				}else if (partido.getGolesLocal() < partido.getGolesVisitante()){
					eV.setPuntos(eV.getPuntos() + 3);
					eV.setPg(eV.getPg() + 1);
					eL.setPp(eL.getPp() + 1);

					
				}else {
					eL.setPuntos(eL.getPuntos() + 1);
					eV.setPuntos(eV.getPuntos() + 1);
					eL.setPe(eL.getPe() + 1);
					eV.setPe(eV.getPe() + 1);
				}
				
				eL.setGf(eL.getGf() + partido.getGolesLocal());
				eL.setGc(eL.getGc()+ partido.getGolesVisitante());
				eV.setGf(eV.getGf() + partido.getGolesVisitante());
				eV.setGc(eV.getGc() + partido.getGolesLocal());
				eL.setPj(eL.getPj() + 1);
				eV.setPj(eV.getPj() + 1);
			}						

						
			// --------ACTIVIDAD: Crearemos la clasificacion con información extra de cada equipo (MEDIANTE CLASE EQUIPO)  --------------------------------- 13/02/2019
			
			 /* Hemos modificado un método (creaListaEquipos) que ya teniamos para realizar este método.
			 * 
			 * Para este método hemos creado submétodos: actualizaEquipos,creaListaEquipos,buscarEquipoEnLista,creaPartido
			 */
						
			public ArrayList<Equipo> generaClasificacion (String rutaPartidos, String rutaEquipos){
				ArrayList<Equipo> resultado; 
			try {
				resultado = creaListaEquipos(rutaEquipos);

				BufferedReader fichero;
				fichero = new BufferedReader(new FileReader(rutaPartidos));
				String registro;
				Partido partido;
				while ((registro = fichero.readLine()) != null) {
					 partido = creaPartido(registro);
					 if (partido == null)
						 break;
					 // Actualiza lista Equipos
					 actualizaEquipos (partido, resultado); 
				}
				Collections.sort(resultado, null);
				
				fichero.close();
				//System.out.println("Fin de la lectura del fichero");
				return resultado;

			} catch (FileNotFoundException excepcion) {
				System.out.println("fichero no encontrado");

			} catch (IOException e) {
				System.out.println("IO Excepcion");
			}
			return null;
		}	
			
/*		// --------ACTIVIDAD: Mostrar clasificación en un recuadro con SWING--------------------------------- 19/02/2019
				
		public void muestraClasificacion() {
			JFrame ventana;
			ventana = new JFrame("Clasificacion");
	
			JPanel panel = new JPanel();
			ventana.add(panel);
	
			ArrayList<Equipo> equipos = this.generaClasificacion("ficheros/partidos.txt", "ficheros/equipos.txt");
			
			String[] columnas= {"EQUIPO","PUNTOS","PJ","PG","PE","PP","GF","GC"};
			DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
	
			modelo.addRow(columnas);
			for (Equipo equipo : equipos) {
				Object[] vector = { equipo.getNombre(), 
						equipo.getPuntos(),
						equipo.getPj(), equipo.getPg(), equipo.getPe(),
						equipo.getPp(), equipo.getGf(), equipo.getGc() };
				modelo.addRow(vector);
			}
			JTable tabla = new JTable(modelo);
			panel.add(tabla);
			ventana.pack();
			ventana.setVisible(true);
	}
			
*/
			
	
			
			
								//############ ESCRITURA EN FICHERO ######################
	
	//--------ACTIVIDAD: Método que recoge por teclado lo escrito y lo guarda en fichero -----------------------20/02/2019		
	/* Le pasaremos como parámetro un fichero que no existe (lo crea)
	*/
	public void entradaTecladoAFichero(String rutafichero) {
		
		try {
			BufferedWriter fichero;
			fichero = new BufferedWriter(new FileWriter(rutafichero));
			
			Scanner teclado = new Scanner(System.in); 		// definimos objeto de lac lase scanner .
			String tecleado;
			String palabraFinalizar = "exit";
			while((tecleado = teclado.nextLine()).compareToIgnoreCase(palabraFinalizar) != 0) {
				System.out.println("Teclee sus datos .. | para terminar escribir: exit");
				fichero.write(tecleado + "\n");
			}

			fichero.close();	
		} catch (IOException e) {
			System.out.println("Error I/O" + e.getMessage());

		}
		System.out.println("fin entrada de datos");
	}
			
	
	
	
		
	//--------ACTIVIDAD: Método que recoge num aleatorios y guardar en fichero -----------------------20/02/2019
	public void grabarTiradasDados(int cuantas){
		try {
			Random rnd = new Random();
			BufferedWriter fichero = new BufferedWriter(new FileWriter("ficheros/tiradasDado.txt"));
			int acumulado = 0;
			for (int i = 0; i < cuantas; i++) {
				int numAletorio = 1 + rnd.nextInt(6);
				acumulado+= numAletorio;
				fichero.write(numAletorio + " ");			
	
			}
			System.out.println("La media es: " + (float)acumulado/cuantas);
			fichero.close();
			
		} catch (IOException e) {
			System.out.println("Error I/O" + e.getMessage());
		}
		System.out.println("fin programa");
	}
	
	

	
								//############ AÑADIR OBJETO A UN FICHERO  (binario) ######################
	
	//--------ACTIVIDAD: Método recoge objetos y los añade a un fichero -----------------------20/02/2019
	/* OJO: para esto se debe de serializar la clase de la que vamos a obtener los objetos
	 *  Escribir en un fichero los objetos que les pasemos. 
	 */
	
	 public void pasarObjectoAFichero (String rutaEquipo) {
		try {
			BufferedReader fichero = new BufferedReader(new FileReader(rutaEquipo));
			FileOutputStream salida = new FileOutputStream("ficheros/equipos.obj");  //fichero salida dónde va ir los objetos
			ObjectOutputStream objetos = new ObjectOutputStream(salida);
			
			   
		   String registro;
		   while((registro= fichero.readLine()) != null){
			   String[] campos = registro.split("#");

			   Equipo equipo = new Equipo(Integer.parseInt(campos[0]), campos[1], campos[2]);
			   equipo.setPuntos(0);
			   equipo.setPp(0);
			   equipo.setPg(0);
			   equipo.setPe(0);
			   equipo.setPp(0);
			   equipo.setGf(0);
			   equipo.setGc(0);

			  objetos.writeObject(equipo);  
			System.out.println(objetos);
		   }
		   
			objetos.close();
			fichero.close();
		} catch (FileNotFoundException excepcion) {
			System.out.println("fichero no encontrado");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	 }
	 
	
	

	  //--------ACTIVIDAD: Método lee fichero binario y devuelve los objetos-----------------------21/02/2019 
	 public void leerObjetosEquipos() {
		try {
			FileInputStream fichero = new FileInputStream("ficheros/equipos.obj");  //leer bytes del fichero del fichero especificado
			ObjectInputStream objetos = new ObjectInputStream(fichero);


			while(true){
				try {
					Object objeto = objetos.readObject();
					System.out.println(objeto.toString());
					
				} catch (ClassNotFoundException e) {
					System.out.println(e.getMessage());
				}
				
			}
		
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	  }

	 
	
/*	  //--------ACTIVIDAD: Método lee fichero binario y devuelve los objetos en un fichero-----------------------21/02/2019 
	 public void leerObjetosEquiposGuardarDato() {
		try {
			FileInputStream fichero = new FileInputStream("ficheros/equipos.obj");  //leer bytes del fichero del fichero especificado
			ObjectInputStream objetos = new ObjectInputStream(fichero);


			while(true){
				try {
					Object objeto = objetos.readObject();
					System.out.println(objeto.toString());
					
				} catch (ClassNotFoundException e) {
					System.out.println(e.getMessage());
				}
				
			}
		
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	  }	*/
	 
	 
	 
	 
	 
	 
	
	//---------ACTIVIDAD: dado un equipo, mostrar sus jugadores (POR MI CUENTA)---------------------------------22/02/2019
	
	public void devolverJugadoresEq() {
		
		//Leer por teclado y guardar el valor (Contemplar nombre largo)
		
		String registro = null;
		String registroJugadores = null;
		Scanner teclado = new Scanner(System.in); 		// definimos objeto de la clase scanner .
		String tecleado = null;
		String idEquipo;
		String nombreLargo;
		String palabraFinalizar = ".";

		try {
			BufferedReader fichero = new BufferedReader(new FileReader("ficheros/equipos.txt")); //Leer fichero (comparar lo escrito por teclado)
			BufferedReader ficheroJug = new BufferedReader(new FileReader("ficheros/jugadores.txt"));
			
			System.out.println("Escriba su equipo, ENTER y '.' para finalizar");
			while((tecleado = teclado.nextLine()).compareTo(palabraFinalizar) != 0 ) { 
				while((registro=fichero.readLine()) !=null) {
					String[] campos = registro.split("#");
					idEquipo = campos[0];
					nombreLargo = campos[2];
					if(tecleado.equals(nombreLargo)) {
						System.out.println(nombreLargo + " ha sido escrito");

						//Leer jugadores
						while((registroJugadores= ficheroJug.readLine())!= null) {
							String[]camposJug = registroJugadores.split("#");
							if (idEquipo.equals(camposJug[4])) {
								System.out.println(camposJug[2]);
							}
						}
					}
				}
			}
			teclado.close(); fichero.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}	catch (IOException e) {
			System.out.println(e.getMessage());
		}	
	}


	
	
	
	//---------ACTIVIDAD: dado un equipo, mostrar sus jugadores REFACTORIZANDO (POR MI CUENTA)---------------------------------
	
	public void devolverJugadoresEqMap(String ficheroEquipos) {
		//Llamar método recoge lo escrito por teclado
		
		//Comparar lo escrito con el Objecto (Equipo)
		
	}
	
	public String tecleado() {
		Scanner teclado = new Scanner(System.in); 		// definimos objeto de la clase scanner .
		String tecleado = null;
		
		System.out.println("Escriba el equipo , presione ENTER y luego 'stop' para finalizar");
		while((tecleado=teclado.next()).compareToIgnoreCase("stop") !=0) {

		}
		return tecleado;	
	}
	
	
	
	/*
	 * public HashMap<String, ArrayList<Equipo>> devolverJugadoresEqMap(String
	 * ficheroEquipos) {
	 * 
	 * }
	 */	
	
	
	

	
	
	// --------ACTIVIDAD: Obtener un ArrayList(Lista) de todos los equipos  ------------------------------------------------------- 12/03/2019
						//(Modificar la actividad: CreamapaEquipos)
	public ArrayList<Equipo> crearListaEquipos(String rutaFichero){
		try {
			BufferedReader fichero;
			fichero = new BufferedReader(new FileReader(rutaFichero));
			
			String registro ;
			Equipo equipo = null;
			
			ArrayList<Equipo> listaNombreEquipos = new ArrayList<Equipo>();
			
			
			while ((registro =fichero.readLine() ) != null) {
				String [] campos = registro.split("#");
				equipo = new Equipo(Integer.parseInt(campos[0]), campos[1], campos[2]);
				listaNombreEquipos.add(equipo);
			}
			
			//System.out.println(listaNombreEquipos);
			
			fichero.close();
			System.out.println("Fin de la lectura del fichero");
			return listaNombreEquipos;
			
		} catch (FileNotFoundException excepcion) {
			System.out.println("fichero no encontrado");

		} catch (IOException e) {
			System.out.println("IO Excepcion");
		}		
	return null;
}
	// MISMA ACTIVIDAD ANTERIOR PERO CON OBJETO
	public ArrayList<Equipo> crearListaEquipos2(String rutaFichero){
		try {
			BufferedReader fichero;
			fichero = new BufferedReader(new FileReader(rutaFichero));
			
			String registro ;
			
			
			ArrayList<Equipo> listaNombreEquipos = new ArrayList<Equipo>();
			
			
			while ((registro =fichero.readLine() ) != null) {
				String [] campos = registro.split("#");
				Equipo equipo = new Equipo();
				equipo.setIdEquipo(Integer.parseInt(campos[0]));
				equipo.setNombreCorto(campos[1]);
				equipo.setNombre(campos[2]);
				equipo.setGc(0);
				equipo.setGf(0);
				equipo.setPe(0);
				equipo.setPp(0);
				equipo.setPg(0);
				equipo.setPj(0);
				equipo.setPuntos(0);
				listaNombreEquipos.add(equipo);
			}
			
			//System.out.println(listaNombreEquipos);
			
			fichero.close();
			//System.out.println("Fin de la lectura del fichero");
			return listaNombreEquipos;
			
		} catch (FileNotFoundException excepcion) {
			System.out.println("fichero no encontrado");

		} catch (IOException e) {
			System.out.println("IO Excepcion");
		}		
	return null;
}	
	
	
	
	
	
	
	

	
	
	//--------ACTIVIDAD: En un array de números buscar un valor
	/*
	 * Es un algoritmo para probar los límites: vamos por porciones comprobando poco a poco. 
	 * Es decir, de 1000 números comprobamos 30.. por ejemplo. Otra opción que se encuentra a la izq, centro o derecha
	 * Formula a tener en cuenta:   medi=((der-izq)/2)+izq
	 * 
	 * 
	 *  devuelve:  -1 no encuentro
	 */
	public int busquedaBinaria(int[]pajar, int aguja) {
		int izq= 0;
		int der= pajar.length -1;
		while(izq < der){
			// Debemos saber la mitad del array
			int medio = ((der - izq)/2)+izq;

			if(pajar[medio] == aguja) {  //Medio
				System.out.println("Número " + aguja + " encontrado en la posicion " + medio  );
				return medio;
			}
			if (pajar[medio]< aguja) { //Derecha
				izq = medio + 1;
			}
			else {
				der = medio - 1;
			}
		}
		System.out.println("NO ENCONTRADO " + aguja);
		return -1;	
	}
	
	
	
	//ACTIVIDAD: Obtener el objeto equipo si se encuentra ------------------------------------------------------- 12/03/2019 
	/* 
	 * El parámetro 'equipoNombrCorto': será el nombre corto
	 * Recorrer el ArrayList y comprobar que se encuentre el equipo
	 */
	public Equipo buscarEquipo(String equipoNombrCorto, ArrayList<Equipo> equipos) {
		for (Equipo equipo : equipos) {
			if (equipoNombrCorto.equals(equipo.getNombreCorto())){
				System.out.println("Equipo '" + equipo + "' encontrado");
			}
		}
		return null;	
	}
	
	

	//--------ACTIVIDAD: Crear lista de jugadores -----------------------------------------13/03/2019
	/*
	 * Crear la lista, vacia
	 * Recorrer secuencialmente el fichero
	 * crear el objeto jugador por cada registro del fichero
	 * Finalizar con la devolucion de la lista.
	 */
	
	public ArrayList<Jugador> creaListaJugadores(String rutaJugadores){
		try {
			BufferedReader fichero;
			fichero = new BufferedReader(new FileReader(rutaJugadores));
			ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
			String registro;
			Jugador jugador;
			while ((registro=fichero.readLine() ) != null) {
				String [] campos = registro.split("#");  // romper cadena
				
				jugador = new Jugador();
				jugador.setIdJugador(Integer.parseInt(campos[0]));
				jugador.setNombre(campos[1]);
				jugador.setDorsal(Integer.parseInt(campos[2]));
				jugador.setCodigoEquipo(Integer.parseInt(campos[3]));
				listaJugadores.add(jugador);
			}
			fichero.close();
			//System.out.println("Creada la lista de jugadores..");
			
			for (Jugador jugadorCreado : listaJugadores) {
				//System.out.println(jugadorCreado);
				
			}
			return listaJugadores;
			
		} catch (FileNotFoundException excepcion) {
			System.out.println("fichero no encontrado");

		} catch (IOException e) {
			System.out.println("IO Excepcion");
		}
		return null;	
	}
	
	
	

	
	//--------ACTIVIDAD: Crear un mapa de jugadores -----------------------------------------13/03/2019
	/*
	 * Crear la lista, vacia
	 *  Recorrer secuencialmente el fichero
	 *  crear el objeto jugador por cada registro del fichero
	 *  Finalizar con la devolucion de la lista.
	 *  
	 *  valor:
	 *  clave: NIF  o ID
	 */
	
	
	public HashMap<String, Jugador> creaMapaJugadores(String rutaJugadores){
		try {
			BufferedReader fichero;
			fichero = new BufferedReader(new FileReader(rutaJugadores));
			HashMap<String, Jugador> mapaJugadores = new HashMap<String, Jugador>();
			String registro;
			Jugador jugador;
			while ((registro=fichero.readLine() ) != null) {
				String [] campos = registro.split("#");  // romper cadena
				
				jugador = new Jugador();
				jugador.setIdJugador(Integer.parseInt(campos[0]));
				jugador.setNombre(campos[1]);
				jugador.setDorsal(Integer.parseInt(campos[2]));
				jugador.setCodigoEquipo(Integer.parseInt(campos[3]));
				
				mapaJugadores.put(campos[0], jugador);
			}
			fichero.close();
			System.out.println("Creada la lista de jugadores..");
			
			
			for(String clave : mapaJugadores.keySet()) {
				//System.out.println(clave);
			}
			 
			return mapaJugadores;
			
		} catch (FileNotFoundException excepcion) {
			System.out.println("fichero no encontrado");

		} catch (IOException e) {
			System.out.println("IO Excepcion");
		}
		return null;	
		
	}
	
	
	
	
	//--------ACTIVIDAD:Ordenar lista jugadores por nombre -----------------------------------------13/03/2019
	
	public void ordenarListaJugadoresNombre(ArrayList<Jugador>ListaJugadores) {
		Collections.sort(ListaJugadores, Jugador.compareNamesPlayers);
		System.out.println(ListaJugadores);
	}
	


//	https://www.mkyong.com/java/java-object-sorting-example-comparable-and-comparator/
// https://www.youtube.com/watch?v=gGkj6wtqrsE	
//https://www.arquitecturajava.com/java-comparator-interface-y-lambdas/
//https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=599:interface-comparator-api-java-diferencias-con-comparable-clase-collections-codigo-ejemplo-cu00918c&catid=58&Itemid=180	
//https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/	
	
	


	//--------ACTIVIDAD:Ordenar Mapa jugadores por nombre -----------------------------------------13/03/2019
	public void ordenarMapaJugadoresNombre(HashMap<String,Jugador>MapaJugadores) {
	
		Set<Entry<String, Jugador>> set = MapaJugadores.entrySet(); // Vista conjunta del mapa
		 ArrayList<Entry<String, Jugador>> list = new ArrayList<Entry<String,Jugador>>(set);
		 Collections.sort(list, new Comparator<Map.Entry<String, Jugador>>() {

			@Override
			public int compare(Entry<String, Jugador> o1, Entry<String, Jugador> o2) {
				
				return o1.getValue().getNombre().compareTo(o2.getValue().getNombre());
			}
		 });
		 for (Entry<String, Jugador> entry : list) {
			System.out.println(entry.getValue());
		}
	
	}

	

	//--------ACTIVIDAD:Leer dos ficheros ordenados y unirlo en un tercero y ordenarlos -----------------------------------------27/03/2019
	/*
	 * Mezcla de dos ficheros de texto, ordenados previamente por un campo (clave)
	 */
	
	public String leerRegistro(BufferedReader fichero) throws IOException{
		String registro = fichero.readLine();
		if(registro == null) { // Fin fichero
			return "zzz"; // Es nuestro MAX_VALUE ('policía', que se comparará y siempre será el valor mayor)
		}
		return registro;
	}
	
	/*	
	public void mezclaFicherosOrdenados(String rutaF1, String rutaF2, String rutaF3) throws IOException {
		// Abrir fichero entrada (lectura)
		BufferedReader f1 = new BufferedReader(new FileReader(rutaF1));
		BufferedReader f2 = new BufferedReader(new FileReader(rutaF2));
		
		// Abrir fichero salida (escritura)
		BufferedWriter f3= new BufferedWriter(new FileWriter(rutaF3));
		
		
		String registrof1 = leerRegistro(f1);
		String registrof2 = leerRegistro(f2);
		
		//while (!registrof1.contentEquals("z") || !registrof2.contentEquals("z")) {
		while (registrof1 != "z") {
			String k1 = registrof1.split("#")[0];  // El '0' determina coger el primer elemento
			String k2 = registrof2.split("#")[0]; 
			
			
			if (k1.compareTo(k2)<0) { // k2 > k1
				f3.write(registrof1 + "\n");
				registrof1 = leerRegistro(f1);
				
			}else {   //k1 > k2  o ==
				f3.write(registrof2 + "\n");
				registrof2 = leerRegistro(f2);
			}
		}
		
		while(registrof2 != "z") {
			f3.write(registrof2 + "\n");
			registrof2 = leerRegistro(f2);
		}
		
		f1.close();
		f2.close();
		f3.close();
	}
*/	
	
	
	
	public void mezclaFicherosOrdenados(String rutaF1, String rutaF2, String rutaF3) throws IOException {
		// Abrir fichero entrada (lectura)
		BufferedReader f1 = new BufferedReader(new FileReader(rutaF1));
		BufferedReader f2 = new BufferedReader(new FileReader(rutaF2));
		
		// Abrir fichero salida (escritura)
		BufferedWriter f3= new BufferedWriter(new FileWriter(rutaF3));
		
		
		String registrof1 = leerRegistro(f1);
		String registrof2 = leerRegistro(f2);
		
		while (registrof1 != "zzz") {
			String k1 = registrof1.split("#")[0];  // El '0' determina coger el primer elemento
			String k2 = registrof2.split("#")[0]; 
			
			if (k1.length() == k2.length()) { // Misma longitud
				if (k1.compareTo(k2)<0) {   //k2 > k1
					f3.write(registrof1 + "\n");
					registrof1 = leerRegistro(f1);
				}else {
					f3.write(registrof2 + "\n");
					registrof2 = leerRegistro(f2);
				}
			}else if(k1.length()>k2.length()){
					f3.write(registrof2 + "\n");
					registrof2 = leerRegistro(f2);
				}else {
					f3.write(registrof1 + "\n");
					registrof1 = leerRegistro(f1);
				}
			}
		while(registrof2 != "zzz") {
			f3.write(registrof2 + "\n");
			registrof2 = leerRegistro(f2);
		}

		f1.close();
		f2.close();
		f3.close();
	}
	
	

	// Leer dos ficheros desordenador y unirlos en un tercer fichero o arrayList  

	
	
	
	
	
	
	//--------ACTIVIDAD: Recursividad -----------------------------------------20/03/2019

	
	/*
	 * public static void traverse(File parentNode, String leftIndent) { if
	 * (parentNode.isDirectory()) { System.out.println(leftIndent +
	 * parentNode.getName());
	 * 
	 * leftIndent += "     ";
	 * 
	 * File childNodes[] = parentNode.listFiles(); for (File childNode : childNodes)
	 * { traverse(childNode, leftIndent); } } else {
	 * 
	 * System.out.println(leftIndent +"|   --> "+ parentNode.getName()); } }
	 */
	
	

	
	public static void main(String[]args){
		
		//Ejercicios ejercicios = new Ejercicios();
		BaseDatos bd = new BaseDatos();
		
		
		bd.setHost("localhost:3306");
		bd.setDbName("");
		bd.setDbUser("root");
		bd.setDbPassword("");
		
		
		
		 System.out.println("fin");
		 System.exit(0); // Si hay código debajo no se ejecutará  SOLO HASTA AQUÍ
	
		
		
		
/*
 		//27/03/2019--------ACTIVIDAD:Leer dos ficheros ordenados y unirlo en un tercero y ordenarlos -----------------------------------------
 		 try {
			ejercicios.mezclaFicherosOrdenados("ficheros/rutaf1.txt", "ficheros/rutaf2.txt", "ficheros/rutaf3.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
 		 
 		 
 		 
 		//20/03/2019--------ACTIVIDAD: Recursividad -----------------------------------------
 		File inputFolder = new File("C:/users"); 
		traverse(inputFolder, "");
 


 
 		//13/03/2019--------ACTIVIDAD:Ordenar Mapa jugadores por nombre -----------------------------------------
 		Ejercicios ejercicios = new Ejercicios();
		 HashMap<String, Jugador> resultNombr = ejercicios.creaMapaJugadores("ficheros/jugadores2.txt");
		 ejercicios.ordenarMapaJugadoresNombre(resultNombr);
	
	
 		//13/03/2019--------ACTIVIDAD:Ordenar lista jugadores por nombre -----------------------------------------
 		Ejercicios ejercicios = new Ejercicios();
		ArrayList<Jugador> resultListaJug = ejercicios.creaListaJugadores("ficheros/jugadores.txt");
		ejercicios.ordenarListaJugadoresNombre(resultListaJug);
 		 
 		 
 		//13/03/2019--------ACTIVIDAD: Crear un mapa de jugadores ----------------------------------------- 
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.creaListaJugadores("ficheros/jugadores.txt");
		
 		 
 		 
 		//13/03/2019--------ACTIVIDAD: Crear lista de jugadores -----------------------------------------
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.creaListaJugadores("ficheros/jugadores.txt");
 		 
 		 
 		//12/03/2019--------ACTIVIDAD: Obtener el objeto equipo si se encuentra  -------------------------------------------------------  
 		ArrayList<Equipo> listaEq = ejercicios.crearListaEquipos2("ficheros/equipos.txt");
		ejercicios.buscarEquipo("RMA", listaEq);
 		 
 		 
 		//12/03/2019--------ACTIVIDAD: En un array de números buscar un valor
 		Ejercicios ejercicios = new Ejercicios();
 		int []pajar={4,8,10,8,42,7};
		ejercicios.busquedaBinaria(pajar, 10);
 
 
 		//12/03/2019 --------ACTIVIDAD: Obtener un ArrayList(Lista) de todos los equipos (Con objeto) ------------------------------------------------------- 
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.crearListaEquipos2("ficheros/equipos.txt");
 
 		//12/01/2019--------ACTIVIDAD: Obtener un ArrayList(Lista) de todos los equipos  ------------------------------------------------------- 
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.crearListaEquipos("ficheros/equipos.txt");
 
 		//22/02/2019--------ACTIVIDAD: dado un equipo, mostrar sus jugadores REFACTORIZANDO (POR MI CUENTA)------------------------ 
 		 
 	
 		!!!???
 
 
 		//22/02/2019--------ACTIVIDAD: dado un equipo, mostrar sus jugadores (POR MI CUENTA)------------------------ 
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.devolverJugadoresEq();
 		
 		
 		
 		//21/02/2019--------ACTIVIDAD: Método lee fichero binario y devuelve los objetos------------------------ 
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.leerObjetosEquipos();
 	
 		
 		//21/02/2019--------ACTIVIDAD: Método lee fichero binario y devuelve los objetos----------------------- 
 		Ejercicios ejercicios = new Ejercicios();
 		ejercicios.pasarObjectoAFichero("ficheros/equipos.txt");
 
 
 		//20/02/2019-------ACTIVIDAD:Método que recoge num aleatorios y guardar en fichero -----------------------
 		Ejercicios ejercicios = new Ejercicios();
 		ejercicios.grabarTiradasDados(10);
 
 
 		//20/02/2019--------ACTIVIDAD: Método que recoge por teclado lo escrito y lo guarda en fichero -----------------------
 		Ejercicios ejercicios = new Ejercicios();
		ArrayList<Equipo> result = ejercicios.generaClasificacion("ficheros/partidos.txt","ficheros/equipos.txt");
 
 
 
 		// 13/02/2019--------ACTIVIDAD: Crearemos la clasificacion con información extra de cada equipo (MEDIANTE CLASE EQUIPO)  --------------------------------- 
 		// Hemos realizado pequeños métodos (buscarEquipoEnLista,creaPartido,) para el método "generaClasificacion"
 		Ejercicios ejercicios = new Ejercicios();
		ArrayList<Equipo> result = ejercicios.generaClasificacion("ficheros/partidos.txt","ficheros/equipos.txt");
 
 
 
 		// 12/02/2019--------ACTIVIDAD: Ordenar HashMap de clasificacion   --------------------------------- 
 		HashMap<String, ArrayList<Integer>> resultados = ejercicios.creaClasificacion("ficheros/partidos.txt");
		ejercicios.ordenarMapaPuntosEquipos2(resultados);
 
 
 
 		// 07/02/2019--------ACTIVIDAD: Crearemos la clasificacion con información extra de cada equipo ---------------------------------
 		HashMap<String, ArrayList<Integer>> resultados = ejercicios.creaClasificacion("ficheros/partidos.txt");
		ejercicios.ordenarMapaPuntosEquipos2(resultados);
 		
 		
 		
 		//06/02/2019--------ACTIVIDAD: listado ordenado por identificador---------------------------------
 		Ejercicios ejercicios = new Ejercicios();
 		ArrayList<Equipo> eidOrdenado = ejercicios.equiposListaOrdenadaIdentificador("ficheros/equipos.txt");
 		
 
 		//06/02/2019-------ACTIVIDAD:  listado ordenado por equipos -----------------------------------------------------------------------------------------
 		Ejercicios ejercicios = new Ejercicios();
 		ArrayList<Equipo> eqOrdenado = ejercicios.equiposListaOrdenadaNombre("ficheros/equipos.txt");
 
 		//05/02/2019-------ACTIVIDAD: Ordenar HashMap   -----------------------------------------------------------------------------------------
 		Ejercicios ejercicios = new Ejercicios();
		HashMap<String, ArrayList<Integer>> resultados = ejercicios.resultadosEquipos("ficheros/partidos.txt");
		HashMap<String, Integer> puntosEquipos = ejercicios.generaPuntosEquipos(resultados);  // 05/02/2019
		ejercicios.ordenarMapaPuntosEquipos(puntosEquipos);

 
 		//05/2/2019--------ACTIVIDAD: Devolver HashMap con la puntuacion de equipos  -------------------------------------------------------------
 		HashMap<String, ArrayList<Integer>> resultado = ejercicios.resultadosEquipos("ficheros/partidos.txt");
 		HashMap<String, Integer> puntosEquipos = ejercicios.generaPuntosEquipos(resultado);
 
 
 		//30/01/2019--------ACTIVIDAD:Mostrar en una ventana los equipos usados en el fichero Equipos - SWING ------------------------------------
 		ejercicios ejercicios = new Ejercicios();
		ejercicios.pruebaSWING();

 		
 
 		//30/01/2019--------ACTIVIDAD: Crear un método que calcule los puntos de los Equipos ------------------------------------------------------
 		HashMap<String, ArrayList<Integer>> resultado = ejercicios.resultadosEquipos("ficheros/partidos.txt");
		ejercicios.muestraPuntosEquipos(resultado);
 		
 
 		//24/01/2019--------ACTIVIDAD: Crear un método que devuelva Victorias, empates y derrotas por cada equipo   ---------------------------------
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.resultadosEquipos("ficheros/partidos.txt");
 
 
 		//24/01/2019--------ACTIVIDAD: Detectar cuantos partidos se han jugado(Try-catch)   ---------------------------------------------------------
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.mostrarNumeroPartidosJugadosTry("ficheros/partidos.txt");

 		
 
 		//23/01/2019--------ACTIVIDAD: Detectar cuantos partidos se han jugado   --------------------------------------------------------------------
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.mostrarNumeroPartidosJugados("ficheros/partidos.txt");

 
 		//23/01/2019--------ACTIVIDAD: Obtener un Hashmap de todos los equipos  ------------------------------------------------------- 
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.crearMapaEquipos("ficheros/equipos.txt");
 		
 		
 		
 		
 		//23/01/2019--------ACTIVIDAD: Obtener un ArrayList de todos los equipos  ------------------------------------------------------- 
		Ejercicios ejercicios = new Ejercicios();
		ejercicios.creaListaEquipos("ficheros/equipos.txt");	
 
 
 
 		//22/01/2019--------ACTIVIDAD: Comprobar partidos.txt ------------------------------------------------------- 
 		Ejercicios ejercicios = new Ejercicios();
		HashMap<String, Integer> equipos = ejercicios.comprobarPartidos("ficheros/partidos.txt");
 


 		//15/01/2019--------ACTIVIDAD: Devuelve una lista de objetos de la clase Persona  ----------------------  
 		Ejercicios ejercicios = new Ejercicios(); 
 		ArrayList<Persona> listapersonas = ejercicios.creaListaPersonasDesdeFichero("ficheros/personas.txt", "##");
		System.out.println(listapersonas);
 

 
 		//10/1/2019 --------ACTIVIDAD: Leer un fichero  ----------------------   
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.leerfichero("ficheros/datos.txt");

 
 		//09/1/2019 --------ACTIVIDAD: PRIMEROS PASOS MAPAS  ----------------------   
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.introMapas();

  		//08/01/2019 --------HACIENDO PRUEBAS: AÑADIENDO DISTINTOS TIPOS DE DATOS LISTA ---------------------- 
  		 Ejercicios ejercicios = new Ejercicios();
		 ejercicios.introduccionListas();


 		//18/12/2018 ---------ACTIVIDAD: AÑADIR UNA LISTA EN MEDIO DE DOS -------------
 		 Ejercicios ejercicios = new Ejercicios();
		ejercicios.añadirNuevaListaPersona();
 		 
 		
 		// 18/12/2018 --------ACTIVIDAD: CREAR LISTA DE PERSONAS ----------------------   
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.introListaPersona();
 
 		//18/12/2018 --------ACTIVIDAD: CREAR LISTA DE CADENAS ----------------------      
 	 	Ejercicios ejercicios = new Ejercicios();
		ejercicios.introListas();
		System.exit(0); // Si hay código debajo no se ejecutará  SOLO HASTA AQUÍ
		
 	 
 		// -------------------------------------------1ª Evaluación -----------------------------------------------------------
 
 		//28/11/2018 ------------ACTIVIDAD: Mostrar nombre progenitor sus padres y sus hijos. 
 		Persona sheila = new Persona("78474714","Sheila", 50, null, 'F', new Persona[0]);  //Crear sheila
		Persona cindy = new Persona("78474718","Cindy", 55, null, 'F', new Persona[0]);   //Crear cindy
		Persona[] hijos = {sheila , cindy};
		
		Persona orlando = new Persona("45454545","Orlando",33, null,'M',hijos );
		Persona pepe = new Persona("48888845","Pepe",38,null,'M' , new Persona[3]);
		Persona concha = new Persona("45999945","Concha",77,null,'F' , new Persona[3]);
		
		Persona toni = new Persona("45664545","Toni",33,null,'F' , hijos);
		sheila.setMadre(toni);
		sheila.setPadre(orlando);
		
		orlando.setMadre(concha);
		orlando.setPadre(pepe);
				
		Ejercicios ejercicio = new Ejercicios();
		Persona [] resultado = {orlando};
		ejercicio.personas = resultado;
		ejercicio.hijosPersona();
 		 
 		 
 
 		// 22/11/2018 ----------- ACTIVIDAD: Una vez ordenado cada arrays de la matriz ahora hay que ORDENAR TODA la matriz comparando con los array 
 		Ejercicios ejercicios = new Ejercicios();
		int matrizNum[][]= {
				{7,4,6},
				{6},
				{5,2,3},
				{4,2,5,1,9,0,3},
				{5,6,1,3}
		};
		int[] vector = ejercicios.matrizToArrayOrdenado(matrizNum);
		System.out.println(Arrays.toString(vector));
 
 
 
  		//20/11/2018 -------------ACTIVIDAD: ACTIVIDAD: Ordenar cada matriz del array (usando el método ordenarArray) 21/11/2018
  		 Ejercicios ejercicios = new Ejercicios();
		int matrizNum[][]= {
				{7,4,6},
				{6},
				{5,2,3},
				{4,2,5,1,9,0,3},
				{5,6,1,3}
		};
		
		ejercicios.ordenaFilaMatriz(matrizNum);
  		 
  		 
 
 		// 20/11/2018 ------------- ACTIVIDAD: Dada una cadena, obtener la cadena INVIRTIENDO sus caracteres(usar charAt() o toCharArray()
 		Ejercicios ejercicios= new Ejercicios();
		String cadena = "Sheila";
		ejercicios.invertirCaracteres(cadena);
 		
 		
 		
 		// 20/11/2018 --------------ACTIVIDAD:  Dadas dos listas PREVIAMENTE ORDENADAS, se pide obtener la lista MEZCLADA de ambas .(Mezclar listas)
		Ejercicios ejercicios = new Ejercicios();
		int[] lista2 = {1,3,2,5,4};
		int[] lista1 = {8,7,6};	
		ejercicios.mezclaListaOrdenadas(lista1, lista2);
 		 
 
 		// 20/11/2018 ---------------ACTIVIDAD: Invertir elementos de una lista 
	 	Ejercicios ejercicios = new Ejercicios();
		int lista[]= {40,8,2,1,30};
		ejercicios.invertirLista(lista);
		

 		//14/11/2018 -----------------ACTIVIDAD: Usar el método "generarListaAleatorios" y ordenar los números
 		 Ejercicios ejercicios= new Ejercicios();
		ejercicios.ordenarArray();
		
		PENDIENTE HACER AMPLIACION - LISTA ALEATORIA !!!!!
 		 

 		//14/11/2018 -------------------ACTIVIDAD: Ordenar un array de cadenas  
 		Ejercicios ejercicios= new Ejercicios();
		String palabras[]= {"zorro","azul","abeja","pez"};
		ejercicios.ordenarCadena(palabras);
 		
 		
 		//14/11/2018 -------------------ACTIVIDAD: Pasar una lista de números desordenados y mostrarlos ordenados 
 		Ejercicios ejercicios = new Ejercicios();
		int ordenarArray[]= {40,8,2,1,30};
		ejercicios.ordenarArray(ordenarArray);
		System.out.println(Arrays.toString(ordenarArray));
 		
 
 		//08/11/2018 -------------------ACTIVIDAD:Meter en una lista los x números primos 
 		Ejercicios ejercicios = new Ejercicios();
		int inicio=5;
		int cuantos=8;
		int[] numeros = ejercicios.listarPrimos3(inicio,cuantos);
		System.out.println(Arrays.toString(numeros));
 
 
 		//08/11/2018 --------------------ACTIVIDAD:  Listar los x números primeros (usando tambíen el método  'esPrimo')----------
 		 Ejercicios ejercicios = new Ejercicios();
		ejercicios.listarPrimos2(1,10);
 		  
 
 		//08/11/2018---------------------ACTIVIDAD: Mostrar los 20 primeros números primos (usando tambíen el método  'esPrimo')
 		 Ejercicios ejercicios = new Ejercicios();
		ejercicios.listarPrimos(1,100);
 		 
		
		//08/11/2018---------------------ACTIVIDAD: Mostrar si el número es primo
		Ejercicios ejercicios = new Ejercicios();
		System.out.println(ejercicios.esPrimo(8));
		
 		// 07/11/2018 -------------------ACTIVIDAD: Realizar un reloj -------
 		 Ejercicios ejercicios = new Ejercicios();
		ejercicios.mostrarReloj();
 
 		//06/11/2018-----------------------ACTIVIDAD: Dado un array de cadenas, devolver la lista como números.---------- 
 		Ejercicios ejercicios = new Ejercicios();
		String[] cadenaNumerica={"123","8k8","9811","xyz"};
		ejercicios.convierteCadenas(cadenaNumerica);
		
		-------- Extension ACTIVIDAD ANTERIOR: Mostrar nombre de los vendedores-----06/11/2018
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.mostrarVentasVendedor();
		
		
 		//31/10/2018-----------------------ACTIVIDAD: Hacer un método que recorra y devuleva un resumen de cada mes(recorrer por columnas)
 		 Ejercicios ejercicios = new Ejercicios();
		float [][] ventasMeses =
			{
				// hay tres filas (vendedores) y 12 columnas (meses)	
				{12.5f,13.5f,8.5f,5.0f,10.5f,9.5f,20.5f,10.5f,4.0f,6.5f,5.5f,6.05f},
				{12.5f,13.5f,5.5f,5.0f,10.5f,4.5f,20.5f,1.5f,3.0f,6.5f,5.5f,6.05f},
				{12.5f,18.5f,8.5f,5.0f,2.5f,9.5f,20.5f,10.5f,9.0f,6.5f,5.5f,6.05f}
			};		
		ejercicios.resumenMes(ventasMeses);
 		 
 		 
 		//31/10/2018-----------------------ACTIVIDAD: Hacer un método que recorra y devuleva un acumulado de ventas por vendedor. (recorrer por filas)
 		 Ejercicios ejercicios = new Ejercicios();
		float [][] VentasYear =
			{
				// hay tres filas (vendedores) y 12 columnas (meses)	
				{12.5f,13.5f,8.5f,5.0f,10.5f,9.5f,20.5f,10.5f,4.0f,6.5f,5.5f,6.05f},
				{12.5f,13.5f,5.5f,5.0f,10.5f,4.5f,20.5f,1.5f,3.0f,6.5f,5.5f,6.05f},
				{12.5f,18.5f,8.5f,5.0f,2.5f,9.5f,20.5f,10.5f,9.0f,6.5f,5.5f,6.05f}
			};		
		float[] resumenVendedor;
		resumenVendedor = ejercicios.resumenVendedor(VentasYear);
		
 
 		//25/10/2018-----------------------ACTIVIDAD: Dan dos cadenas de caracteres por parámetros que hay que comparar entre sí (CompareTo)
 		Ejercicios ejercicios = new Ejercicios();
		String cadena1 = "hola caracola";
		String cadena2 = "adios caracol";
		ejercicios.comparaCadenaOrdenAlf(cadena1,cadena2);

 		
 		//25/10/2018-----------------------ACTIVIDAD: Dado una String pasada por parámetros mostrar por pantalla caracter a caracter el String (Método CharAt)
 		Ejercicios ejercicios = new Ejercicios();
		String caracteres = new String("Cadenadecaracteres");
		ejercicios.muestraCaracter(caracteres);
		
		¡PENDIENTE DE ENUNCIADO -FALTÉ A CLASE!
		
 
 		//24/10/2018-----------------------ACTIVIDAD:crearListaPersonas [Array] (Constructor Vacío)
 		Ejercicios ejercicios = new Ejercicios ();
		Persona [] listapersona = ejercicios.crearListaPersona(5);
		System.out.println(Arrays.toString(listapersona));
 
 		//18/10/2018------------------------ACTIVIDAD: devolver la cantidad de veces que se repiten los números en  10 veces que se genera los números aleatorios. Rango numeros 1-6			
 		Ejercicios ejercicios = new Ejercicios();
		int[] array = ejercicios.generaEstadisticaAparicion(10,1,6);
		System.out.println(Arrays.toString(array));
		
 		//---------------------------------ACTIVIDAD:Devolver array con 'n' numeros aleatorios entre 'inferior'(100) y 'superior'(500)
 		 Ejercicios ejercicios = new Ejercicios();
		ejercicio.generarListaAleatorios(5,100,500);
 
 		//17/10/2018 -----------------------ACTIVIDAD: IMPRIME POR CONSOLA n números aleatorios entre 1-100 (ENUNCIADO NUEVO,SIMILAR ANTERIOR)-
 		Ejercicios ejercicios = new Ejercicios();
		ejercicios.imprimeAleatorio(100); //veces que se muestra un número aleatório
 
 
  		//16/10/2018------------------------ACTIVIDAD: Método Aleatório + Array (devuelva un array de enteros, 1-1000)-------
  		Ejercicios ejercicios = new Ejercicios();
		int array [] = ejercicios.generaAleatorio(1000);
		System.out.println(Arrays.toString(array));
 
 		//16/10/2018------------------------ACTIVIDAD: Método "Aleatório" + Array (No marcado en Clase-- VARIANTE )--------
 		Ejercicios ejercicios = new Ejercicios();
		int array[] = ejercicios.aleatorio(4);
		System.out.println(Arrays.toString(array));  //Para mostrar el contenido del array "bien" hay que usar el .toString
 
		// 17/10/2018---------------------- ACTIVIDAD : Devolver el número menor de CUATRO - Con 'If' (Extensión actividad del 16/10/2018)---
		Ejercicios ejercicios = new Ejercicios();
		int a=10, b=50 , c=5 , d=80;
		System.out.println("el menor es:"+ ejercicios.calNumMenor(a,b,c,d));
		
		// 16/10/2018-----------------------ACTIVIDAD : Devolver el número menor de tres - Con 'If' (HECHO CLASE)-----
		Ejercicios ejercicios = new Ejercicios();
		int a=5, b=19 , c=100;
		System.out.println("el menor es:"+ ejercicios.calNumMenor(a,b,c));

		// 11/10/2018---------------------- ACTIVIDAD : Devolver el número menor de tres (2.-Deberes Casa)-------------
		int [] numeros = {7,3,8};
		System.out.println(calNumMenor(numeros));
		
		// 11/10/2018---------------------- ACTIVIDAD : Factorial  (1.-Deberes Casa)-----------------------------------
		factorial(5);
		
		// 11/10/2018----------------------ACTIVIDAD : Serie Fibonacci -------------------------------------------------
		serieFibonacci(8);
		
		// 10/10/2018 ---------------------ACTIVIDAD: “cadena” (String) devolver el valor en forma de número entero-----
		System.out.println(converString("8fgf"));
		
		//------------------------ ACTIVIDAD: Mostrar por consola los números comprendidos entre dos enteros, a y b  ---
		Ejercicios ejercicios = new Ejercicios();
		int x=10;
		int y= 30;
		ejercicios.listaIntervaloEnteros(x, y);
		
		
		//04/10/2018   ------------------ ACTIVIDAD: BUSCAR EN LA API----------------------------------------------------
		new Ejercicios().pruebasAPI();	
		System.out.println("Fin del programa");
*/		
	}
}
