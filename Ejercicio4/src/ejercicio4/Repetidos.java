package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repetidos {

	/* Constantes */

	private static final String ESTA_ES_LA_LISTA_EN_ORDEN_ASCENDENTE = "Esta es la lista en orden ascendente : ";
	private static final String ESTA_ES_LA_LISTA = "Esta es la lista : ";
	private static final int _0 = 0;
	private static final int _7 = 7;
	private static final int _3 = 3;
	private static final int _1 = 1;

	/* Proceso */

	public static void main(String[] args) {

		/* Creamos una lista */

		List<Integer> numeros;
		numeros = new ArrayList<Integer>();

		/* Añadimos valores */

		numeros.add(_1);
		numeros.add(_3);
		numeros.add(_7);
		numeros.add(_7);
		numeros.add(_0);

		/* Representación de la lista normal y en orden ascendente. */

		for (int i = 0; i < 1; i++) {
			System.out.println(ESTA_ES_LA_LISTA + numeros);
			ordenar(numeros);
			System.out.println(ESTA_ES_LA_LISTA_EN_ORDEN_ASCENDENTE + numeros);
		}
	}

	/* Función de ordenar ascendentemente con el método collections.sort() */

	public static void ordenar(List<Integer> numeros) {
		Collections.sort(numeros);
	}
}
