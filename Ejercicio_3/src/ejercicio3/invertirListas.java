package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class invertirListas {
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

		numeros.add(NUMERO_1);
		numeros.add(NUMERO_50);
		numeros.add(NUMERO_MENOS15);

		/* Imprimir por pantalla */

		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}

		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}

	}

	public static void invertir(ArrayList numeros) {
		/* Invertimos el orden */

		Collections.reverse(numeros);

	}

}
