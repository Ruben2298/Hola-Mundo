package ejercicio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ejercicio12.Comparador;
import ejercicio12.Usuario;

public class OrdenarFDesc {

	private static final String CONSTANTE_ANTONIO = "Antonio";
	private static final String CONSTANTE_FERNANDEZ = "Fernandez";
	private static final String CONSTANTE_LOPEZ = "Lopez";
	private static final String CONSTANTE_JOAQUÍN = "Joaquín";
	private static final String CONSTANTE_BARBERO = "Barbero";
	private static final String CONSTANTE_LAURA = "Laura";
	private static final String CONSTANTE_TOLEDANO = "Toledano";
	private static final String CONSTANTE_RUBÉN = "Rubén";

	/* Proceso */
	public static void main(String[] args) {
		List<String> usuario;
		usuario = new ArrayList<String>();
		ArrayList<Usuario> usuario1 = new ArrayList<Usuario>();
		usuario1.add(new Usuario(CONSTANTE_ANTONIO,CONSTANTE_LOPEZ));
		usuario1.add(new Usuario(CONSTANTE_JOAQUÍN,CONSTANTE_FERNANDEZ));
		usuario1.add(new Usuario(CONSTANTE_LAURA,CONSTANTE_BARBERO));
		usuario1.add(new Usuario(CONSTANTE_RUBÉN,CONSTANTE_TOLEDANO));

		for (int i = 0; i < 4; i++) {
			System.out.println(usuario1.get(i));
		}
		
		 Collections.sort(usuario, Collections.reverseOrder(new Comparador()));
		 
	}
}
