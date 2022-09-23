package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrdenarListas {
	
	public static void main(String[] args) {
		
		List<Integer> Numeros;
		
		Numeros = new ArrayList<>();
		
		Numeros.add(1);
		Numeros.add(50);
		Numeros.add(-15);
		
		/*List<String> Nombres;
		Nombres = new ArrayList<>();
		
		Nombres.add("Rubén");
		Nombres.add("Carla");
		Nombres.add("Natalia");
		
		System.out.println(Numeros.get(0)+"  "+Nombres.get(0));
		System.out.println(Numeros.get(1)+"  "+Nombres.get(1));
		System.out.println(Numeros.get(2)+"  "+Nombres.get(2));*/
		
		for(int i=0;i<Numeros.size() ;i++ ) {
			int lista = (int)(Math.random() * Numeros.size());
			System.out.println(Numeros.get(lista));
		}
	}
}
