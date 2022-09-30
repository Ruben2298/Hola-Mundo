package ejercicio12;

import java.util.Comparator;

public class Comparador implements Comparator<Usuario> {

	public int compare(Usuario a, Usuario b) {
		return a.getApellidos().compareTo(b.getApellidos());
	}
	

}