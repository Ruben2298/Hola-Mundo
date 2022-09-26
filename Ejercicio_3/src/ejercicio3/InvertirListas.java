package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InvertirListas {
	/* Constante */

	private static final int NUMERO_MENOS15 = -15;

	/* Constante */

	private static final int NUMERO_50 = 50;

	/* Constante */

	private static final int NUMERO_1 = 1;

	public static void main(String[] args) {

		/* Creamos una lista */

		List<Integer> numeros;

		numeros = new ArrayList<Integer>();

		/* Añadimos los números a la lista */

		numeros.add(NUMERO_1);
		numeros.add(NUMERO_50);
		numeros.add(NUMERO_MENOS15);

		/* Imprimimos por pantalla los distintos resultados */

		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
			ordenar(numeros);
			System.out.println(numeros.get(i));
			invertir(numeros);
			System.out.println(numeros.get(i));
		}
		
	}

	public static void ordenar(List<Integer> numeros) {
		/* Lo ordenamos */

		Collections.sort(numeros);

	}

	public static void invertir(List<Integer> numeros) {
		/* Invertimos el orden */

		Collections.reverse(numeros);

	}

}
