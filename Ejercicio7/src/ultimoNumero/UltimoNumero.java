package ultimoNumero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UltimoNumero {
	
	/* Constantes */
	private static final String CONSTANTE_NO_ESTÁ_EN_LA_ÚLTIMA_POSICIÓN = " NO está en la lista";
	private static final String CONSTANTE_ESTÁ_EN_LA_ÚLTIMA_POSICIÓN = " está en la lista. En la última posición y ";
	private static final String CONSTANTE_EL_ELEMENTO = "El elemento ";
	private static final String LISTA_REPETIDA = "Lista repetida";
	private static final String LISTA_ORDENADA = "Lista ordenada";
	private static final int CONSTANTE_8 = 8;
	private static final int CONSTANTE_2 = 2;
	private static final int CONSTANTE_5 = 5;
	private static final int CONSTANTE_0 = 0;
	private static final int CONSTANTE_7 = 7;
	private static final int CONSTANTE_3 = 3;
	private static final int CONSTANTE_1 = 1;

	public static void main(String[] args) {

		// Creación de una lista
				ArrayList<Integer> numeros = new ArrayList<Integer>();

				// Declaramos las variables
				int elementoaBuscar = 1;

				// Metemos los valores
				numeros.add(CONSTANTE_1);
				numeros.add(CONSTANTE_3);
				numeros.add(CONSTANTE_7);
				numeros.add(CONSTANTE_7);
				numeros.add(CONSTANTE_0);
				numeros.add(CONSTANTE_3);
				numeros.add(CONSTANTE_1);
				numeros.add(CONSTANTE_2);
				numeros.add(CONSTANTE_8);
				numeros.add(CONSTANTE_5);

				// Imprimir lista repetida
				imprimirLista(LISTA_REPETIDA, numeros);
				System.out.println();

				// Lista ordenada
				ordenar(numeros);

				// Imprimir lista ordenada
				imprimirLista(LISTA_ORDENADA, numeros);

				// Busqueda de si el valor esta y cual es su posición
				System.out.println();
				buscar(5, numeros);

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

			// Realizamos la funcion busqueda metiendo distintas variables como
			// elementoaBuscar y posicion
			
			public static boolean buscar(int elementoaBuscar, List<Integer> numeros) {
			//Declaramos las variables
				int posicion = numeros.lastIndexOf(elementoaBuscar);
				if (posicion > 0) {
					// Imprime por pantalla un mensaje indicando que si está ese valor y en qué
					// posición está
					System.out.println(
							CONSTANTE_EL_ELEMENTO + elementoaBuscar + CONSTANTE_ESTÁ_EN_LA_ÚLTIMA_POSICIÓN + (posicion+1));
				}else {
					// Imprime por pantalla un mensaje indicando que no está ese valor
					System.out.println(CONSTANTE_EL_ELEMENTO + elementoaBuscar + CONSTANTE_NO_ESTÁ_EN_LA_ÚLTIMA_POSICIÓN);
				}
				return false;
	}

}
