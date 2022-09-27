package pruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio5 {
	
	/* Constantes */
	private static final String LISTA_SIN_REPETICIONES = "Lista sin repeticiones";
	private static final String LISTA_REPETIDA = "Lista repetida";
	private static final String LISTA_ORDENADA = "Lista ordenada";
	private static final int CONSTANTE_0 = 0;
	private static final int CONSTANTE_7 = 7;
	private static final int CONSTANTE_3 = 3;
	private static final int CONSTANTE_1 = 1;

	public static void main(String[] args) {

		// Creación de una lista
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		// Metemos los valores
		numeros.add(CONSTANTE_1);
		numeros.add(CONSTANTE_3);
		numeros.add(CONSTANTE_7);
		numeros.add(CONSTANTE_7);
		numeros.add(CONSTANTE_0);

		// Imprimir lista repetida
		imprimirLista(LISTA_REPETIDA, numeros);
		System.out.println();

		// Lista ordenada
		ordenar(numeros);

		// Imprimir lista ordenada
		imprimirLista(LISTA_ORDENADA, numeros);
		
		// Imprimir lista sin repeticiones, hecho con la funcion hashSet
		System.out.println();
		Set<Integer> hashSet = new HashSet<Integer>(numeros);
		numeros.clear();
		numeros.addAll(hashSet);
		imprimirLista(LISTA_SIN_REPETICIONES, numeros);

	}

	// funcion para ordenar
	public static void ordenar(List<Integer> numeros) {
		Collections.sort(numeros);
	}

	// funcion para imprimir la lista
	private static void imprimirLista(String mensaje, ArrayList<Integer> numeros) {
		// mensaje de lista ordenada
		System.out.println(mensaje);

		// recorrido de la lista repetida ya ordenada
		for (int i = 0; i < numeros.size(); i++) {
			System.out.print("" + numeros.get(i));
		}

	}

}
