package pruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3Mr {

	/* Constantes */

	private static final String LOS_NUMEROS_SON = "Los numeros son:";

	public static void main(String[] args) {

		/* Creamos la lista */

		List<Integer> numeros;
		numeros = new ArrayList<Integer>();

		/* Bucle para formar los números aletorios (5) aleatorios con Math.Random */

		for (int i = 0; i < 5; i++) {
			int numero = (int) (Math.random() * 50 + 1);
			if (numeros.contains(numero)) {
				i--;
			} else {
				numeros.add(numero);
			}
		}

		/* Imprimos por pantalla los distintos resultados */

		System.out.println(LOS_NUMEROS_SON);
		for (int i = 0; i < 1; i++) {
			System.out.println(numeros);
			ordenar(numeros);
			System.out.println(numeros);
			desordenar(numeros);
			System.out.println(numeros);
		}

		/*
		 * ordenar(numeros);
		 * 
		 * for (int i = 0; i < 1; i++) { System.out.println(numeros); }
		 * 
		 * desordenar(numeros);
		 * 
		 * for (int i = 0; i < 1; i++) { System.out.println(numeros); }
		 */
	}

	/* Funciones */
	
	public static void ordenar(List<Integer> numeros) {
		Collections.sort(numeros);
	}

	public static void desordenar(List<Integer> numeros) {
		Collections.reverse(numeros);
	}
}
