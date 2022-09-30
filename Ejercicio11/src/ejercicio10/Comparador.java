package ejercicio10;

import java.util.Comparator;

public class Comparador implements Comparator<Usuario> {

	public int compare(Usuario a, Usuario b) {
		// TODO Auto-generated method stub
		return a.getApellidos().compareTo(b.getApellidos());
	}

}
