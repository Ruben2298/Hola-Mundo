package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarListas {
	/* Constante */
	private static final int NUMERO_MENOS15 = -15;
	/* Constante */
	private static final int NUMERO_50 = 50;
	/* Constante */
	private static final int NUMERO_1 = 1;

	/* Proceso */
	public static void main(String[] args) {

		/* Creamos una lista */
		List<Integer> numeros;

		numeros = new ArrayList<Integer>();

		/* Añadimos los valores */

		numeros.add(NUMERO_50);
		numeros.add(NUMERO_1);
		numeros.add(NUMERO_MENOS15);


		/* Imprimir por pantalla los distintos resultados */

		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
			ordenar(numeros);
			System.out.println(numeros.get(i));
		}

	}

	/* Funciones */

	public static void ordenar(List<Integer> numeros) {
		/* Lo ordenamos */

		Collections.sort(numeros);

	}
}
