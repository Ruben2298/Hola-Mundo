package ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EliminarRepetidos {
	private static final String CONSTANTE_ESTA_ES_LA_LISTA_SIN_REPETIDOS = "Esta es la lista sin repetidos : ";

	private static final String CONSTANTE_ESTA_ES_LA_LISTA = "Esta es la lista : ";
	/* Constantes */

	private static final int CONSTANTE_0 = 0;
	private static final int CONSTANTE_7 = 7;
	private static final int CONSTANTE_3 = 3;
	private static final int CONSTANTE_1 = 1;

	/* Proceso */

	public static void main(String[] args) {

		/* Creamos una lista normal y otra de eliminar */

		List<Integer> numeros;
		numeros = new ArrayList<Integer>();
		


		/* Añadimos valores */

		numeros.add(CONSTANTE_1);
		numeros.add(CONSTANTE_3);
		numeros.add(CONSTANTE_7);
		numeros.add(CONSTANTE_7);
		numeros.add(CONSTANTE_0);

		/* Representación de la lista normal y en orden ascendente. */
		System.out.println(CONSTANTE_ESTA_ES_LA_LISTA + numeros);
		Set<Integer> hashSet = new HashSet<Integer>(numeros);
		numeros.clear();
		numeros.addAll(hashSet);
		System.out.println(CONSTANTE_ESTA_ES_LA_LISTA_SIN_REPETIDOS + numeros);
	}

	
}
